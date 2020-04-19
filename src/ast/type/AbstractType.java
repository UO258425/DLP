package ast.type;

import ast.AbstractASTNode;
import ast.expression.FieldAccess;
import ast.expression.UnaryMinus;
import ast.expression.UnaryNot;
import ast.statement.FunctionInvocation;

public abstract class AbstractType extends AbstractASTNode implements Type {
    public AbstractType(int line, int column) {
        super(line, column);
    }

    public boolean isBoolean() {
        return false;
    }

    public boolean equivalent(Type t) {
        return false;
    }


    public Type arithmetic(Type t) {
        return new ErrorType(t.getLine(), t.getColumn(), "Incompatible types for arithmetic operation");
    }

    public Type cast(Type t) {
        return new ErrorType(t.getLine(), t.getColumn(), "Incompatible types for cast operation");
    }

    public Type squareBrackets(Type t) {
        return new ErrorType(t.getLine(), t.getColumn(), "Square brackets cannot be applied to something other than array");
    }

    public Type parenthesis(Type[] parameterTypes, FunctionInvocation functionInvocation) {
        return new ErrorType(functionInvocation.getLine(), functionInvocation.getColumn(), "Not an invocable function");
    }

    public Type logical(Type t) {
        return new ErrorType(t.getLine(), t.getColumn(), "Incompatible types for logical operation");
    }

    public Type unaryMinus(UnaryMinus t) {
        return new ErrorType(t.getLine(), t.getColumn(), "Cant perform minus operation");
    }

    public Type unaryNot(UnaryNot t) {
        return new ErrorType(t.getLine(), t.getColumn(), "Cant perform negation operation");
    }

    public Type dot(String id, FieldAccess fieldAccess) {
        return new ErrorType(fieldAccess.getLine(), fieldAccess.getColumn(), "Cant access field");
    }

    public  String getSuffix(){
        return "";
    }
}
