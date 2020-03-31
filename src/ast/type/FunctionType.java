package ast.type;

import ast.program.VariableDefinition;
import ast.statement.FunctionInvocation;
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



    @Override
    public boolean equivalent(Type t) {
        if(t instanceof ArrayType)
            return this.equivalent(((ArrayType) t).getType());
        else if(t instanceof FunctionType)
            return this.equivalent(((FunctionType) t).getReturnType());
        else
            return this.equivalent(t);
    }

    @Override
    public Type parenthesis(Type[] parameterTypes, FunctionInvocation functionInvocation) {
        if(parameters.size() != parameterTypes.length)
            return new ErrorType(functionInvocation.getLine(), functionInvocation.getColumn(), "Parameter number mismatch");
        for(int i = 0; i<parameters.size();i++){
            if(!parameters.get(i).getType().equivalent(parameterTypes[i]))
                return new ErrorType(functionInvocation.getLine(), functionInvocation.getColumn(), "The type of the parameter does not match");
        }
        return returnType;
    }

    @Override
    public int getNumberOfBytes() {
        throw new IllegalStateException("This type does not have size");
    }


}
