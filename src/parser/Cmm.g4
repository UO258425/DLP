grammar Cmm;

@header{
    import ast.*;
    import java.util.*;
    import parser.*;
}

program returns [Program ast]
        locals[List<Definition> definitions = new ArrayList<Definition>()]:
    (definition {$definitions.addAll($definition);})*
    mainFunction {$definitions.add($main.ast);} EOF
    {$ast = new Program(0,0,definitions);}
;

definition returns [List<Definition> ast = new ArrayList<Definition>()]:
      variableDefinition { $ast.addAll($variableDefinition.ast);}
    | functionDefinition { $ast.addAll($variableDefinition.ast);}
;

mainFunction returns [Definition ast]:
    voidType main='main' '(' ')' functionBlock
    { $ast = new FunctionDefinition($void.getLine(), $void.getCharPositionInLine()+1,
                         $functionBlock.ast, new FunctionType($voidType.ast),
                         "main");}

;

voidType returns [Type ast]:
    void='void' {$ast = new VoidType($void.getLine(), $void.getCharPositionInLine()+1);}
;

variableDefinition returns [List<Definition> ast = new ArrayList<Definition>()]:
      type id1=ID { $ast.add(new VariableDefinition($type.getLine(), $type.getCharPositionInLine()+1, $type.ast, $id1.text));}
        (',' id2=ID { $ast.add(new VariableDefinition($type.getLine(), $type.getCharPositionInLine()+1, $type.ast, $id2.text));})* ';'
;

functionDefinition returns [Definition ast]:
    type ID '('functionParameters')' functionBlock
    {$ast = new FunctionDefinition($type.getLine(), $type.getCharPositionInLine()+1,
                $functionBlock.ast,
                new FunctionType($type.getLine(), $type.getCharPositionInLine()+1, $type.ast, $functionParameters.ast),
                $ID.text);}
;

functionParameters returns[List<VariableDefinition> ast = new ArrayList<VariableDefinition>()]:
   | type id1=ID { $ast.add(new VariableDefinition($type.getLine(), $type.getCharPositionInLine()+1, $type.ast, $id1.text));}
     (',' id2=ID { $ast.add(new VariableDefinition($type.getLine(), $type.getCharPositionInLine()+1, $type.ast, $id2.text));})*
;

functionBlock returns [List<Statement> ast = new ArrayList<Statement>()]:
    '{'
        (variableDefinition {$ast.addAll($variableDefinition.ast);})*
        (statement {$ast.addAll($statement.ast);})*
    '}'
;

statement returns [List<Statement> ast = new ArrayList<Statement>()]
          locals [IfElse ifelse = new IfElse()]:
           exp1=expression '=' exp2=expression ';'
                { $ast.add(new Assignment($exp1.getLine(), $exp1.getCharPositionInLine()+1,
                                $exp1.ast, $exp2.ast));}

         | while='while' '(' expression ')' block
                { $ast.add(new While($while.getLine(), $while.getCharPositionInLine()+1,
                                $expression.ast, $block.ast));}

         | if='if' '(' expression ')' b1=block
                { $ifelse.setLine($if.getLine());
                  $ifelse.setColumn($if.getCharPositionInLine()+1;
                  $ifelse.setCondition($expression.ast);
                  $ifelse.setIfBody($b1.ast));}

                ('else' b2=block { $ifelse.setElseBody($b2.ast);})?

                { $ast.add($ifelse);}

         | return='return' expression ';'
                { $ast.add(new Return($return.getLine(), $return.getCharPositionInLine()+1, $expression.ast));}

         | read='read' exp1=expression { $ast.add(new Read($read.getLine(), $read.getCharPositionInLine()+1, $exp1.ast));}
                (',' exps2=expression { $ast.add(new Read($read.getLine(), $read.getCharPositionInLine()+1, $exps2.ast)); })* ';'

         | write='write' exp1=expression { $ast.add(new Write($write.getLine(), $write.getCharPositionInLine()+1, $exp1.ast));}
                (',' exps2=expression { $ast.add(new Write($write.getLine(), $write.getCharPositionInLine()+1, $exps2.ast)); })* ';'

         | ID '(' functionArguments')' ';'
                 { $ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1,
                                                new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text),
                                                $functionArguments.ast);}
;

