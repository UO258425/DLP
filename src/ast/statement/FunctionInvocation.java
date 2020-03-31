package ast.statement;

import ast.expression.Expression;
import ast.expression.Variable;
import ast.type.Type;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractStatement implements Expression {

    private Type type;

    private Variable function;
    private List<Expression> parameters = new ArrayList<>();

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

    @Override
    public String toString() {
        return "FunctionInvocation{" +
                "function=" + function +
                ", parameters=" + parameters +
                '}';
    }
    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type t) {
        this.type = t;
    }
}
