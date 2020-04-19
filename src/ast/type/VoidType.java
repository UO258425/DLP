package ast.type;

import visitor.Visitor;

public class VoidType extends AbstractType {

    public VoidType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "void";
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
    public int getNumberOfBytes() {
        throw new IllegalStateException("This type does not have size");
    }
}
