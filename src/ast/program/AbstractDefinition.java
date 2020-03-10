package ast.program;

import ast.AbstractASTNode;
import ast.expression.AbstractExpression;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {


    public AbstractDefinition(int line, int column) {
        super(line, column);
    }
}
