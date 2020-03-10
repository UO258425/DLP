package ast.expression;

import ast.AbstractASTNode;
import visitor.Visitor;

public class ArrayIndexing extends AbstractExpression {

    private Expression variable;
    private Expression index;

    public ArrayIndexing(int line, int column, Expression variable, Expression index) {
        super(line, column);
        setVariable(variable);
        setIndex(index);
    }


    public Expression getVariable() {
        return variable;
    }

    private void setVariable(Expression variable) {
        this.variable = variable;
    }

    public Expression getIndex() {
        return index;
    }

    private void setIndex(Expression index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "ArrayIndexing{" +
                "variable=" + variable +
                ", index=" + index +
                '}';
    }
    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
