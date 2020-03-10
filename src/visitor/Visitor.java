package visitor;

import ast.expression.*;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statement.*;
import ast.type.*;

import java.lang.reflect.Array;
import java.util.function.Function;

public interface Visitor<TP,TR>{
    TR visit(Program program,  TP param);
    TR visit(VariableDefinition variableDefinition, TP param);
    TR visit(FunctionDefinition functionDefinition, TP param);

    TR visit(Assignment assignment, TP param);
    TR visit(FunctionInvocation functionInvocation, TP param);
    TR visit(IfElse ifElse, TP param);
    TR visit(Read read, TP param);
    TR visit(Return returnStatement, TP param);
    TR visit(While whileStatement, TP param);
    TR visit(Write write, TP param);

    TR visit(ArithmeticExpression arithmeticExpression, TP param);
    TR visit(ArrayIndexing arrayIndexing, TP param);
    TR visit(Cast cast, TP param);
    TR visit(CharacterLiteral characterLiteral, TP param);
    TR visit(DoubleLiteral doubleLiteral, TP param);
    TR visit(FieldAccess fieldAccess, TP param);
    TR visit(LogicalExpression logicalExpression, TP param);
    TR visit(UnaryMinus unaryMinus, TP param);
    TR visit(UnaryNot unaryNot, TP param);
    TR visit(Variable variable, TP param);
    TR visit(IntegerLiteral integerLiteral, TP param);

    TR visit(ArrayType arrayType, TP param);
    TR visit(CharacterType characterType, TP param);
    TR visit(DoubleType doubleType, TP param);
    TR visit(ErrorType errorType, TP param);
    TR visit(FunctionType functionType, TP param);
    TR visit(IntegerType integerType, TP param);
    TR visit(RecordField recordField, TP param);
    TR visit(RecordType recordType, TP param);
    TR visit(VoidType voidType, TP param);









}
