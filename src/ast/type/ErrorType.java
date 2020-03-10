package ast.type;

import ast.AbstractASTNode;
import error.ErrorHandler;
import visitor.Visitor;

public class ErrorType extends AbstractType {

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        setMessage(message);
        ErrorHandler.getInstance().addError(this);

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
