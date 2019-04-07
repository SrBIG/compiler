parser grammar StringParser;

options {
    tokenVocab=StringLexer;
    }

program
    : OPERATOR_DEL* ( ( expression | function ) OPERATOR_DEL )* ( expression | function ) OPERATOR_DEL*
    |;

expression
    : instruction | operation
    ;

function
    : FUNC name OPEN_PARANTHESIS param_def CLOSE_PARANTHESIS (RET_TYPE type)? BEGIN operators END
    ;

param_def
    : ( type name ( COMMA type name )* )?
    ;

operators
    : ( expression OPERATOR_DEL )* expression?
    ;

instruction
    : if_instruction
    | for_instruction
    | while_instruction
    | definition_instruction
    | assign_instruction
    | print
    | return_instruction
    ;

if_instruction
    : IF condition BEGIN then_block ( ELSE BEGIN else_block )? END
    ;

then_block
    : operators
    ;

else_block
    : operators
    ;

for_instruction
    : FOR name COMMA ( operand | operation ) BEGIN operators END
    ;

while_instruction
    : WHILE condition BEGIN operators END
    ;

definition_instruction
    : type name (ASSIGN operation)?
    ;

assign_instruction
    : (name | get_slice | get_item ) ASSIGN  operation
    ;

print
    : PRINT param_list
    ;

return_instruction
    : RETURN operation
    ;

operation
    : function_call
    | get_item
    | get_slice
    | operation SUM operation
    | operation IN operation
    | operation EQ operation
    | len_function
    | operand
    ;

function_call
    : name OPEN_PARANTHESIS param_list CLOSE_PARANTHESIS
    ;

get_item
    : operand OPEN_SQUARE_BRACKET item_index1 CLOSE_SQUARE_BRACKET
    ;

get_slice
    : operand OPEN_SQUARE_BRACKET item_index1 SEP_SLICE item_index2 CLOSE_SQUARE_BRACKET
    ;

item_index1
    : operand
    ;

item_index2
    : operand
    ;

param_list
    : ( operation ( COMMA operation )* )?
    ;

len_function
    : LEN OPEN_PARANTHESIS operation CLOSE_PARANTHESIS
    ;

condition
   : OPEN_PARANTHESIS logical_conj ( OR logical_conj )* CLOSE_PARANTHESIS
   | logical_conj ( OR logical_conj )*
   ;

logical_conj
   : OPEN_PARANTHESIS condition CLOSE_PARANTHESIS
   | logical_factor ( AND logical_factor )*
   ;

logical_factor
   : ( negation )? ( OPEN_PARANTHESIS condition CLOSE_PARANTHESIS | operation )
   ;

negation
   : NOT
   ;

type
    : BOOL | INT | STR | list
    ;

list
    : LIST OPEN_TRIANGLE_BRACKET type CLOSE_TRIANGLE_BRACKET
    ;

operand
    : name | ident | array
    ;

name
    : NAME
    ;

ident
    : STRING | NUMBER | BOOLEAN
    ;

array
    : OPEN_SQUARE_BRACKET (operand (COMMA operand)*)? CLOSE_SQUARE_BRACKET
    ;