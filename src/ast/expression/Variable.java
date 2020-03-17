package ast.expression;

import ast.program.Definition;
import visitor.Visitor;

public class Variable extends AbstractExpression {

    private String name;
    private Definition definition;

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

    @Override
    public String toString() {
        return "Variable{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    public void setDefinition(Definition definition){
        this.definition = definition;
    }

    public Definition getDefinition(){
        return definition;
    }
}
