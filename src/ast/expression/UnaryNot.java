package ast.expression;

import ast.AbstractASTNode;
import visitor.Visitor;

public class UnaryNot extends AbstractExpression {


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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
