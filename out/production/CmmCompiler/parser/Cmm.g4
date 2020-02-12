grammar Cmm;	

program: MULTILINE_COMMENT*
       ;

WHITE_SPACE: ' '+ -> skip;
NEW_LINE: ('\n'|'\r')+ -> skip;
TAB: '\t'+ -> skip;

SINGLE_LINE_COMMENT: '//' .*?('\n'| EOF) ;
MULTILINE_COMMENT: '/*' .*?('*/') ;


ID: (LETTER|'_')(LETTER|'_'|DIGIT)*;

REAL_CONSTANT:  FIXED_POINT ('E'|'e') '-'? INT_CONSTANT
              | FIXED_POINT
;

INT_CONSTANT: '0' | [1-9][0-9]*;

CHAR_CONSTANT: '\'' (LETTER) '\''
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
