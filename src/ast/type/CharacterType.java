package ast.type;

import ast.AbstractASTNode;

public class CharacterType extends AbstractASTNode implements Type{

    public CharacterType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "CharacterType{}";
    }
}
