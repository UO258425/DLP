package ast.statement;

import ast.AbstractASTNode;
import ast.expression.Expression;
import visitor.Visitor;

public class Return extends AbstractStatement {

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
