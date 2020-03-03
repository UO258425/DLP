package ast.type;

import ast.AbstractASTNode;
import error.ErrorHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RecordType extends AbstractASTNode implements Type {

    private List<RecordField> fields = new ArrayList<>();

    public RecordType(int line, int column, List<RecordField> fields) {
        super(line, column);
        setFields(fields);
        checkErrors();

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

    private void checkErrors() {
        for (int i = 0; i <= fields.size() - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (fields.get(i).getName().equals(fields.get(j).getName()))
                    ErrorHandler.getInstance().addError(new ErrorType(fields.get(i).getLine(),
                            fields.get(i).getColumn(), "duplicated field: \"" + fields.get(i).getName() + "\""));
            }
        }
    }


}
