package ast.type;

import ast.expression.FieldAccess;
import ast.expression.UnaryMinus;
import ast.expression.UnaryNot;
import ast.statement.FunctionInvocation;
import error.ErrorHandler;
import visitor.Visitor;

import java.lang.reflect.Field;

public class ErrorType extends AbstractType {

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        setMessage(message);
        ErrorHandler.getInstance().addError(this);

    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Error: " +
                "line=" + getLine() +
                ", column=" + getColumn() +
                ", " + message;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public int getNumberOfBytes() {
        throw new IllegalStateException("This type does not have size");
    }

    @Override
    public Type arithmetic(Type t) {
        return this;
    }

    @Override
    public Type logical(Type t) {
        return this;
    }

    @Override
    public Type unaryMinus(UnaryMinus ex) {
        return this;
    }

    @Override
    public Type unaryNot(UnaryNot ex) {
        return this;
    }

    @Override
    public Type squareBrackets(Type t) {
        return this;
    }

    @Override
    public Type dot(String id, FieldAccess fa) {
        return this;
    }

    @Override
    public Type cast(Type t) {
        return this;
    }

    @Override
    public Type parenthesis(Type[] parameterTypes, FunctionInvocation functionInvocation) {
        return this;
    }


}
