package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class MultipleAssignment extends AbstractStatement  {

    private List<Expression> lefts = new ArrayList<>();
    private List<Expression> rights = new ArrayList<>();

    public MultipleAssignment(int line, int column) {
        super(line, column);
    }


    public void addLeft(Expression expression){
        lefts.add(expression);
    }

    public void addRight(Expression expression){
        rights.add(expression);
    }

    public List<Expression> getLefts() {
        return lefts;
    }

    public void setLefts(List<Expression> lefts) {
        this.lefts = lefts;
    }

    public List<Expression> getRights() {
        return rights;
    }

    public void setRights(List<Expression> rights) {
        this.rights = rights;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
