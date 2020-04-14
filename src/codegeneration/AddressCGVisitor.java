package codegeneration;

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


/*
address[[indexing: expression1 -> expression2 expression3]] =
    address[[expression2]]
    value[[expression3]]
    <pushi> expression1.type.numberOfBytes()
    <muli>
    <addi>
 */

public class AddressCGVisitor {
}
