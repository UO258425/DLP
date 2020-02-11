package ast.expression;

import ast.AbstractASTNode;

public class UnaryMinus extends AbstractASTNode implements  Expression {

    private Expression expression;

    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column);
        setExpression(expression);
    }

    public Expression getExpression() {
        return expression;
    }

    private void setExpression(Expression expression) {
        this.expression = expression;
    }
}
