// the grammar name and file name must match
grammar Expr;

@header {
    package antlr;
}

/*
 * parser rules
 */

prog : (import_stmt NEWLINE)*                                   # Program
;
import_stmt : IMPORT '"' ds '"' FROM '"' fname '"' AS symbol    # Import
;
ds : ('/' NAME)+                                                # Dataset
;
fname : ('\\' NAME)+ '.' HDF5                                   # Filename
;
symbol : NAME                                                   # Variable
;

/*
 * lexer rules
 */

NEWLINE : [\r\n]+;
IMPORT : 'import';
FROM : 'from';
AS : 'as';
NAME : [a-zA-Z0-9_]+;
HDF5 : 'HDF5';
WS : [ \t\n]+ -> skip;