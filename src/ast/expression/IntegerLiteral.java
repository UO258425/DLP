package ast.expression;

import ast.AbstractASTNode;
import visitor.Visitor;

public class IntegerLiteral extends AbstractASTNode implements Expression {

    private int value;

    public IntegerLiteral(int line, int column, int value) {
        super(line, column);
        setValue(value);
    }

    public int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "IntegerLiteral{" +
                "value=" + value +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
