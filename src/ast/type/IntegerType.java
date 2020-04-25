package ast.type;

import ast.expression.UnaryMinus;
import ast.expression.UnaryNot;
import visitor.Visitor;

public class IntegerType extends AbstractType {

    public IntegerType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "int";
    }
    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type arithmetic(Type t) {
        if(t instanceof IntegerType)
            return this;
        else if(t instanceof ErrorType)
            return t;
        else
            return new ErrorType(t.getLine(), t.getColumn(), "Incompatible types for arithmetic operation");
    }

    @Override
    public Type logical(Type t) {
        if(t instanceof IntegerType)
            return this;
        else if (t instanceof ErrorType)
            return t;
        return new ErrorType(t.getLine(),t.getColumn(), "Incompatible types for logical operation");
    }

    @Override
    public Type comparison(Type t) {
        if (t instanceof IntegerType)
            return this;
        else if (t instanceof ErrorType)
            return t;
        return new ErrorType(t.getLine(), t.getColumn(), "Incompatible types for comparison operation");
    }

    @Override
    public Type unaryMinus(UnaryMinus t) {
        return this;
    }

    @Override
    public Type unaryNot(UnaryNot t) {
        return this;
    }

    @Override
    public Type cast(Type t) {
        if(t instanceof IntegerType || t instanceof DoubleType || t instanceof  CharacterType)
            return t;
        else if(t instanceof ErrorType)
            return t;
        return new ErrorType(getLine(), getColumn(), "Can't perform cast from int to "+t);
    }

    @Override
    public boolean equivalent(Type t) {
        return t instanceof IntegerType;
    }

    @Override
    public int getNumberOfBytes() {
        return 2;
    }

    @Override
    public String getSuffix() {
        return "i";
    }

    @Override
    public boolean isBoolean(){
        return true;
    }

    @Override
    public boolean isWritable(){ return true;}
}
