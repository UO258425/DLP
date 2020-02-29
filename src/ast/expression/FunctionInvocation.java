package ast.expression;

import ast.AbstractASTNode;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractASTNode implements Expression {

    private Variable variable;
    private List<Expression> parameters;

    public FunctionInvocation(int line, int column, Variable variable, List<Expression> parameters) {
        super(line, column);
        setParameters(parameters);
        setVariable(variable);
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public List<Expression> getParameters() {
        return new ArrayList<Expression>(parameters);
    }

    public void setParameters(List<Expression> parameters) {
        this.parameters = new ArrayList<>(parameters);
    }
}
