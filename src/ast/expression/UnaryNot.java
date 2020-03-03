package ast.expression;

import ast.AbstractASTNode;

public class UnaryNot extends AbstractASTNode implements Expression {


    private Expression expression;

    public UnaryNot(int line, int column, Expression expression) {
        super(line, column);
        setExpression(expression);
    }

    public Expression getExpression() {
        return expression;
    }

    private void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "UnaryNot{" +
                "expression=" + expression +
                '}';
    }
}
