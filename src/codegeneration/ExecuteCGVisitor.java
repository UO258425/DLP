package codegeneration;

/*
execute[[Program: stmt -> definition*]] =
    <call> main
    definition*.foreach(def -> execute[[def]])
    <halt>
 */


/*
execute[[variableDefinition: definition -> type ID]] =
    <' *> type.toString ID <(offset > definition.offset<)>
 */

/*
execute[[FunctionDefinition: functionDefinition -> type ID statement*]] =
    ID <:>
    execute[[type]]

    for(Statement st : statements^*){
        if(st instanceof variableDefinitions)
    }

    int bytesLocals = -variableDefinition*.get(variableDefinition*.size()-1).offset)
    <enter> bytesLocals
    int bytesParams = type.parameters.stream().mapToInt(
                    param -> param.type.numberOfBytes()).sum();
    int bytesReturn = type.returnType.numberOfBytes();
    statement*.foreach(stmt -> execute[[stmt]])
    if(bytesReturn==0)
        <ret> bytesReturn, bytesLocals, bytesParams
 */

/*
execute[[Assignment: stmt -> expression1 expression2]] =
    address[[expresssion1]]
    value[[expression2]]
    <store>expression2.type.suffix
 */

/*
execute[[]] =
 */


/*
execute[[write: stmt1 -> expression]] =
    address[[expression]]
    <load>expression.type.suffix
    <out>expression.type.suffix
 */

/*
execute[[Read: stmt1 -> expression]] =
    address[[expression]]
    <in>expression.type.suffix
    <store>expression.type.suffix
 */

/*
execute[[ForStatement: stmt1 -> stmt2 expression stmt3 stmt4]]=
    int labelNumber = cg.getLabels(2)
    execute[[stmt2]]
    <label> labelNumber<:>
    value[[expression]]
    <jnz label> labelNumber+1
    stmt4*.foreach(stmt -> execute[[stmt]])
    execute[[stmt3]]
    <jmp label> labelNumber
    <label> labelNumber+1 <:>
 */

public class ExecuteCGVisitor {
}
