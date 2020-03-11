package ast.type;

import visitor.Visitor;

public class CharacterType extends AbstractType{

    public CharacterType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "CharacterType{}";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
