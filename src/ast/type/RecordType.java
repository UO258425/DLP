package ast.type;

import ast.expression.FieldAccess;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
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
        StringBuilder str = new StringBuilder();
        str.append("record(");
        for(RecordField rf : fields){
            str.append("("+rf.getName()+" x "+rf.getType()+")x");
        }


        str.delete(str.length()-1,str.length());
        str.append(")");
        return str.toString();
    }



    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type dot(String id, FieldAccess fieldAccess) {
        for(RecordField r : getFields()){
            if(r.getName().equals(id))
                return r.getType();
        }
        return new ErrorType(fieldAccess.getLine(), fieldAccess.getColumn(), "There is no field with that id");
    }

    /*
    @Override
    public boolean equivalent(Type t) {
        if(t instanceof ArrayType)
            return this.equivalent(((ArrayType) t).getType());
        else if(t instanceof FunctionType)
            return this.equivalent(((FunctionType) t).getReturnType());
        else
            return this.equivalent(t);
    }
    */

    @Override
    public int getNumberOfBytes() {
        int total = 0;
        for(RecordField rf : getFields()){
            total += rf.getType().getNumberOfBytes();
        }
        return total;
    }

    public RecordField getField(String fieldName) {
        return fields.stream()
                .filter(f -> f.getName().equals(fieldName))
                .findFirst()
                .get();
    }
}
