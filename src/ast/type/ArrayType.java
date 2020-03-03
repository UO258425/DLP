package ast.type;

import ast.AbstractASTNode;

import java.lang.reflect.Array;

public class ArrayType extends AbstractASTNode implements Type{

    private Type type;
    private int size;

    public ArrayType(int line, int column, Type type, int size) {
        super(line, column);
        setType(type);
        setSize(size);
    }

    public static ArrayType createArray(int line, int column, Type type, int size){
        if(type instanceof ArrayType){
            ArrayType array = (ArrayType) type;
            array.setType(createArray(line, column, array.getType(), size));
            return array;
        }
        else return new ArrayType(line, column, type, size);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ArrayType{" +
                "type=" + type +
                ", size=" + size +
                '}';
    }
}
