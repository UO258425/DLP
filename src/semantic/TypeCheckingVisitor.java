package semantic;

import ast.expression.*;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statement.*;
import ast.type.*;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {
    @Override
    public Void visit(Program program, Void param) {
        program.getBody().forEach(definition -> definition.accept(this,null));
        program.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(VariableDefinition variableDefinition, Void param) {
        variableDefinition.getType().accept(this, null);
        variableDefinition.setLvalue(false);
        return null;
    }
    
    @Override
    public Void visit(FunctionDefinition functionDefinition, Void param) {
        functionDefinition.getType().accept(this, null);
        functionDefinition.getStatements().forEach(
                fd -> fd.accept(this,null));
        functionDefinition.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Assignment assignment, Void param) {
        assignment.getLeft().accept(this, null);
        assignment.getRight().accept(this, null);
        assignment.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.getFunction().accept(this, null);
        functionInvocation.getParameters().forEach(p -> p.accept(this, null));
        functionInvocation.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        ifElse.getCondition().accept(this, null);
        ifElse.getIfBody().forEach(x -> x.accept(this, null));
        ifElse.getElseBody().forEach(x -> x.accept(this, null));
        ifElse.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Read read, Void param) {
        read.getExpression().accept(this, null);
        read.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Return returnStatement, Void param) {
        returnStatement.getReturned().accept(this, null);
        returnStatement.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(While whileStatement, Void param) {
        whileStatement.getCondition().accept(this, null);
        whileStatement.getBody().forEach(x -> x.accept(this, null));
        whileStatement.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Write write, Void param) {
        write.getExpression().accept(this, null);
        write.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(ArithmeticExpression arithmeticExpression, Void param) {
        arithmeticExpression.getLeft().accept(this, null);
        arithmeticExpression.getRight().accept(this, null);
        arithmeticExpression.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(ArrayIndexing arrayIndexing, Void param) {
        arrayIndexing.getIndex().accept(this, null);
        arrayIndexing.getVariable().accept(this, null);
        arrayIndexing.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        cast.getExpression().accept(this, null);
        cast.getType().accept(this, null);
        cast.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(CharacterLiteral characterLiteral, Void param) {
        characterLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(DoubleLiteral doubleLiteral, Void param) {
        doubleLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.getExpression().accept(this, null);
        fieldAccess.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(LogicalExpression logicalExpression, Void param) {
        logicalExpression.getLeft().accept(this, null);
        logicalExpression.getRight().accept(this, null);
        logicalExpression.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        unaryMinus.getExpression().accept(this, null);
        unaryMinus.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(UnaryNot unaryNot, Void param) {
        unaryNot.getExpression().accept(this, null);
        unaryNot.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        variable.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(IntegerLiteral integerLiteral, Void param) {
        integerLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(ArrayType arrayType, Void param) {
        arrayType.getType().accept(this, null);
        arrayType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(CharacterType characterType, Void param) {
        characterType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(DoubleType doubleType, Void param) {
        doubleType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(ErrorType errorType, Void param) {
        errorType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Void param) {
        functionType.getReturnType().accept(this, null);
        functionType.getParameters().forEach(p -> p.accept(this, null));
        functionType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(IntegerType integerType, Void param) {
        integerType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(RecordField recordField, Void param) {
        recordField.getType().accept(this, null);
        recordField.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(RecordType recordType, Void param) {
        recordType.getFields().forEach(f -> f.accept(this, null));
        recordType.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(VoidType voidType, Void param) {
        voidType.setLvalue(false);
        return null;
    }
}
