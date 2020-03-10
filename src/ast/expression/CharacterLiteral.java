package ast.expression;

import ast.AbstractASTNode;
import visitor.Visitor;

public class CharacterLiteral extends AbstractExpression{

    private char value;

    public CharacterLiteral(int line, int column, char value) {
        super(line, column);
        setValue(value);
    }

    public char getValue() {
        return value;
    }

    private void setValue(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CharacterLiteral{" +
                "value=" + value +
                '}';
    }
    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
