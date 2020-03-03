package ast.expression;

import ast.AbstractASTNode;

public class ArithmeticExpression extends AbstractASTNode implements Expression {

    private String operation;
    private Expression left;
    private Expression right;

    public ArithmeticExpression(int line, int column, String operation, Expression left, Expression right) {
        super(line, column);
        setOperation(operation);
        setLeft(left);
        setRight(right);
    }


    public String getOperation() {
        return operation;
    }

    private void setOperation(String operation) {
        this.operation = operation;
    }

    public Expression getLeft() {
        return left;
    }

    private void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    private void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "ArithmeticExpression{" +
                "operation='" + operation + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
