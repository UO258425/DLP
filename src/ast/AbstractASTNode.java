package ast;

public abstract class AbstractASTNode implements ASTNode {

    private int line;
    private int column;

    public AbstractASTNode(int line, int column){
        setLine(line);
        setColumn(column);

    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    @Override
    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public void setColumn(int column) {
        this.column = column;
    }
}
