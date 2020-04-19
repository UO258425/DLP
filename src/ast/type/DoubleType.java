package ast.type;

import ast.expression.UnaryMinus;
import visitor.Visitor;

public class DoubleType extends AbstractType {

    public DoubleType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "double";
    }
    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type arithmetic(Type t) {
        if(t instanceof DoubleType)
            return this;
        else if(t instanceof ErrorType)
            return t;
        else
            return new ErrorType(t.getLine(), t.getColumn(), "Incompatible types for arithmetic operation");
    }

    @Override
    public Type logical(Type t) {
        if(t instanceof DoubleType)
            return new IntegerType(t.getLine(), t.getColumn());
        else if (t instanceof ErrorType)
            return t;
        return new ErrorType(t.getLine(),t.getColumn(), "Incompatible types for logical operation");
    }

    @Override
    public Type unaryMinus(UnaryMinus t) {
        return this;
    }

    @Override
    public Type cast(Type t) {
        return t;
    }

    @Override
    public boolean equivalent(Type t) {
        return t instanceof DoubleType;

    }

    @Override
    public int getNumberOfBytes() {
        return 4;
    }

    @Override
    public String getSuffix() {
        return "f";
    }

}
