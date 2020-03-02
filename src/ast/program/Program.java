package ast.program;

import ast.AbstractASTNode;

import java.util.ArrayList;
import java.util.List;

public class Program  extends AbstractASTNode {

    private List<Definition> body = new ArrayList<>();

    public Program(int line, int column){
        super(line, column);
        setBody(new ArrayList<Definition>());
    }

    public Program(int line, int column, List<Definition> body){
        super(line, column);
        setBody(body);
    }

    public List<Definition> getBody() {
        return body;
    }

    public void setBody(List<Definition> body) {
        this.body = new ArrayList<>(body);
    }
}
