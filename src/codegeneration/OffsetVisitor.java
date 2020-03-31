package codegeneration;

import ast.program.FunctionDefinition;
import ast.program.VariableDefinition;
import ast.type.FunctionType;
import ast.type.RecordField;
import ast.type.RecordType;
import ast.type.Type;
import visitor.AbstractVisitor;

import java.util.List;

public class OffsetVisitor extends AbstractVisitor<Void, Void> {

    private int globalOffset = 0;
    private int localOffset = 0;

    public Void visit(VariableDefinition variableDefinition, Void param){
        variableDefinition.getType().accept(this, param);
        if(variableDefinition.getScope()==0){
            variableDefinition.setOffset(globalOffset);
            globalOffset += variableDefinition.getType().getNumberOfBytes();
        }
        else{
            localOffset -= variableDefinition.getType().getNumberOfBytes();
            variableDefinition.setOffset(localOffset);
        }
        return null;
    }

    public Void visit(FunctionDefinition functionDefinition, Void param){
        super.visit(functionDefinition, param);
        localOffset = 0;
        return null;
    }

    public Void visit(RecordType recordType, Void param){
        recordType.getFields().forEach(rf -> rf.accept(this, param));
        int fieldOffset = 0;
        for(RecordField rf : recordType.getFields()){
            rf.setOffset(fieldOffset);
            fieldOffset += rf.getType().getNumberOfBytes();
        }
        return null;
    }

    public Void visit(FunctionType functionType, Void param){
        int paramOffset = 4;
        List<VariableDefinition> parameters = functionType.getParameters();
        for(int i = parameters.size()-1; i>=0; i--){
            parameters.get(i).setOffset(paramOffset);
            paramOffset += parameters.get(i).getType().getNumberOfBytes();
            parameters.get(i).getType().accept(this, null);
        }
        return null;
    }

}
