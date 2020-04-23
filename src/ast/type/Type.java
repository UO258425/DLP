package ast.type;

import ast.ASTNode;
import ast.expression.FieldAccess;
import ast.expression.UnaryMinus;
import ast.expression.UnaryNot;
import ast.statement.FunctionInvocation;

public interface Type extends ASTNode {

    boolean isBoolean();
    boolean equivalent(Type type);

    int getNumberOfBytes();

    Type arithmetic(Type type);
    Type cast(Type type);
    Type squareBrackets(Type type);
    Type parenthesis(Type[] parameterTypes, FunctionInvocation functionInvocation);
    Type logical(Type type);
    Type comparison(Type type);
    Type unaryMinus(UnaryMinus unaryMinus);
    Type unaryNot(UnaryNot unaryNot);
    Type dot(String id, FieldAccess fieldAccess);

    String getSuffix();
}
