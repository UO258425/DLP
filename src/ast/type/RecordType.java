package ast.type;

import ast.AbstractASTNode;

import java.util.ArrayList;
import java.util.List;

public class RecordType extends AbstractASTNode implements Type{

    private List<RecordField> fields = new ArrayList<>();

    public RecordType(int line, int column, List<RecordField> fields) {
        super(line, column);
        setFields(fields);

    }

    public List<RecordField> getFields() {
        return new ArrayList<RecordField>(fields);
    }

    public void setFields(List<RecordField> fields) {
        this.fields = new ArrayList<RecordField>(fields);
    }
}
