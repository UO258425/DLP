package ast.program;

import ast.AbstractASTNode;

public class FunctionDefinition extends AbstractASTNode implements Definition {

    public FunctionDefinition(int line, int column) {
        super(line, column);
    }
}
