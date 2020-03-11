package ast.expression;

import visitor.Visitor;

public class FieldAccess extends AbstractExpression {

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

    @Override
    public String toString() {
        return "FieldAccess{" +
                "expression=" + expression +
                ", fieldName='" + fieldName + '\'' +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
