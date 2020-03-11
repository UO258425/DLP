package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class While extends AbstractStatement {

    private Expression condition;
    private List<Statement> body = new ArrayList<>();

    public While(int line, int column, Expression condition, List<Statement> body) {
        super(line, column);
        setCondition(condition);
        setBody(body);
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<Statement> getBody() {
        return new ArrayList<>(body);
    }

    public void setBody(List<Statement> body) {
        this.body = new ArrayList<>(body);
    }

    @Override
    public String toString() {
        return "While{" +
                "condition=" + condition +
                ", body=" + body +
                '}';
    }
    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
