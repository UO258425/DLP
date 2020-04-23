grammar Cmm;

@header{

import ast.*;
import ast.expression.*;
import ast.program.*;
import ast.statement.*;
import ast.type.*;
import java.util.*;
import parser.*;

}

program returns [Program ast]
        locals[List<Definition> definitions = new ArrayList<Definition>()]:
    (definition {$definitions.addAll($definition.ast);})*
    mainFunction {$definitions.add($mainFunction.ast);}
    EOF
    {$ast = new Program(0,0,$definitions);}
;

definition returns [List<Definition> ast = new ArrayList<Definition>()]:
      variableDefinition { $ast.addAll($variableDefinition.ast);}
    | functionDefinition { $ast.add($functionDefinition.ast);}
;

mainFunction returns [Definition ast]:
    voidType main='main' '(' ')' functionBlock
    { $ast = new FunctionDefinition($voidType.start.getLine(), $voidType.start.getCharPositionInLine()+1,
                         $functionBlock.ast,
                         new FunctionType($voidType.start.getLine(), $voidType.start.getCharPositionInLine()+1,$voidType.ast),
                         "main");}

;


variableDefinition returns [List<VariableDefinition> ast = new ArrayList<VariableDefinition>()]:
      type id1=ID { $ast.add(new VariableDefinition($type.start.getLine(), $type.start.getCharPositionInLine()+1, $type.ast, $id1.text));}
        (',' id2=ID { $ast.add(new VariableDefinition($type.start.getLine(), $type.start.getCharPositionInLine()+1, $type.ast, $id2.text));})* ';'
;

functionDefinition returns [Definition ast]:
    type ID '('functionParameters')' functionBlock
    {$ast = new FunctionDefinition($type.start.getLine(), $type.start.getCharPositionInLine()+1,
                $functionBlock.ast,
                new FunctionType($type.start.getLine(), $type.start.getCharPositionInLine()+1, $type.ast, $functionParameters.ast),
                $ID.text);}
;

functionParameters returns[List<VariableDefinition> ast = new ArrayList<VariableDefinition>()]:
   | t1=type id1=ID { $ast.add(new VariableDefinition($t1.start.getLine(), $t1.start.getCharPositionInLine()+1, $t1.ast, $id1.text));}
     (',' t2=type id2=ID { $ast.add(new VariableDefinition($t2.start.getLine(), $t2.start.getCharPositionInLine()+1, $t2.ast, $id2.text));})*
;

functionBlock returns [List<Statement> ast = new ArrayList<Statement>()]:
    '{'
        (variableDefinition {$ast.addAll($variableDefinition.ast);})*
        (statement {$ast.addAll($statement.ast);})*
    '}'
;

expression returns [Expression ast]:
           p='(' type ')' expression
                { $ast = new Cast($p.getLine(), $p.getCharPositionInLine()+1,
                                  $type.ast, $expression.ast);}
           | ID '(' functionArguments')'
                { $ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1,
                                      new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text),
                                      $functionArguments.ast);}
          | op='(' expression ')'
                {   $expression.ast.setLine($op.getLine());
                    $expression.ast.setColumn($op.getCharPositionInLine()+1);
                    $ast = $expression.ast;}
          | var=expression '[' index=expression ']'
                { $ast = new ArrayIndexing($var.start.getLine(), $var.start.getCharPositionInLine()+1,
                                           $var.ast, $index.ast);}
          | exp=expression '.' ID
                { $ast = new FieldAccess($exp.start.getLine(), $exp.start.getCharPositionInLine()+1,
                                          $exp.ast, $ID.text);}
          | op='-' expression
                { $ast = new UnaryMinus($op.getLine(), $op.getCharPositionInLine()+1, $expression.ast);}
          | exp1=expression op=('*'|'/'|'%') exp2=expression
                { $ast = new ArithmeticExpression($exp1.start.getLine(), $exp1.start.getCharPositionInLine()+1,
                                                  $op.text, $exp1.ast, $exp2.ast);}
          | exp1=expression op=('+'|'-') exp2=expression
                { $ast = new ArithmeticExpression($exp1.start.getLine(), $exp1.start.getCharPositionInLine()+1,
                                                  $op.text, $exp1.ast, $exp2.ast);}
          | exp1=expression op=('>'|'>='|'<'|'<='|'!='|'==') exp2=expression
                { $ast = new ComparisonExpression($exp1.start.getLine(), $exp1.start.getCharPositionInLine()+1,
                                               $op.text, $exp1.ast, $exp2.ast);}
          | exp1=expression op=('&&'|'||') exp2=expression
                { $ast = new LogicalExpression($exp1.start.getLine(), $exp1.start.getCharPositionInLine()+1,
                                        $op.text, $exp1.ast, $exp2.ast);}
          | op='!' expression
                { $ast = new UnaryNot($op.getLine(), $op.getCharPositionInLine()+1, $expression.ast);}

          | ID
                { $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);}
          | INT_CONSTANT
                { $ast = new IntegerLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1,
                                        LexerHelper.lexemeToInt($INT_CONSTANT.text));}
          | CHAR_CONSTANT
                { $ast = new CharacterLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1,
                                        LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
          | REAL_CONSTANT
                { $ast = new DoubleLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1,
                                                        LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
;


statement returns [List<Statement> ast = new ArrayList<Statement>()]
          locals [IfElse ifelse = new IfElse(0,0)]:
           exp1=expression '=' exp2=expression ';'
                { $ast.add(new Assignment($exp1.start.getLine(), $exp1.start.getCharPositionInLine()+1,
                                $exp1.ast, $exp2.ast));}

         | w='while' '(' expression ')' block
                { $ast.add(new While($w.getLine(), $w.getCharPositionInLine()+1,
                                $expression.ast, $block.ast));}

         | i='if' '(' expression ')' b1=block
                { $ifelse.setLine($i.getLine());
                  $ifelse.setColumn($i.getCharPositionInLine()+1);
                  $ifelse.setCondition($expression.ast);
                  $ifelse.setIfBody($b1.ast);}

                ('else' b2=block { $ifelse.setElseBody($b2.ast);})?

                { $ast.add($ifelse);}

         | r='return' expression ';'
                { $ast.add(new Return($r.getLine(), $r.getCharPositionInLine()+1, $expression.ast));}

         | read='read' exp1=expression { $ast.add(new Read($read.getLine(), $read.getCharPositionInLine()+1, $exp1.ast));}
                (',' exps2=expression { $ast.add(new Read($read.getLine(), $read.getCharPositionInLine()+1, $exps2.ast)); })* ';'

         | write='write' exp1=expression { $ast.add(new Write($write.getLine(), $write.getCharPositionInLine()+1, $exp1.ast));}
                (',' exps2=expression { $ast.add(new Write($write.getLine(), $write.getCharPositionInLine()+1, $exps2.ast)); })* ';'

         | ID '(' functionArguments')' ';'
                 { $ast.add(new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1,
                                                new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text),
                                                $functionArguments.ast));}
