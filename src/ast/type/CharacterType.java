package ast.type;

import visitor.Visitor;

public class CharacterType extends AbstractType {

    public CharacterType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "char";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type arithmetic(Type t) {
        if (t instanceof CharacterType)
            return this;
        else if (t instanceof ErrorType)
            return t;
        else
            return new ErrorType(t.getLine(), t.getColumn(), "Incompatible types for arithmetic operation");
    }

    @Override
    public Type logical(Type t) {
        if (t instanceof CharacterType)
            return new IntegerType(t.getLine(), t.getColumn());
        else if (t instanceof ErrorType)
            return t;
        return new ErrorType(t.getLine(), t.getColumn(), "Incompatible types for logical operation");
    }

    @Override
    public Type comparison(Type t) {
        if (t instanceof CharacterType)
            return new IntegerType(this.getLine(), this.getColumn());
        else if (t instanceof ErrorType)
            return t;
        return new ErrorType(t.getLine(), t.getColumn(), "Incompatible types for comparison operation");
    }

    @Override
    public boolean equivalent(Type t) {
        return (t instanceof CharacterType || t instanceof IntegerType || t instanceof DoubleType);
    }

    @Override
    public Type cast(Type t) {
        if (t instanceof CharacterType || t instanceof IntegerType || t instanceof DoubleType)
            return t;
        else if (t instanceof ErrorType)
            return t;
        return new ErrorType(t.getLine(), t.getColumn(), "Can't perform a cast from char to "+t.toString());
    }

    @Override
    public int getNumberOfBytes() {
        return 1;
    }

    @Override
    public String getSuffix() {
        return "b";
    }

    @Override
    public boolean isWritable(){ return true;}
}
