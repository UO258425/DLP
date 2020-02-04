package ast.statement;

import ast.AbstractASTNode;
import ast.expression.Expression;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.List;

public class IfElse extends AbstractASTNode implements Statement {

    private Expression condition;
    private List<Statement> ifBody;
    private List<Statement> elseBody;

    public IfElse(int line, int column, Expression condition, List<Statement> ifBody, List<Statement> elseBody) {
        super(line, column);
        setCondition(condition);
        setIfBody(ifBody);
        setElseBody(elseBody);
    }

    public Expression getCondition() {
        return condition;
    }

    private void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<Statement> getIfBody() {
        return new ArrayList<>(ifBody);
    }

    private void setIfBody(List<Statement> ifBody) {
        this.ifBody = new ArrayList<>(ifBody);
    }

    public List<Statement> getElseBody() {
        return new ArrayList<>(elseBody);
    }

    private void setElseBody(List<Statement> elseBody) {
        this.elseBody = new ArrayList<>(elseBody);
    }
}
