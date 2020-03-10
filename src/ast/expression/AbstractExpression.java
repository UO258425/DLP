package ast.expression;

import ast.AbstractASTNode;
import visitor.Visitor;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
    public AbstractExpression(int line, int column) {
        super(line, column);
    }


}
