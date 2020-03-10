package visitor;

import ast.expression.*;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statement.*;
import ast.type.*;

public abstract class AbstractVisitor<TP,TR> implements Visitor<TP,TR> {

    @Override
    public TR visit(Program program, TP param) {
        program.getBody().forEach(definition -> definition.accept(this,null));
        return null;
    }

    @Override
    public TR visit(VariableDefinition variableDefinition, TP param) {
        variableDefinition.getType().accept(this, null);
        return null;
    }

    @Override
    public TR visit(FunctionDefinition functionDefinition, TP param) {
        functionDefinition.getType().accept(this, null);
        functionDefinition.getStatements().forEach(
                fd -> fd.accept(this,null));
        return null;
    }

    @Override
    public TR visit(Assignment assignment, TP param) {
        assignment.getLeft().accept(this, null);
        assignment.getRight().accept(this, null);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param) {
        functionInvocation.getFunction().accept(this, null);
        functionInvocation.getParameters().forEach(p -> p.accept(this, null));
        return null;
    }

    @Override
    public TR visit(IfElse ifElse, TP param) {
        ifElse.getCondition().accept(this, null);
        ifElse.getIfBody().forEach(x -> x.accept(this, null));
        ifElse.getElseBody().forEach(x -> x.accept(this, null));
        return null;
    }

    @Override
    public TR visit(Read read, TP param) {
        read.getExpression().accept(this, null);
        return null;
    }

    @Override
    public TR visit(Return returnStatement, TP param) {
        returnStatement.getReturned().accept(this, null);
        return null;
    }

    @Override
    public TR visit(While whileStatement, TP param) {
        whileStatement.getCondition().accept(this, null);
        whileStatement.getBody().forEach(x -> x.accept(this, null));
        return null;
    }

    @Override
    public TR visit(Write write, TP param) {
        write.getExpression().accept(this, null);
        return null;
    }

    @Override
    public TR visit(ArithmeticExpression arithmeticExpression, TP param) {
        arithmeticExpression.getLeft().accept(this, null);
        arithmeticExpression.getRight().accept(this, null);
        return null;
    }

    @Override
    public TR visit(ArrayIndexing arrayIndexing, TP param) {
        arrayIndexing.getIndex().accept(this, null);
        arrayIndexing.getVariable().accept(this, null);
        return null;
    }

    @Override
    public TR visit(Cast cast, TP param) {
        cast.getExpression().accept(this, null);
        cast.getType().accept(this, null);
        return null;
    }

    @Override
    public TR visit(CharacterLiteral characterLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleLiteral doubleLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(FieldAccess fieldAccess, TP param) {
        fieldAccess.getExpression().accept(this, null);
        return null;
    }

    @Override
    public TR visit(LogicalExpression logicalExpression, TP param) {
        logicalExpression.getLeft().accept(this, null);
        logicalExpression.getRight().accept(this, null);
        return null;
    }

    @Override
    public TR visit(UnaryMinus unaryMinus, TP param) {
        unaryMinus.getExpression().accept(this, null);
        return null;
    }

    @Override
    public TR visit(UnaryNot unaryNot, TP param) {
        unaryNot.getExpression().accept(this, null);
        return null;
    }

    @Override
    public TR visit(Variable variable, TP param) {
        return null;
    }

    @Override
    public TR visit(IntegerLiteral integerLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(ArrayType arrayType, TP param) {
        arrayType.getType().accept(this, null);
        return null;
    }

    @Override
    public TR visit(CharacterType characterType, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleType doubleType, TP param) {
        return null;
    }

    @Override
    public TR visit(ErrorType errorType, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionType functionType, TP param) {
        functionType.getReturnType().accept(this, null);
        functionType.getParameters().forEach(p -> p.accept(this, null));
        return null;
    }

    @Override
    public TR visit(IntegerType integerType, TP param) {
        return null;
    }

    @Override
    public TR visit(RecordField recordField, TP param) {
        recordField.getType().accept(this, null);
        return null;
    }

    @Override
    public TR visit(RecordType recordType, TP param) {
        recordType.getFields().forEach(f -> f.accept(this, null));
        return null;
    }

    @Override
    public TR visit(VoidType voidType, TP param) {
        return null;
    }
}
