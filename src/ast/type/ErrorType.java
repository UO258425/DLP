package ast.type;

import ast.AbstractASTNode;

public class ErrorType extends AbstractASTNode implements Type {

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        setMessage(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Error: " +
                "line=" + getLine() +
                ", column=" + getColumn() +
                ", " + message;
    }
}
