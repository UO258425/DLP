package ast.expression;

import ast.AbstractASTNode;
import ast.type.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    Type type;

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type t) {
        this.type = t;
    }
}
