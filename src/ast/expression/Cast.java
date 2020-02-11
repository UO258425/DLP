package ast.expression;

import ast.AbstractASTNode;
import ast.type.Type;

public class Cast extends AbstractASTNode implements Expression {

    private Type type;
    private Expression expression;

    public Cast(int line, int column, Type type, Expression expression) {
        super(line, column);
        setExpression(expression);
        setType(type);
    }

    public Type getType() {
        return type;
    }

    private void setType(Type type) {
        this.type = type;
    }

    public Expression getExpression() {
        return expression;
    }

    private void setExpression(Expression expression) {
        this.expression = expression;
    }
}
