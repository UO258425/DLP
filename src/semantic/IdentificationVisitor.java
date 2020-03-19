package semantic;

import ast.expression.Variable;
import ast.program.FunctionDefinition;
import ast.program.VariableDefinition;
import ast.type.ErrorType;
import ast.type.RecordField;
import ast.type.RecordType;
import error.ErrorHandler;
import semantic.symboltable.SymbolTable;
import visitor.AbstractVisitor;

import java.util.ArrayList;
import java.util.List;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

    SymbolTable symbolTable;

    public IdentificationVisitor(){
        symbolTable = new SymbolTable();
    }

    @Override
    public Void visit(Variable variable, Void param) {
        super.visit(variable, param);
        variable.setDefinition(symbolTable.find(variable.getName()));
        if(variable.getDefinition() == null)
            new ErrorType(variable.getLine(), variable.getColumn(),"Variable "+variable.getName()+" is not defined in the scope");
        return null;
    }

    @Override
    public Void visit(VariableDefinition variableDefinition, Void param) {
        super.visit(variableDefinition, param);
        if(!symbolTable.insert(variableDefinition))
            new ErrorType(variableDefinition.getLine(), variableDefinition.getColumn(),"Variable "+variableDefinition.getName()+" is already defined in the scope.");
        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition, Void param) {
        if(!symbolTable.insert(functionDefinition))
           new ErrorType(functionDefinition.getLine(), functionDefinition.getColumn(),"Function "+functionDefinition.getName()+" is already defined in the scope.");

        else{
            symbolTable.set();
            super.visit(functionDefinition, param);
            symbolTable.reset();
        }
        return null;

    }

    @Override
    public Void visit(RecordType recordType, Void param) {
        super.visit(recordType, param);

        List<String> existingFields = new ArrayList<>();
        for(RecordField field : recordType.getFields()){
            if(existingFields.contains(field.getName()))
                new ErrorType(field.getLine(), field.getColumn(),"Record field "+field.getName()+" is already defined.");
            else
                existingFields.add(field.getName());
        }
        return null;
    }
}
