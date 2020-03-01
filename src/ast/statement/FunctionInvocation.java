package ast.statement;

import ast.AbstractASTNode;
import ast.expression.Expression;
import ast.expression.Variable;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractASTNode implements Statement, Expression {

    private Variable function;
    private List<Expression> parameters;

    public FunctionInvocation(int line, int column, Variable function, List<Expression> parameters) {
        super(line, column);
        setFunction(function);
        setParameters(parameters);
    }

    public Variable getFunction() {
        return function;
    }

    public void setFunction(Variable function) {
        this.function = function;
    }

    public List<Expression> getParameters() {
        return new ArrayList<>(parameters);
    }

    public void setParameters(List<Expression> parameters) {
        this.parameters = new ArrayList<>(parameters);
    }
}
