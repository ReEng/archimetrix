lexer grammar InternalExpressions;
@header {
package org.storydriven.modeling.expressions.common.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'equiv' ;
T13 : 'imply' ;
T14 : 'or' ;
T15 : 'xor' ;
T16 : 'and' ;
T17 : 'not' ;
T18 : '(' ;
T19 : ')' ;
T20 : '<=' ;
T21 : '<' ;
T22 : '>=' ;
T23 : '>' ;
T24 : '=' ;
T25 : '!=' ;
T26 : '~' ;
T27 : '+' ;
T28 : '-' ;
T29 : '*' ;
T30 : '/' ;
T31 : '%' ;
T32 : '^' ;
T33 : '.' ;

// $ANTLR src "../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g" 1657
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g" 1659
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g" 1661
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g" 1663
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g" 1665
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g" 1667
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g" 1669
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g" 1671
RULE_ANY_OTHER : .;


