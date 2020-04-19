package codegeneration;

import ast.expression.*;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statement.*;
import ast.type.*;
import visitor.Visitor;

public class AbstractCGVisitor<TP, TR> implements Visitor<TP, TR> {
    @Override
    public TR visit(Program program, TP param) {
        throw new IllegalStateException(program.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(VariableDefinition variableDefinition, TP param) {
        throw new IllegalStateException(variableDefinition.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(FunctionDefinition functionDefinition, TP param) {
        throw new IllegalStateException(functionDefinition.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(Assignment assignment, TP param) {
        throw new IllegalStateException(assignment.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param) {
        throw new IllegalStateException(functionInvocation.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(IfElse ifElse, TP param) {
        throw new IllegalStateException(ifElse.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(Read read, TP param) {
        throw new IllegalStateException(read.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(Return returnStatement, TP param) {
        throw new IllegalStateException(returnStatement.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(While whileStatement, TP param) {
        throw new IllegalStateException(whileStatement.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(Write write, TP param) {
        throw new IllegalStateException(write.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(ArithmeticExpression arithmeticExpression, TP param) {
        throw new IllegalStateException(arithmeticExpression.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(ArrayIndexing arrayIndexing, TP param) {
        throw new IllegalStateException(arrayIndexing.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(Cast cast, TP param) {
        throw new IllegalStateException(cast.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(CharacterLiteral characterLiteral, TP param) {
        throw new IllegalStateException(characterLiteral.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(DoubleLiteral doubleLiteral, TP param) {
        throw new IllegalStateException(doubleLiteral.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(FieldAccess fieldAccess, TP param) {
        throw new IllegalStateException(fieldAccess.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(LogicalExpression logicalExpression, TP param) {
        throw new IllegalStateException(logicalExpression.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(UnaryMinus unaryMinus, TP param) {
        throw new IllegalStateException(unaryMinus.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(UnaryNot unaryNot, TP param) {
        throw new IllegalStateException(unaryNot.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(Variable variable, TP param) {
        throw new IllegalStateException(variable.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(IntegerLiteral integerLiteral, TP param) {
        throw new IllegalStateException(integerLiteral.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(ArrayType arrayType, TP param) {
        throw new IllegalStateException(arrayType.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(CharacterType characterType, TP param) {
        throw new IllegalStateException(characterType.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(DoubleType doubleType, TP param) {
        throw new IllegalStateException(doubleType.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(ErrorType errorType, TP param) {
        throw new IllegalStateException(errorType.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(FunctionType functionType, TP param) {
        throw new IllegalStateException(functionType.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(IntegerType integerType, TP param) {
        throw new IllegalStateException(integerType.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(RecordField recordField, TP param) {
        throw new IllegalStateException(recordField.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(RecordType recordType, TP param) {
        throw new IllegalStateException(recordType.getClass().getName()+" not implemented for " + this.getClass().getName());
    }

    @Override
    public TR visit(VoidType voidType, TP param) {
        throw new IllegalStateException(voidType.getClass().getName()+" not implemented for " + this.getClass().getName());
    }
}
