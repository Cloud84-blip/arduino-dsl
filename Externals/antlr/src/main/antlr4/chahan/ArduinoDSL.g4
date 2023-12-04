
grammar ArduinoDSL;

// root
root : components states EOF ;

// definitions
components   : (alarm|sensor)* ;
alarm        : 'alarm' location ;
sensor       : 'sensor' location ;
location     : name=ID 'at' pin=PORT_NUMBER ;

states       : state+ ;
state        : initial? stateName=ID LCURLY action* (transition|temporal)* RCURLY ;
action       : receiver=ID '<=' value=SIGNAL ;
transition   : conditions '=>' next=ID ;
temporal     : 'after' time=NUMBER '=>' next=ID ;
conditions   : condition (logicalOP condition)? ;
condition    : trigger=ID 'is' value=SIGNAL ;
logicalOP    : 'AND' | 'OR' ;
initial      : '->' ;

// Lexèmes
PORT_NUMBER     : [1-9] | '10' | '11' | '12';
NUMBER          : [0-9]+ ;
SIGNAL          : 'HIGH' | 'LOW' ;
ID              : [a-zA-Z][a-zA-Z0-9_]* ;
EQ              : '=' ;
LCURLY          : '{' ;
RCURLY          : '}' ;
NEWLINE         : ('\r'? '\n' | '\r')+ -> skip;
WS              : ((' ' | '\t')+) -> skip; 
COMMENT         : '//' -> skip;     // Single line comments, starting with a #
