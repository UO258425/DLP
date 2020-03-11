package ast.type;

import visitor.Visitor;

public class VoidType extends AbstractType {

    public VoidType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "VoidType{}";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