functionArguments returns[List<Expression> ast = new ArrayList<Expression>()]:
    | expression {$ast.add($expression.ast);}
      (',' expression {$ast.add($expression.ast);})*
;

block returns [List<Statement> ast = new ArrayList<Statement>()]:
       statement
            { $ast.add($statement.ast);}

     | '{' (statement {$ast.add($statement.ast);})+ '}'
;

expression returns [Expression ast]:
           ID '(' functionArguments')'
                { $ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1,
                                      new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text),
                                      $functionArguments.ast);}
          | start='(' type ')' expression
                { $ast = new Cast($start.getLine(), $start.getCharPositionInLine()+1,
                                  $type.ast, $expression.ast);}
          | op='(' expression ')'
                {   $expression.ast.setLine($op.getLine());
                    $expression.ast.setColumn($op.getColumn());
                    $ast = $expression.ast}
          | var=expression '[' index=expression ']'
                { $ast = new ArrayIndexing($var.getLine(), $var.getCharPositionInLine()+1,
                                           $var.ast, $index.ast);}
          | expression '.' ID
                { $ast = new FieldAccess($expression.getLine(), $expression.getCharPositionInLine()+1,
                                         $expression.ast, $ID.text);}
          | op='-' expression
                { $ast = new UnaryMinus($op.getLine(), $op.getCharPositionInLine()+1, $expression.ast);}
          | exp1=expression op=('*'|'/'|'%') exp2=expression
                { $ast = new ArithmeticExpression($exp1.getLine(), $exp1.getCharPositionInLine()+1,
                                                  $op.text, $exp1.ast, $exp2.ast);}
          | exp1=expression op=('+'|'-') exp2=expression
                { $ast = new ArithmeticExpression($exp1.getLine(), $exp1.getCharPositionInLine()+1,
                                                  $op.text, $exp1.ast, $exp2.ast);}
          | exp1=expression op=('>'|'>='|'<'|'<='|'!='|'==') exp2=expression
                { $ast = new LogicalExpression($exp1.getLine(), $exp1.getCharPositionInLine()+1,
                                               $op.text, $exp1.ast, $exp2.ast);}
          | exp1=expression op=('&&'|'||') exp2=expression
                { $ast = new LogicalExpression($exp1.getLine(), $exp1.getCharPositionInLine()+1,
                                        $op.text, $exp1.ast, $exp2.ast);}
          | op='!' expression
                { $ast = new UnaryNot($op.getLine(), $op.getCharPositionInLine()+1, $expression.ast);}
          | ID
                { $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);}
          | INT_CONSTANT
                { $ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1,
                                        LexerHelper.lexemeToInt($INT_CONSTANT.text));}
          | CHAR_CONSTANT
                { $ast = new CharacterLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine+1,
                                        LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
          | REAL_CONSTANT
                { $ast = new DoubleLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine+1,
                                                        LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
;

type returns [Type ast]:
      t='int'
        { $ast = new IntegerType($t.getLine(), $t.getCharPositionInLine()+1);}
    | t='char'
        { $ast = new CharacterType($t.getLine(), $t.getCharPositionInLine()+1);}
    | t='double'
        { $ast = new DoubleType($t.getLine(), $t.getCharPositionInLine()+1);}
    | t='void'
        { $ast = new VoidType($t.getLine(), $t.getCharPositionInLine()+1);}
    | type '[' INT_CONSTANT ']'
        { $ast = new ArrayType($type.getLine(), $type.getCharPositionInLine()+1,
                             $type.ast, LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
    | recordType
        { $ast = $recordType.ast;}
;

recordType returns [RecordType ast]:
    struct='struct' '{' (recordField {$fields.add($variableDefinition.ast);})* '}' ID ';'
        { $ast.add(new RecordType($struct.getLine(), $struct.getCharPositionInLine()+1, $fields, $ID.text));}
;

recordField returns [List<RecordField> ast = new ArrayList<RecordField>()]:
      type id1=ID { $ast.add(new RecordField($type.getLine(), $type.getCharPositionInLine()+1, $type.ast, $id1.text));}
        (',' id2=ID { $ast.add(new RecordField($type.getLine(), $type.getCharPositionInLine()+1, $type.ast, $id2.text));})* ';'
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
             | '\'' ('.'|'-'|'~') '\''
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
