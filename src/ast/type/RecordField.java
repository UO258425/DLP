package ast.type;

import ast.AbstractASTNode;

public class RecordField extends AbstractASTNode {

    private String name;
    private Type type;

    public RecordField(int line, int column, String name, Type type) {
        super(line, column);
        setName(name);
        setType(type);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    private void setType(Type type) {
        this.type = type;
    }
}
