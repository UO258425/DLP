package ast.type;

import ast.AbstractASTNode;
import visitor.Visitor;

public class IntegerType extends AbstractType {

    public IntegerType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "IntegerType{}";
    }
    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
