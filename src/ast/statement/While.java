package ast.statement;

import ast.AbstractASTNode;
import ast.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class While extends AbstractASTNode implements Statement {

    private Expression condition;
    private List<Statement> body;

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
}
