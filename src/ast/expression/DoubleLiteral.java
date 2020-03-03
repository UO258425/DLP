package ast.expression;

import ast.AbstractASTNode;

public class DoubleLiteral extends AbstractASTNode implements Expression {

    private double value;

    public DoubleLiteral(int line, int column, double value) {
        super(line, column);
        setValue(value);
    }

    public double getValue() {
        return value;
    }

    private void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DoubleLiteral{" +
                "value=" + value +
                '}';
    }
}
