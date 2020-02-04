package ast.program;

import ast.AbstractASTNode;

import java.util.ArrayList;
import java.util.List;

public class Program  {

    private List<Definition> body;

    public Program(List<Definition> body){
        setBody(body);
    }

    public List<Definition> getBody() {
        return body;
    }

    private void setBody(List<Definition> body) {
        this.body = new ArrayList<>(body);
    }
}
