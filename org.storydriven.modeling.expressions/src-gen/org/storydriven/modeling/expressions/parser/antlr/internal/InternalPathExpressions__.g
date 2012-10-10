lexer grammar InternalPathExpressions;
@header {
package org.storydriven.modeling.expressions.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '(' ;
T12 : ')' ;
T13 : '|' ;
T14 : '.' ;
T15 : '[' ;
T16 : ',' ;
T17 : ']' ;
T18 : '!' ;
T19 : 'NO_REPEAT' ;
T20 : '+' ;
T21 : '*' ;
T22 : '-->' ;
T23 : '<>-->' ;
T24 : '--><>' ;

// $ANTLR src "../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g" 765
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g" 767
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g" 769
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g" 771
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g" 773
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g" 775
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g" 777
RULE_ANY_OTHER : .;


