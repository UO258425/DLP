package ast.expression;

import ast.AbstractASTNode;

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
}
