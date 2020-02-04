package ast.program;

import ast.AbstractASTNode;

public class VariableDefinition extends AbstractASTNode implements Definition {

    public VariableDefinition(int line, int column) {
        super(line, column);
    }
}
