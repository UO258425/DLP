package ast.statement;

import ast.AbstractASTNode;
import ast.expression.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Read extends AbstractStatement {

    private Expression expression;

    public Read(int line, int column, Expression expression) {
        super(line, column);
        setExpression(expression);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression =expression;
    }

    @Override
    public String toString() {
        return "Read{" +
                "expression=" + expression +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
