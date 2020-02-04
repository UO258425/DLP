package ast.expression;

import ast.AbstractASTNode;

public class Variable extends AbstractASTNode implements Expression {

    private String name;

    public Variable(int line, int column, String name) {
        super(line, column);
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
