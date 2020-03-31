package ast.type;

import visitor.Visitor;

public class ArrayType extends AbstractType{

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public boolean equivalent(Type t) {
        if(t instanceof ArrayType)
            return this.getType().equivalent(((ArrayType) t).getType());
        else if(t instanceof FunctionType)
            return this.getType().equivalent(((FunctionType) t).getReturnType());
        else
            return this.getType().equivalent(t);
    }

    @Override
    public Type squareBrackets(Type t) {
        if(t instanceof IntegerType)
            return this.getType();
        else if (t instanceof ErrorType)
            return t;
        else
            return new ErrorType(t.getLine(), t.getColumn(), "Array can only be indexed with an integer");
    }

    @Override
    public int getNumberOfBytes() {
        return type.getNumberOfBytes() * size;
    }
}
