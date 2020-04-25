package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String braiware;
%}
%%
ent |
si |
mas |
regreso |
publico |
priv |
nul |
fec |
dia |
año |
mes |
show |
ir |
para |
car |
estatico |
falso |
verdadero |
flot |
Edato |
func |
Sdato |
bool |
cad |
while {braiware=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
{L}({L}|{D})* {braiware=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {braiware=yytext(); return Numero;}
 . {return ERROR;}