grammar SnapGrammar;


//TOP LEVEL

jsnap_code
	:	( function_declaration_util 
		| assign_util end_statement 
		| declaration_util end_statement 
		| object_access_util end_statement
		| pragma
		)* EOF
	;

//PRAGMA

pragma
	:	PRAGMA
	;

//STATEMENTS

statement
	:	declaration_util #declaration
	|	assign_util #assign
	|	if_util  #if
	|	try_catch_util #try_catch
	|	return_util #return
	|	for_util #for
	|	switch_util #switch
	|	while_util #while
	|	do_while_util #do_while
	|	instruction #operation
	|	statement_list_util #statement_list
	| 	compressed_conditional_util	#compressed_conditional
	;
	
compressed_conditional_util
	:	instruction QUESTIONMARK
	    (assign_util | return_util | function_declaration_util | instruction | compressed_conditional_util) COLON
	    (assign_util | return_util | function_declaration_util | instruction | compressed_conditional_util)
	;
	
declaration_util
	:	VAR var_assign_util (COMMA var_assign_util)*
	;
	
var_assign_util
	:	(object_access_util | identifier_util) (assign_operator (assign_util | function_declaration_util | instruction | compressed_conditional_util))?
	;
	
assign_util
	:	(object_access_util | identifier_util | parenthesized_operation_util) assign_operator (assign_util | function_declaration_util | instruction | compressed_conditional_util)
	;	
	
if_util
	:	IF LP statement RP code_block_util_contents (ELSE code_block_util_contents)?
	;
	
try_catch_util
	:	try_catch_util_try try_catch_util_catch? try_catch_util_finally?
	;
	
try_catch_util_try
	:	TRY code_block_util
	;
	
try_catch_util_catch
	:	CATCH LP identifier_util RP code_block_util
	;
	
try_catch_util_finally
	:	FINALLY code_block_util
	;
	
return_util
	:	RETURN statement?
	;	
	
for_util
	:	FOR LP for_parameters RP code_block_util_contents
	;

for_parameters
	:	(identifier_util | declaration_util) IN statement
	|	statement? END_STATEMENT statement? END_STATEMENT statement?
	;
	
function_declaration_util
	:	FUNCTION identifier_util? LP parameters? RP code_block_util access_operator?
	;
	
	
switch_util
	:	SWITCH LP statement RP switch_body
	;
	
switch_body
	:	LB switch_case* switch_default? RB
	;
	
switch_case
	:	CASE instruction COLON code_block_util_contents*
	;
	
switch_default
	:	DEFAULT COLON code_block_util_contents*
	;	
	
while_util
	:	WHILE LP statement RP code_block_util_contents
	;
	
do_while_util
	:	DO code_block_util_contents WHILE LP statement RP
	;	
	
statement_list_util
	:	(assign_util | function_declaration_util | instruction) (COMMA (assign_util | function_declaration_util | instruction))+
	;
	
//UTILS
	
assign_operator
	:	ASSIGN
	|	PASSIGN
	|	MASSIGN
	|	DIVASSIGN
	|	MULTASSIGN
	|	MODASSIGN
	;
	
parameters
	:	(assign_util | function_declaration_util | instruction | compressed_conditional_util) (COMMA (assign_util | function_declaration_util | instruction | compressed_conditional_util))*
	;	
	
//INSTRUCTIONS	
	
instruction
	:	atom #atomic_operation
	|	object_access_util #object_access
	|	instruction INSTANCEOF instruction #instanceof_operation
	|	typeof_operator instruction #typeof_operation
	|	THROW statement #throw
	|	DELETE instruction #delete
	|	BREAK #break
	|	CONTINUE #continue
	|	new_object_declaration_util #new_object_declaration
	|	NOT instruction	#negation
	|	instruction and_operator instruction #and_operation
	|	instruction or_operator instruction #or_operation
	|	instruction bit_operator instruction #bit_operation
	|	instruction comparison_operator instruction #comparison_operation
	|	instruction glorified_arithmetic_operator instruction #glorified_arithmetic_operation
	|	instruction arithmetic_operator instruction #arithmetic_operation
	|	sign_operator instruction #signed_operation
	|	xment_operator atom #prexment_operation
	|	atom xment_operator #xment_operation
	;
	
new_object_declaration_util
	:	NEW identifier_util
	;	
	
object_access_util
	:	(
			atom |
			new_object_declaration_util |
			parenthesized_operation_util
		) 
		(DOT object_attribute)+
	;	
	
object_attribute
	:	identifier_util
	;
	
// TODO [1,] and so on isn't supported yet
access_operator
	:	LSB (instruction | statement_list_util | compressed_conditional_util) COMMA? RSB #array_access
	|	LP parameters? RP #function_call
	;	
	
parenthesized_operation_util
	:	LP statement RP access_operator*
	;	
	

