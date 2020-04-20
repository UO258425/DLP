package codegeneration;

import ast.program.Definition;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statement.Assignment;
import ast.statement.Read;
import ast.statement.Statement;
import ast.statement.Write;
import ast.type.FunctionType;
import ast.type.VoidType;

import java.util.List;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {

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
    public Void visit(Assignment assignment, Void param) {
        cg.comment("Assignment");
        assignment.getLeft().accept(addressCGVisitor, null);
        assignment.getRight().accept(valueCGVisitor, null);
        cg.store(assignment.getRight().getType().getSuffix());

        return null;
    }

    /*
    execute[[write: stmt1 -> expression]] =
        address[[expression]]
        <load>expression.type.suffix
        <out>expression.type.suffix
    */
    @Override
    public Void visit(Write write, Void param) {
        cg.comment("Write");
        write.getExpression().accept(addressCGVisitor, null);
        cg.load(write.getExpression().getType().getSuffix());
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
    public Void visit(Read read, Void param) {
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
    public Void visit(Program program, Void param) {
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
    public Void visit(VariableDefinition variableDefinition, Void param) {
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

        statement*.foreach(stmt -> execute[[stmt]])

        int bytesParams = type.parameters.stream().mapToInt(
                    param -> param.type.numberOfBytes()).sum();
        int bytesReturn = type.returnType.numberOfBytes();
        if(bytesReturn==0)
            <ret> bytesReturn, bytesLocals, bytesParams
    */
    @Override
    public Void visit(FunctionDefinition functionDefinition, Void param) {
        cg.lineComment(functionDefinition.getLine());
        cg.functionLabel(functionDefinition.getName());

        cg.comment("Parameters");
        FunctionType functionType = (FunctionType) functionDefinition.getType();
        functionType.accept(this, null);

        cg.comment("Local variables");
        for (Statement st : functionDefinition.getStatements())
            if (st instanceof VariableDefinition)
                st.accept(this, param);

        int bytesLocalVariables = getBytesLocalVariables(functionDefinition.getStatements());
        cg.enter(bytesLocalVariables);
        for (Statement st : functionDefinition.getStatements()){
            if (!(st instanceof VariableDefinition)) {
                cg.lineComment(st.getLine());
                st.accept(this, param);
            }
        }

        int bytesParameters = getBytesParameters(functionType.getParameters());
        if(functionType.getReturnType() instanceof VoidType)
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
                .filter( st -> st instanceof VariableDefinition)
                .map(vd -> ((VariableDefinition) vd).getType().getNumberOfBytes())
                .mapToInt(Integer::intValue)
                .sum()+2;
    }

    /*
    execute[[FunctionType: type -> type VariableDefinition*]] =
            VariableDefinition*.foreach(vd ->
                < ' *> vd.type.toString vd.ID <(offset > vd.definition.offset<)>
             )
    */
    @Override
    public Void visit(FunctionType functionType, Void param) {
        for(VariableDefinition vd : functionType.getParameters())
            cg.commentVariable(vd.getType(), vd.getName(), vd.getOffset());
        return null;
    }

    /*
    execute[[ForStatement: stmt1 -> stmt2 expression stmt3 stmt4]]=
        int labelNumber = cg.getLabels(2)
        execute[[stmt2]]
        <label> labelNumber<:>
        value[[expression]]
        <jnz label> labelNumber+1
        stmt4*.foreach(stmt -> execute[[stmt]])
        execute[[stmt3]]
        <jmp label> labelNumber
        <label> labelNumber+1 <:>
    */

}
