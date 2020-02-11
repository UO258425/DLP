package ast.type;

import ast.AbstractASTNode;

public class ArrayType extends AbstractASTNode implements Type{

    private Type type;
    private int size;

    public ArrayType(int line, int column, Type type, int size) {
        super(line, column);
        setType(type);
        setSize(size);
    }

    public Type getType() {
        return type;
    }

    private void setType(Type type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }
}
