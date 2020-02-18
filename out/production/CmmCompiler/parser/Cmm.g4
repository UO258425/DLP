grammar Cmm;	

program: (variableDefinition | functionDefinition)*
;

variableDefinition: type ID (',' ID)* ';'
                  | 'struct' '{' variableDefinition+ '}' ID ';'
                  | type  ('[' INT_CONSTANT']')+ ID';'
;

functionDefinition: type ID '('functionArguments')' functionBlock
;

functionArguments:
                 | type ID (',' type ID)*
;

functionBlock: '{' variableDefinition* statement* '}'
;

statement: expression '=' expression ';'
         | 'while' '(' expression ')' block
         | 'if' '(' expression ')' block ('else' block)?
         | 'return' expression ';'
         | 'read' expression (',' expression)* ';'
         | 'write' expression (',' expression)* ';'
         | ID '(' functionParameters')' ';'
;

functionParameters:
                    | expression (',' expression)*
;

block: statement
     | '{' statement+ '}'
;

expression: ID '(' functionParameters')'
          | '(' type ')' expression
          |'(' expression ')'
          | expression '[' expression ']'
          | expression '.' ID
          | '-' expression
          | expression ('*'|'/'|'%') expression
          | expression ('+'|'-') expression
          | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
          | expression ('&&'|'||') expression
          | '!' expression
          | ID
          | INT_CONSTANT
          | CHAR_CONSTANT
          | REAL_CONSTANT
;

type: 'int'
    | 'char'
    | 'double'
    | 'void'
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
