package ast.program;

import ast.ASTNode;
import ast.type.Type;

public interface Definition extends ASTNode {

    String getName();
    int getScope();
    void setScope(int scope);
    Type getType();
    void setType(Type type);
}
