package codegeneration;


import ast.expression.ArrayIndexing;
import ast.expression.FieldAccess;
import ast.expression.Variable;
import ast.program.VariableDefinition;
import ast.type.RecordType;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

    private CodeGenerator cg;

    private ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor) {
        this.valueCGVisitor = valueCGVisitor;
    }

    /*
        address[[Variable: expression -> ID]] =
            if(expression.definition.scope == 0)
                <pusha> expression.definition.offset
             else{
                <push bp>
                <pushi> expression.definition.offset
                <addi>
            }
        */
    @Override
    public Void visit(Variable variable, Void param) {
        if (variable.getDefinition().getScope() == 0) {
            cg.pusha(((VariableDefinition)variable.getDefinition()).getOffset());
        } else {
            cg.pushbp();
            cg.pushi(((VariableDefinition)variable.getDefinition()).getOffset());
            cg.addi();
        }
        return null;
    }

    /*
    address[[FieldAccess: expression1 -> expression2 ID]]=
        address[[expression2]]
        <pushi > expression2.type.getField(ID)
        <addi>
     */
    @Override
    public Void visit(FieldAccess fieldAccess, Void param){
        fieldAccess.getExpression().accept(this, param);
        RecordType recordType = (RecordType) fieldAccess.getExpression().getType();
        cg.pushi(recordType.getField(fieldAccess.getFieldName()).getOffset());
        cg.addi();
        return null;
    }



    /*
    address[[indexing: expression1 -> expression2 expression3]] =
        address[[expression2]]
        value[[expression3]]
        <pushi> expression1.type.numberOfBytes()
        <muli>
        <addi>
    */
    @Override
    public Void visit(ArrayIndexing arrayIndexing, Void param){
        arrayIndexing.getVariable().accept(this, param);
        arrayIndexing.getIndex().accept(valueCGVisitor, param);
        cg.pushi(arrayIndexing.getType().getNumberOfBytes());
        cg.muli();
        cg.addi();
        return null;
    }
}
