package Analisis;

// importacion 
import java_cup.runtime.Symbol;

%%

// codigo de usuario
%{
    String cadena = "";
%}

%init{ 
    yyline = 1; 
    yycolumn = 1; 
%init} 

//caracteristicas propias de jflex
%cup
%class scanner //nombre de la clase
%public // tipo de la clase
%line // conteo de lineas
%char // conteo de caracteres
%column // conteo de columnas
%full // reconocimiento de caracteres
%debug
%ignorecase // insensitive case

// creacion de estados si fuese necesario
%state CADENA

// simbolos
CHORCHETE1 = "{"
CORCHETE2 = "}"
DOS = ":" 
PYC = ";"
MULTI = "*"
DIV = "/"
MAS = "+"
MENOS = "-"
PR1 = "("
PR2 = ")"
MENOR ="<"
MAYOR =">"
EXCL ="!"

BLANCOS = [\ \r\t\f\n]+
NUMEROS = [0-9]+("."[0-9]+)?

// palabras reservadas

PROGRAM ="program"
END ="end"
CHAR ="char"
DOUBLE ="double"
VARIABLE ="var"
ARREGLO ="arr"
SUMA ="sum"
RESTA ="res"
MULTIPLICACION ="mul"
DIVISION ="div"
MODULO ="mod"
MEDIA ="media"
MEDIANA ="mediana"
MODA ="moda"
VARIANZA ="varianza"
MAX ="max"
MIN ="min"
CONSOLA ="consol"
PRINT ="print"

