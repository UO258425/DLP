package codegeneration;


/*
value[[Arithmetic: expression1 -> expression2 (+|-|*|/) expression3)]] =
    value[[expression2]]
    value[[expression3]]
    cg.arithmetic(operation, expression1.type)
 */

/*
value[[Cast: expression1 -> type expression2]] =
    value[[expression2]]
    expression2.type.suffix <2> type.suffix
 */

/*
value[[Variable: expression1 -> ID]]=
    address[[expression1]]
    <load> exppression1.type.suffix()

 */

/*
value[[CharacterLiteral: expression -> CHAR_CONSTANT ]]=
    <pushb> expression.value
 */

/*
value[[IntegerLiteral: expression -> INT_CONSTANT]] =
    <pushi> expression.value
 */

/*
value[[DoubleLiteral: expression -> REAL_CONSTANT]] =
    <pushf> expression.value
 */

public class ValueCGVisitor {
}
