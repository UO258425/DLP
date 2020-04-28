package semantic;

import ast.expression.*;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statement.*;
import ast.type.*;
import visitor.AbstractVisitor;

import java.util.List;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Void> {
    @Override
    public Void visit(Program program, Type param) {
        program.getBody().forEach(definition -> definition.accept(this, param));
        program.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(VariableDefinition variableDefinition, Type param) {
        variableDefinition.getType().accept(this, param);
        variableDefinition.setLvalue(false);
        return null;
    }

    /*
      FunctionDefinition stmt -> functionType id variableDefinitions* statements*
      statements*.forEach(stmt1 -> {if(stmt1 instanceof Return)
         if(stmt.return.type != functionType.type)
             new ErrorType(...) //type mismatch with function signature and return stmt
      })
     */
    @Override
    public Void visit(FunctionDefinition functionDefinition, Type param) {
        functionDefinition.getType().accept(this,  ((FunctionType)functionDefinition.getType()).getReturnType());
        functionDefinition.getStatements().forEach(
                stmt ->stmt.accept(this,((FunctionType)functionDefinition.getType()).getReturnType()));
        functionDefinition.setLvalue(false);
        return null;
    }

    /*
     * assignment stmt -> exp1 exp2
     * if(!exp2.type.equivalent(exp3.type))
         new ErrorType(exp1.getline(), exp1.getColumn() ...)
     */
    @Override
    public Void visit(Assignment assignment, Type param) {
        assignment.getLeft().accept(this, param);
        if (!assignment.getLeft().isLvalue())
            new ErrorType(assignment.getLine(), assignment.getColumn(), "lvalue expected");
        assignment.getRight().accept(this, param);
        assignment.setLvalue(false);

        if (!(assignment.getLeft().getType() instanceof ErrorType) &&
                !(assignment.getRight().getType() instanceof ErrorType)) {
            if (!assignment.getLeft().getType().equivalent(assignment.getRight().getType()))
                new ErrorType(assignment.getLine(), assignment.getColumn(), "Not equivalent types, trying to assign " +
                        assignment.getRight().getType() + " to " + assignment.getLeft().getType());
        }

        return null;
    }

    @Override
    public Void visit(MultipleAssignment multipleAssignment, Type param){
        multipleAssignment.getLefts().forEach(e -> e.accept(this, param));

        multipleAssignment.getLefts().forEach(e ->{
            if(!e.isLvalue())
                new ErrorType(e.getLine(), e.getColumn(), "lvalue expected");
        });

        multipleAssignment.getRights().forEach(e -> e.accept(this, param));
        multipleAssignment.setLvalue(false);

        if(multipleAssignment.getLefts().size() != multipleAssignment.getRights().size()) {
            new ErrorType(multipleAssignment.getLine(), multipleAssignment.getColumn(), "There must be the same number of expression in both sides");
            return null;
        }

        List<Expression> lefts = multipleAssignment.getLefts();
        List<Expression> rights = multipleAssignment.getRights();

        for(int i = 0;i<lefts.size();i++){
            if(!(lefts.get(i).getType() instanceof ErrorType) && !(rights.get(i).getType() instanceof  ErrorType)){
                if(!lefts.get(i).getType().equivalent(rights.get(i).getType()))
                    new ErrorType(rights.get(i).getLine(), rights.get(i).getColumn(), "Not equivalent types, trying to assign "+
                     rights.get(i).getType() +" to "+ lefts.get(i).getType());
            }

        }

        return null;
    }

    /*
     * funcInvocation: exp1 -> exp2 exp3*
     * exp1.type = exp2.type.parenthesis(exp3.stream().map(arg ->arg.type).toArray(Type[]::new),exp1)
     */
    @Override
    public Void visit(FunctionInvocation functionInvocation, Type param) {
        functionInvocation.getFunction().accept(this, param);
        functionInvocation.getParameters().forEach(p -> p.accept(this, param));
        functionInvocation.setLvalue(false);
        functionInvocation.setType(functionInvocation.getFunction().getType().parenthesis(functionInvocation.getParameters().stream().map(Expression::getType).toArray(Type[]::new), functionInvocation));
        return null;
    }

    /*
    ifElse: stm1 -> exp stmt2 stmt3*
    if(!exp.type.isBoolean())
        exp1 = new ErrorType(...
     */
    @Override
    public Void visit(IfElse ifElse, Type param) {
        ifElse.getCondition().accept(this, param);
        ifElse.getIfBody().forEach(x -> x.accept(this, param));
        ifElse.getElseBody().forEach(x -> x.accept(this, param));
        ifElse.setLvalue(false);

        if(!ifElse.getCondition().getType().isBoolean())
            new ErrorType(ifElse.getLine(), ifElse.getColumn(), "Condition of an if must be boolean");
        return null;
    }

    @Override
    public Void visit(Read read, Type param) {
        read.getExpression().accept(this, param);
        if (!read.getExpression().isLvalue())
            new ErrorType(read.getExpression().getLine(), read.getExpression().getColumn(), "lvalue expected");
        read.setLvalue(false);
        return null;
    }

    /*
    return stmt -> exp
    if(stmt.returnType.equivalent(exp.type))
        new ErrorType(stmt, line, stmt.column, "Cannot return that")
     */
    @Override
    public Void visit(Return returnStatement, Type param) {
        returnStatement.getReturned().accept(this, param);
        returnStatement.setLvalue(false);
        if(!returnStatement.getReturned().getType().equivalent(param))
            new ErrorType(returnStatement.getLine(), returnStatement.getColumn(), "The returned type does not match the return type of the function");
        return null;
    }

    /*
     * whilestmt: stm1 -> exp stm2*
        if(!exp.type.isBoolean())
            exp1 = new errorType(exp.line, exp.column, "type not boolean")
     */
    @Override
    public Void visit(While whileStatement, Type param) {
        whileStatement.getCondition().accept(this, param);
        whileStatement.getBody().forEach(x -> x.accept(this, param));
        whileStatement.setLvalue(false);

        if (!whileStatement.getCondition().getType().isBoolean())
            new ErrorType(whileStatement.getLine(), whileStatement.getColumn(), "The condition of the while must be boolean");
        return null;
    }

    @Override
    public Void visit(Write write, Type param) {
        write.getExpression().accept(this, param);
        write.setLvalue(false);
        if(!write.getExpression().getType().isWritable())
            new ErrorType(write.getExpression().getLine(), write.getExpression().getColumn(),
                    "Error: Trying to write a non writable type");
        return null;
    }

    /* arithmetic: exp1 -> exp2 (+|-|/|*|&) exp3
     *exp1.type = exp2.type.arith(exp3.type, exp1)
     */
    @Override
    public Void visit(ArithmeticExpression arithmeticExpression, Type param) {
        arithmeticExpression.getLeft().accept(this, param);
        arithmeticExpression.getRight().accept(this, param);
        arithmeticExpression.setLvalue(false);
        arithmeticExpression.setType(arithmeticExpression.getLeft().getType().arithmetic(arithmeticExpression.getRight().getType()));
        return null;
    }

    /*
     * indexing: exp1 -> exp2 exp3
     * exp1.type = exp2.type.squareBrackets(exp3.type, exp1)
     */
    @Override
    public Void visit(ArrayIndexing arrayIndexing, Type param) {
        arrayIndexing.getIndex().accept(this, param);
        arrayIndexing.getVariable().accept(this, param);
        arrayIndexing.setLvalue(true);
        arrayIndexing.setType(arrayIndexing.getVariable().getType().squareBrackets(arrayIndexing.getIndex().getType()));
        return null;
    }

    /*
    cast exp1 -> type exp2
    exp1.type = exp2.type.cast(type, exp1)
     */
    @Override
    public Void visit(Cast cast, Type param) {
        cast.getExpression().accept(this, param);
        cast.getCastType().accept(this, param);
        cast.setLvalue(false);
        cast.setType(cast.getExpression().getType().cast(cast.getCastType()));
        return null;
    }

    @Override
    public Void visit(CharacterLiteral characterLiteral, Type param) {
        characterLiteral.setLvalue(false);
        characterLiteral.setType(new CharacterType(characterLiteral.getLine(), characterLiteral.getColumn()));
        return null;
    }

    @Override
    public Void visit(DoubleLiteral doubleLiteral, Type param) {
        doubleLiteral.setLvalue(false);
        doubleLiteral.setType(new DoubleType(doubleLiteral.getLine(), doubleLiteral.getColumn()));
        return null;
    }

    /*
        fieldAccess exp1 -> exp2 ID
        exp1.tpe = exp2.type.dot(ID, exp1)
     */
    @Override
    public Void visit(FieldAccess fieldAccess, Type param) {
        fieldAccess.getExpression().accept(this, param);
        fieldAccess.setLvalue(true);
        fieldAccess.setType(fieldAccess.getExpression().getType().dot(fieldAccess.getFieldName(), fieldAccess));
        return null;
    }

    /*
     * comparison: exp1 -> exp2 (&& | || ) exp3
     * exp1.type = exp2.type.comparison(expression3.type, exp1)
     */
    @Override
    public Void visit(ComparisonExpression comparisonExpression, Type param){
        comparisonExpression.getLeft().accept(this, param);
        comparisonExpression.getRight().accept(this, param);
        comparisonExpression.setLvalue(false);
        comparisonExpression.setType(comparisonExpression.getLeft().getType().comparison(comparisonExpression.getRight().getType()));
        return null;
    }

    /*
     * logical: exp1 -> exp2 (> | >= | < | <= | != | == ) exp3
     * exp1.type = exp2.type.comparison(expression3.type, exp1)
     */
    @Override
    public Void visit(LogicalExpression logicalExpression, Type param) {
        logicalExpression.getLeft().accept(this, param);
        logicalExpression.getRight().accept(this, param);
        logicalExpression.setLvalue(false);
        logicalExpression.setType(logicalExpression.getLeft().getType().logical(logicalExpression.getRight().getType()));
        return null;
    }

    /*
        unaryminus exp1 -> exp2
        exp1.type  = exp2-type.not()
    */
    @Override
    public Void visit(UnaryMinus unaryMinus, Type param) {
        unaryMinus.getExpression().accept(this, param);
        unaryMinus.setLvalue(false);
        unaryMinus.setType(unaryMinus.getExpression().getType().unaryMinus(unaryMinus));
        return null;
    }

    /*
    unarynot exp1 -> exp2
    exp1.type  = exp2-type.not()
     */
    @Override
    public Void visit(UnaryNot unaryNot, Type param) {
        unaryNot.getExpression().accept(this, param);
        unaryNot.setLvalue(false);
        unaryNot.setType(unaryNot.getExpression().getType().unaryNot(unaryNot));
        return null;
    }

    @Override
    public Void visit(Variable variable, Type param) {
        variable.setLvalue(true);
        if(variable.getDefinition() == null)
            variable.setType(new ErrorType(variable.getLine(), variable.getColumn(), "The variable is not defined."));
        else
            variable.setType(variable.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(IntegerLiteral integerLiteral, Type param) {
        integerLiteral.setLvalue(false);
        integerLiteral.setType(new IntegerType(integerLiteral.getLine(), integerLiteral.getColumn()));
        return null;
    }

    @Override
    public Void visit(ArrayType arrayType, Type param) {
        arrayType.getType().accept(this, param);
        arrayType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(CharacterType characterType, Type param) {
        characterType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(DoubleType doubleType, Type param) {
        doubleType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(ErrorType errorType, Type param) {
        errorType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Type param) {
        functionType.getReturnType().accept(this, param);
        functionType.getParameters().forEach(p -> p.accept(this, param));
        functionType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(IntegerType integerType, Type param) {
        integerType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(RecordField recordField, Type param) {
        recordField.getType().accept(this, param);
        recordField.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(RecordType recordType, Type param) {
        recordType.getFields().forEach(f -> f.accept(this, param));
        recordType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(VoidType voidType, Type param) {
        voidType.setLvalue(false);
        return null;
    }
}