;

functionArguments returns[List<Expression> ast = new ArrayList<Expression>()]:
    | exp1=expression {$ast.add($exp1.ast);}
      (',' exp2=expression {$ast.add($exp2.ast);})*
;

block returns [List<Statement> ast = new ArrayList<Statement>()]:
       statement
            { $ast.addAll($statement.ast);}

     | '{' (statement {$ast.addAll($statement.ast);})+ '}'
;

type returns [Type ast]:
      t='int'
        { $ast = new IntegerType($t.getLine(), $t.getCharPositionInLine()+1);}
    | t='char'
        { $ast = new CharacterType($t.getLine(), $t.getCharPositionInLine()+1);}
    | t='double'
        { $ast = new DoubleType($t.getLine(), $t.getCharPositionInLine()+1);}
    | at=type '[' INT_CONSTANT ']'
        { $ast = ArrayType.createArray($at.start.getLine(), $at.start.getCharPositionInLine()+1,
                             $at.ast, LexerHelper.lexemeToInt($INT_CONSTANT.text));}
    | recordType
        { $ast = $recordType.ast;}
    | voidType
        { $ast = $voidType.ast;}
;

//Separated from primitive types because mainFunction needs to return a void
voidType returns [VoidType ast]:
    v='void' {$ast = new VoidType($v.getLine(), $v.getCharPositionInLine()+1);}
;


recordType returns [Type ast]
           locals [List<RecordField> fields = new ArrayList<RecordField>()]:
    struct='struct' '{' (recordField {$fields.addAll($recordField.ast);})* '}'
        { $ast = new RecordType($struct.getLine(), $struct.getCharPositionInLine()+1, $fields);}
;

recordField returns [List<RecordField> ast = new ArrayList<RecordField>()]:
      type id1=ID { $ast.add(new RecordField($type.start.getLine(), $type.start.getCharPositionInLine()+1, $type.ast, $id1.text));}
        (',' id2=ID { $ast.add(new RecordField($type.start.getLine(), $type.start.getCharPositionInLine()+1, $type.ast, $id2.text));})* ';'
;

WHITE_SPACE: ' '+ -> skip;
NEW_LINE: ('\n'|'\r')+ -> skip;
TAB: '\t'+ -> skip;
SINGLE_LINE_COMMENT: '//' .*?('\n'| EOF) -> skip ;
MULTILINE_COMMENT: '/*' .*?('*/'| EOF)  -> skip ;

REAL_CONSTANT:  (FIXED_POINT|INT_CONSTANT) [Ee] '-'? INT_CONSTANT
              | FIXED_POINT
;

ID: (LETTER|'_')(LETTER|'_'|DIGIT)*;

INT_CONSTANT: '0' | [1-9][0-9]*;

CHAR_CONSTANT: '\'' (LETTER|INT_CONSTANT) '\''
             | '\'' ([ -~]) '\''
             | '\'' '\\'('n'|'t'|INT_CONSTANT+) '\''
;

fragment
LETTER: [a-zA-Z];

fragment
FIXED_POINT: INT_CONSTANT+ '.' DIGIT*
           | INT_CONSTANT* '.' DIGIT+
;

fragment
DIGIT: [0-9];
