package ast.program;

import ast.statement.Statement;
import ast.type.Type;
import visitor.Visitor;

public class VariableDefinition extends AbstractDefinition implements Statement {

    private Type type;
    private String name;

    public VariableDefinition(int line, int column, Type type, String name) {
        super(line, column);
        setName(name);
        setType(type);
    }

    public Type getType() {
        return type;
    }

    private void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VariableDefinition{" +
                "type=" + type +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
