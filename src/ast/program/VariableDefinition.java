package ast.program;

import ast.statement.Statement;
import ast.type.Type;
import visitor.Visitor;

public class VariableDefinition extends AbstractDefinition implements Statement {

    private int offset;

    public VariableDefinition(int line, int column, Type type, String name) {
        super(line, column, name, type);
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

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
