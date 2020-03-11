package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

public class Write extends AbstractStatement {

    private Expression expression;

    public Write(int line, int column, Expression expression) {
        super(line, column);
        setExpression(expression);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Write{" +
                "expression=" + expression +
                '}';
    }
    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
