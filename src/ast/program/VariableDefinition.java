package ast.program;

import ast.AbstractASTNode;
import ast.type.Type;

public class VariableDefinition extends AbstractASTNode implements Definition {

    private Type type;
    private String name;

    public VariableDefinition(int line, int column) {
        super(line, column);
        setName(name);
        setType(type);
    }

    public Type getType() {
        return type;
    }

    private void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