atom
	:	function_declaration_util #function_declaration
	|	identifier_util #identifier
	|	STRING #string
	|	NUMBER #number
	|	(TRUE | FALSE) #boolean
	|	LB (json_contents COMMA?)+ RB #json
	|	code_block_util #code_block
	|	array_util #array
	|	REGULAR_EXPRESSION #regular_expression
	|	parenthesized_operation_util #parenthesized_operation
	;
	
code_block_util
	:	LB code_block_util_contents* RB
	;
	
code_block_util_contents
	:	if_util
	|	for_util
	|	while_util
	|	do_while_util end_statement
	|	switch_util
	|	try_catch_util
	|	return_util end_statement
	|	code_block_util
	|	declaration_util end_statement
	|	assign_util end_statement
	|	statement_list_util end_statement
	|	instruction end_statement
	|	function_declaration_util
	|	compressed_conditional_util end_statement
	|	pragma
	;	
	
array_util
	:	LSB parameters? RSB
	;
	
identifier_util
	:	id access_operator*
	;

id
 :	ID
 ;

json_contents
	:	(ID | STRING) COLON instruction
	;
	
typeof_operator
	:	TYPEOF
	;

and_operator 
	:	AND
	;	

or_operator 
	:	OR
	;	

sign_operator
	:	PLUS
	|	MINUS
	;
	
comparison_operator 
	:	EQ
	|	NE
	|	GT
	|	LT
	|	GE
	|	LE
	;

bit_operator
	:	BIT_AND
	|	BIT_OR
	|	BIT_XOR
	|	SHIFT_LEFT
	|	SHIFT_RIGHT_PROP
	|	SHIFT_RIGHT
	;
	
xment_operator
	:	INCREMENT
	|	DECREMENT
	|	BIT_NOT
	;
	
arithmetic_operator
	:	PLUS
	|	MINUS
	;
	
glorified_arithmetic_operator
	:	MULTIPLICATION
	|	DIVISION
	|	MODULUS
	;

end_statement
	:	END_STATEMENT
	;
	
PRAGMA : '/*@'.+? '!*/' ;	
STRING : ('"' ( '\\"' | . )*? '"') | ('\'' ( '\\\'' | . )*? '\'') ;
SINGLELINE_COMMENT : '//' ~('\r' | '\n')* -> skip ;
MULTILINE_COMMENT : '/*' .*? '*/' -> skip ; // .*? matches anything until the first */
//Snap doesn't use RegEx
REGULAR_EXPRESSION : '/' ([a-zA-Z0-9_]+ | '[' | ']' | '\'' | '"' | '#' | '<' | '>' | '\\' | '?' | '%' | '?' | '-' | ':' | '{' | '}' | '(' | ')' | '@' | '$' | '+' | '|' | '&')+ '/' ('i' | 'g' | 'm')* ;  //dummy version
NEW : 'new' ;
THROW : 'throw' ;
DELETE : 'delete' ;
BREAK: 'break' ;
CONTINUE: 'continue' ;
RETURN : 'return' ;
FOR : 'for' ;
WHILE : 'while' ;
IN : 'in' ;
IF : 'if' ;
DO : 'do' ;
SWITCH : 'switch' ;
CASE : 'case' ;
DEFAULT : 'default' ;
TRY : 'try' ;
CATCH : 'catch' ;
FINALLY : 'finally' ;
ELSE : 'else' ;
TRUE : 'true' ;
FALSE : 'false' ;
INCREMENT : '++' ;
DECREMENT : '--' ;
PLUS : '+' ;
MINUS : '-' ;
MULTIPLICATION : '*' ;
DIVISION : '/' ;
MODULUS : '%' ;				
//THIS : 'this' ; //not worth including
//PROTOTYPE : 'prototype' ; //not worth including
BIT_AND : '&' ;
BIT_OR : '|' ;
BIT_XOR : '^' ;
BIT_NOT : '~' ;
SHIFT_LEFT : '<<' ;
SHIFT_RIGHT_PROP : '>>' ;
SHIFT_RIGHT : '>>>' ;
VAR : 'var' ;
AND : '&&' ;
OR : '||' ;
NOT : '!' ;
INSTANCEOF : 'instanceof' ;
TYPEOF : 'typeof' ;
ASSIGN : '=' ;
PASSIGN : '+=' ;
MASSIGN : '-=' ;
DIVASSIGN : '/=' ;
MULTASSIGN : '*=' ;
MODASSIGN : '%=' ;
EQ : '==''='? ;
NE : '!=''='? ;
GT : '>' ;
LT : '<' ;
GE : '>=' ;
LE : '<=' ;
COMMA : ',' ;
COLON : ':' ;
QUESTIONMARK : '?' ;
END_STATEMENT : ';' ;
RSB : ']' ;
LSB : '[' ;
RB : '}' ;
LB : '{' ;
RP : ')' ;
LP : '(' ;
FUNCTION : 'function' ;
DOT : '.' ;
NUMBER : [0-9]+ (DOT [0-9]+)?;
ID : [a-zA-Z0-9_$]+ ;
WS : [ \t\r\n]+ -> skip ;
