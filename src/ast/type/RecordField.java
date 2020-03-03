package ast.type;

import ast.AbstractASTNode;

public class RecordField extends AbstractASTNode {

    private String name;
    private Type type;

    public RecordField(int line, int column, Type type, String name) {
        super(line, column);
        setName(name);
        setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "RecordField{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
