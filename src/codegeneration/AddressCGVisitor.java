package codegeneration;


import ast.expression.Variable;
import ast.program.VariableDefinition;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

    private CodeGenerator cg;

    public AddressCGVisitor(CodeGenerator cg) {
        this.cg = cg;
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




    /*
    address[[indexing: expression1 -> expression2 expression3]] =
        address[[expression2]]
        value[[expression3]]
        <pushi> expression1.type.numberOfBytes()
        <muli>
        <addi>
    */

}
