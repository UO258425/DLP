package ast;

import visitor.Visitor;

public interface ASTNode {

    int getLine();

    int getColumn();

    void setLine(int line);

    void setColumn(int column);

    <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param);

}
