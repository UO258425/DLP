package ast.type;

import ast.AbstractASTNode;
import ast.program.VariableDefinition;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType {

    private Type returnType;
    private List<VariableDefinition> parameters = new ArrayList<>();


    public FunctionType(int line, int column, Type returnType, List<VariableDefinition> parameters) {
        super(line, column);
        setReturnType(returnType);
        setParameters(parameters);
    }

    public FunctionType(int line, int column, Type returnType) {
        super(line, column);
        setReturnType(returnType);
        setParameters(new ArrayList<>());
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

    @Override
    public String toString() {
        return "FunctionType{" +
                "returnType=" + returnType +
                ", parameters=" + parameters +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
