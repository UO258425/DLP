package ast.expression;

import ast.ASTNode;
import ast.type.Type;

public interface Expression extends ASTNode {

    Type getType();

    void setType(Type t);

}
