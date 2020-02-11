package ast.type;

import ast.AbstractASTNode;

public class IntegerType extends AbstractASTNode implements Type {

    public IntegerType(int line, int column) {
        super(line, column);
    }
}
