package ast.program;

import ast.AbstractASTNode;
import ast.statement.Statement;
import ast.type.Type;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractASTNode implements Definition {

    private Type type;
    private String name;
    private List<Statement> statements;

    public FunctionDefinition(int line, int column, List<Statement> statements, Type type, String name) {
        super(line, column);
        setStatements(statements);
        setType(type);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Statement> getStatements() {
        return new ArrayList<>(statements);
    }

    public void setStatements(List<Statement> statements) {
        this.statements = new ArrayList<>(statements);
    }
}
