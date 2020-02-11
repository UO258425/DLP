package ast.statement;

import ast.AbstractASTNode;
import ast.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class Write extends AbstractASTNode implements Statement {

    private List<Expression> expressions;

    public Write(int line, int column, List<Expression> expressions) {
        super(line, column);
        setExpressions(expressions);
    }

    public List<Expression> getExpressions() {
        return new ArrayList<>(expressions);
    }

    private void setExpressions(List<Expression> expressions) {
        this.expressions = new ArrayList<>(expressions);
    }
}
