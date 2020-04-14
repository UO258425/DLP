package ast.program;

import ast.AbstractASTNode;
import ast.type.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

    protected int scope;
    protected String name;
    protected Type type;


    public AbstractDefinition(int line, int column,String name, Type type) {

        super(line, column);
        setName(name);
        setType(type);
    }

    public int getScope(){
        return scope;
    }

    public void setScope(int scope){
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
