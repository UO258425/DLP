package ast;

public interface ASTNode {

    int getLine();

    int getColumn();

    void setLine(int line);

    void setColumn(int column);

}
