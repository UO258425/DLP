package ast.type;

import ast.AbstractASTNode;
import ast.program.VariableDefinition;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractASTNode implements Type {

    private Type returnType;
    private List<VariableDefinition> parameters;


    public FunctionType(int line, int column, Type returnType, List<VariableDefinition> parameters) {
        super(line, column);
        setReturnType(returnType);
        setParameters(parameters);
    }

    public Type getReturnType() {
        return returnType;
    }

    private void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public List<VariableDefinition> getParameters() {
        return new ArrayList<>(parameters);
    }

    private void setParameters(List<VariableDefinition> parameters) {
        this.parameters = new ArrayList<>(parameters);
    }
}
