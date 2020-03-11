package ast;

public abstract class AbstractASTNode implements ASTNode {

    private int line;
    private int column;
    private boolean lvalue;

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

    @Override
    public boolean isLvalue() {
        return lvalue;
    }

    @Override
    public void setLvalue(boolean lvalue) {
        this.lvalue = lvalue;
    }
}
