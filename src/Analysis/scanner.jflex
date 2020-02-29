/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package Analysis;
import java_cup.runtime.*;
import java.util.LinkedList;
/*------------  2da Area: Opciones y Declaraciones ---------*/
%%


//---> Directivas
%public 
%class Scanner
%cupsym Simbolos
%cup
%char
%column
%full
%ignorecase
%line
%unicode

//----> Expresiones Regulares
D=[0-9]+
DD=[0-9]+("."[  |0-9]+)?
ID=[A-Za-z]+["_"0-9A-Za-z]*
CADENA = [\"]([^\"\n]|(\\\"))*[\"]



//------> Estados
%%
/*------------  3ra Area: Reglas Lexicas ---------*/

//-----> Simbolos
<YYINITIAL> "+" {return new Symbol(Simbolos.mas,yycolumn, yyline, yytext());} 
<YYINITIAL> "-" {return new Symbol(Simbolos.menos,yycolumn, yyline, yytext());} 
<YYINITIAL> "*" {return new Symbol(Simbolos.por,yycolumn, yyline, yytext());} 
<YYINITIAL> "/" {return new Symbol(Simbolos.div,yycolumn, yyline, yytext());} 
<YYINITIAL> "||" {return new Symbol(Simbolos.or, yycolumn, yyline, yytext());}
<YYINITIAL> "&&" {return new Symbol(Simbolos.and, yycolumn, yyline, yytext());}
<YYINITIAL> "==" {return new Symbol(Simbolos.igualigual, yycolumn, yyline, yytext());}
<YYINITIAL> "false" {return new Symbol(Simbolos.pr_false, yycolumn, yyline, yytext());}
<YYINITIAL> "true" {return new Symbol(Simbolos.pr_true, yycolumn, yyline, yytext());}
<YYINITIAL> "(" {return new Symbol(Simbolos.para,yycolumn, yyline, yytext());}
<YYINITIAL> ")" {return new Symbol(Simbolos.parc,yycolumn, yyline, yytext());}
<YYINITIAL> "{" {return new Symbol(Simbolos.llavea, yycolumn, yyline, yytext());}
<YYINITIAL> "}" {return new Symbol(Simbolos.llavec, yycolumn, yyline, yytext());}
<YYINITIAL> "if" {return new Symbol(Simbolos.pr_if, yycolumn, yyline, yytext());}
<YYINITIAL> "print" {return new Symbol(Simbolos.pr_print, yycolumn, yyline, yytext());}

//------------->Expresiones Regulares
<YYINITIAL> {D} {return new Symbol(Simbolos.entero,yycolumn, yyline, yytext());} 
<YYINITIAL> {DD} {return new Symbol(Simbolos.decimal,yycolumn, yyline, yytext());} 
<YYINITIAL> {ID} {return new Symbol(Simbolos.id, yycolumn, yyline, yytext());}
<YYINITIAL> {CADENA} {return new Symbol(Simbolos.cadena, yycolumn, yyline, yytext());}
[ \t\r\n\f]      {/* Espacios en blanco, se ignoran */}

. {}
