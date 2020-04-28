package codegeneration;

import ast.expression.Expression;
import ast.program.Definition;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statement.*;
import ast.type.FunctionType;
import ast.type.VoidType;

import java.util.List;

public class ExecuteCGVisitor extends AbstractCGVisitor<int[], Void> {

    private CodeGenerator cg;

    private AddressCGVisitor addressCGVisitor;
    private ValueCGVisitor valueCGVisitor;

    public ExecuteCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor) {
        this.valueCGVisitor = valueCGVisitor;
    }

    /*
    execute[[Assignment: stmt -> expression1 expression2]] =
        address[[expresssion1]]
        value[[expression2]]
        <store>expression2.type.suffix
    */
    @Override
    public Void visit(Assignment assignment, int[] param) {
        cg.comment("Assignment");
        assignment.getLeft().accept(addressCGVisitor, null);
        assignment.getRight().accept(valueCGVisitor, null);
        cg.store(assignment.getRight().getType().getSuffix());

        return null;
    }

    @Override
    public Void visit(MultipleAssignment multipleAssignment, int[] param){
        List<Expression> lefts = multipleAssignment.getLefts();
        List<Expression> rights = multipleAssignment.getRights();

        for(int i = 0;i<lefts.size();i++){
            cg.comment("Assignment");
            lefts.get(i).accept(addressCGVisitor, null);
            rights.get(i).accept(valueCGVisitor, null);
            cg.store(rights.get(i).getType().getSuffix());
        }
        return null;
    }



    /*
    execute[[write: stmt1 -> expression]] =
        address[[expression]]
        <load>expression.type.suffix
        <out>expression.type.suffix
    */
    @Override
    public Void visit(Write write, int[] param) {
        cg.comment("Write");
        write.getExpression().accept(valueCGVisitor, null);
        //cg.load(write.getExpression().getType().getSuffix());
        cg.out(write.getExpression().getType().getSuffix());
        return null;
    }

    /*
    execute[[Read: stmt1 -> expression]] =
        address[[expression]]
        <in>expression.type.suffix
        <store>expression.type.suffix
    */
    @Override
    public Void visit(Read read, int[] param) {
        cg.comment("Read");
        read.getExpression().accept(addressCGVisitor, null);
        cg.in(read.getExpression().getType().getSuffix());
        cg.store(read.getExpression().getType().getSuffix());
        return null;
    }

    /*
    execute[[Program: stmt -> definition*]] =
        definition*.foreach(def ->
            if(def instanceof VariableDefinition)
                execute[[def]])
        <call> main
        <halt>
        definition*.foreach(def ->
            if(def instanceof FunctionDefinition)
                execute[[def]])
    */
    @Override
    public Void visit(Program program, int[] param) {
        for (Definition definition : program.getBody()) {
            if (definition instanceof VariableDefinition)
                definition.accept(this, param);
        }
        cg.mainInvocation();
        for (Definition definition : program.getBody()) {
            if (definition instanceof FunctionDefinition)
                definition.accept(this, param);
        }
        return null;
    }


    /*
    execute[[variableDefinition: definition -> type ID]] =
        <' *> type.toString ID <(offset > definition.offset<)>
    */
    @Override
    public Void visit(VariableDefinition variableDefinition, int[] param) {
        cg.commentVariable(variableDefinition.getType(), variableDefinition.getName(), variableDefinition.getOffset());
        return null;
    }

    /*
    execute[[FunctionDefinition: functionDefinition -> type ID statement*]] =
        ID <:>
        execute[[type]]
        for(Statement st : statements^*){
            if(st instanceof variableDefinitions)
        }
        int bytesLocals = -variableDefinition*.get(variableDefinition*.size()-1).offset)
        <enter> bytesLocals

        statement*.foreach(stmt -> execute[[stmt]]())

        int bytesParams = type.parameters.stream().mapToInt(
                    param -> param.type.numberOfBytes()).sum();
        int bytesReturn = type.returnType.numberOfBytes();
        if(bytesReturn==0)
            <ret> bytesReturn, bytesLocals, bytesParams
    */
    @Override
    public Void visit(FunctionDefinition functionDefinition, int[] param) {
        cg.lineComment(functionDefinition.getLine());
        cg.functionLabel(functionDefinition.getName());

        cg.comment("Parameters");
        FunctionType functionType = (FunctionType) functionDefinition.getType();
        functionType.accept(this, param);

        cg.comment("Local variables");
        for (Statement st : functionDefinition.getStatements())
            if (st instanceof VariableDefinition)
                st.accept(this, param);

        int bytesLocalVariables = getBytesLocalVariables(functionDefinition.getStatements());
        int bytesParameters = getBytesParameters(functionType.getParameters());

        cg.enter(bytesLocalVariables);

        int[] retParams={};
        if(!(functionType.getReturnType() instanceof VoidType))
            retParams = new int[]{functionType.getReturnType().getNumberOfBytes(), bytesLocalVariables, bytesParameters};

        for (Statement st : functionDefinition.getStatements()) {
            if (!(st instanceof VariableDefinition)) {
                cg.lineComment(st.getLine());
                st.accept(this, retParams);
            }
        }
        if (functionType.getReturnType() instanceof VoidType)
            cg.ret(0, bytesLocalVariables, bytesParameters);
        return null;
    }


    private int getBytesParameters(List<VariableDefinition> parameters) {
        return parameters.stream()
                .map(param -> param.getType().getNumberOfBytes())
                .mapToInt(Integer::intValue)
                .sum();
    }

    private int getBytesLocalVariables(List<Statement> statements) {
        return statements.stream()
                .filter(st -> st instanceof VariableDefinition)
                .map(vd -> ((VariableDefinition) vd).getType().getNumberOfBytes())
                .mapToInt(Integer::intValue)
                .sum() ;
    }

    /*
    execute[[FunctionType: type -> type VariableDefinition*]] =
            VariableDefinition*.foreach(vd ->
                < ' *> vd.type.toString vd.ID <(offset > vd.definition.offset<)>
             )
    */
    @Override
    public Void visit(FunctionType functionType, int[] param) {
        for (VariableDefinition vd : functionType.getParameters())
            cg.commentVariable(vd.getType(), vd.getName(), vd.getOffset());
        return null;
    }


    /*
    execute[[Return: stmt -> expression]](int BytesReturn, int bytesLocals, intBytesParams)=
        value[[expression]]

        int bytesParams = type.parameters.stream().mapToInt(
                    param -> param.type.numberOfBytes()).sum();
        int bytesLocals = -variableDefinition.get(variableDefinition.size()-1).offset)

        int bytesReturn = expression.type.numberOfBytes();

        <ret> bytesReturn, bytesLocals, bytesParams
    */
    @Override
    public Void visit(Return aReturn, int[] param) {
        cg.comment("Return");
        aReturn.getReturned().accept(valueCGVisitor, null);
        cg.ret(param[0], param[1], param[2]);
        return null;
    }

    /*
    execute[[While: stmt -> expression statements*]]=
        int labels = cg.getLabels()
        <label> cg.getLabel() :>
        value[[expression]]
        <jz label2>
        statements*.foreach( st -> execute[[st]])
        <jmp label1>
        <label2:>
    */
    @Override
    public Void visit(While aWhile, int[] param) {
        cg.comment("While");
        int labelNumber = cg.getLabels(2);
        cg.label(labelNumber);
        aWhile.getCondition().accept(valueCGVisitor, null);
        cg.jz(labelNumber + 1);
        cg.comment("Body of the while statement");
        aWhile.getBody().forEach(st -> {
            if (!(st instanceof VariableDefinition))
                cg.lineComment(st.getLine());
            st.accept(this, param);
        });
        cg.jmp(labelNumber);
        cg.label(labelNumber + 1);
        return null;

    }

    /*
    execute[[IfElse: stmt -> expression1 statements1* statements2*]]=
        value[[expression1]]
        <jz labelElse>
        statements1*.foreach(st -> execute[[st]])
        <jmp LabelEnd>
        <labelElse:>
        statements2*.foreach(st -> execute[[st]])
        <LabelEnd:>
    */
    @Override
    public Void visit(IfElse ifElse, int[] param) {
        cg.comment("If statement");
        int labelNumber = cg.getLabels(2);
        ifElse.getCondition().accept(valueCGVisitor, null);
        cg.jz(labelNumber);
        cg.comment("Body of the if branch");
        ifElse.getIfBody().forEach(st -> {
            if (!(st instanceof VariableDefinition))
                cg.lineComment(st.getLine());
            st.accept(this, param);
        });
        cg.jmp(labelNumber + 1);
        cg.label(labelNumber);
        cg.comment("Body of the else branch");
        ifElse.getElseBody().forEach(st -> {
            if (!(st instanceof VariableDefinition))
                cg.lineComment(st.getLine());
            st.accept(this, param);
        });
        cg.label(labelNumber + 1);
        return null;
    }

    /*
     Execute[[FunctionInvocation: stmt -> ID expressions* ]]=
         value[[expression]]
        if (!(stmt.type instanceof VoidType))
            <pop> stmt.type.suffix
    */
    @Override
    public Void visit(FunctionInvocation functionInvocation, int[] param) {
        functionInvocation.accept(valueCGVisitor, null);
        if (!(functionInvocation.getType() instanceof VoidType))
            cg.pop(functionInvocation.getType().getSuffix());
        return null;
    }

}
