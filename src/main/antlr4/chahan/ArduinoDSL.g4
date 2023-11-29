
grammar ArduinoDSL;

// root
root : components states EOF ;

// definitions
components   : (alarm|sensor)* ;
alarm        : 'alarm' location ;
sensor       : 'sensor' location ;
location     : name=ID 'at' pin=PORT_NUMBER ;

states       : state+ ;
state        : initial? stateName=ID LCURLY action* transition* RCURLY ;
action       : receiver=ID '<=' value=SIGNAL ;
transition   : conditions '=>' next=ID ;
conditions   : condition (logicalOP condition)* ;
condition    : trigger=ID 'is' value=SIGNAL ;
logicalOP    : 'AND' | 'OR' ;
initial      : '->' ;

// Lexèmes
PORT_NUMBER     : [1-9] | '10' | '11' | '12';
NUMBER          : [0-9]+ ;
SIGNAL          : 'HIGH' | 'LOW' ;
ID              : [a-zA-Z][a-zA-Z0-9_]* ;
COMMENT         : '//' ~[\r\n]* -> skip ;           // gestion des commentaires
WS              : [ \t\r\n]+ -> skip ;
EQ              : '=' ;
LCURLY          : '{' ;
RCURLY          : '}' ;
