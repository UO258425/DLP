package ast.expression;

import ast.AbstractASTNode;

public class FieldAccess extends AbstractASTNode implements Expression {

    private Expression expression;
    private String fieldName;

    public FieldAccess(int line, int column, Expression expression, String fieldName) {
        super(line, column);
        setExpression(expression);
        setFieldName(fieldName);
    }

    public Expression getExpression() {
        return expression;
    }

    private void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getFieldName() {
        return fieldName;
    }

    private void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
