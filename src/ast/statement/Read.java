package ast.statement;

import ast.AbstractASTNode;
import ast.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class Read extends AbstractASTNode implements Statement {

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
}
