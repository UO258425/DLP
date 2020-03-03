package ast.statement;

import ast.AbstractASTNode;
import ast.expression.Expression;

public class Return extends AbstractASTNode implements Statement {

    private Expression returned;

    public Return(int line, int column, Expression returned) {
        super(line, column);
        setReturned(returned);
    }

    public Expression getReturned() {
        return returned;
    }

    private void setReturned(Expression returned) {
        this.returned = returned;
    }

    @Override
    public String toString() {
        return "Return{" +
                "returned=" + returned +
                '}';
    }
}
