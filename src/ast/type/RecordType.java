package ast.type;

import ast.AbstractASTNode;
import error.ErrorHandler;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RecordType extends AbstractType {

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

    @Override
    public String toString() {
        return "RecordType{" +
                "fields=" + fields +
                '}';
    }



    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }


}
