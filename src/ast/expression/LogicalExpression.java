package ast.expression;

import ast.AbstractASTNode;
import visitor.Visitor;

public class LogicalExpression extends AbstractExpression{
    private String operation;
    private Expression left;
    private Expression right;

    public LogicalExpression(int line, int column, String operation, Expression left, Expression right) {
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
        return "LogicalExpression{" +
                "operation='" + operation + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
