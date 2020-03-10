package ast.statement;

import ast.AbstractASTNode;
import ast.expression.Expression;
import visitor.Visitor;


public class Assignment extends AbstractStatement {

    private Expression left;
    private Expression right;

    public Assignment(int line, int column, Expression left, Expression right) {
        super(line, column);
        setLeft(left);
        setRight(right);
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
