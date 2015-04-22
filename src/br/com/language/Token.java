package br.com.language;

public enum Token {
	IN("in", "Entrada"),
    OUT("out", "Saida"),
        
    IF("if", "Decisao"),
    ELSE("else", "Decisao"),
        
    LOOP("loop", "Repeticao"),
    DOWHILE("do while", "Repeticao"),
    
    PLUS("+", "Operador aritmetico"),
    MINUS("-", "Operador aritmetico"),
    TIMES("*", "Operador aritmetico"),
    DIVISION("/", "Operador aritmetico"),
    
    AND("&&", "Operador logico"),
    OR("||", "Operador logico"),
    NOT("!", "Operador logico"),
 
    NOTEQUAL("!=", "Operador relacional"),
    EQUAL("==", "Operador relacional"),
    GT(">", "Operador relacional"), //GT = greater than
    LT("<", "Operador relacional"), //LT = less than
    GET(">=", "Operador relacional"), //GET = greater or equal to
    LET("<=", "Operador relacional"), //LET = less or equal to

    CHAR("char", "Tipo de variavel"),
    STRING("char", "Tipo de variavel"),
    INT("int", "Tipo de variavel"),
    FLOAT("float", "Tipo de variavel"),

    IDENTIFIER("", "Identificador"), 
    TCHARACTER("", "Caracter"), //T = text
    TSTRING("", "String"), //T = text
    TNUMERIC("", "Numeral"), //T = text
    
    ASSIGN("=", "Atribuidor"),
    EOL(";", "Fim de linha"), //EOL = end of line
    LKEY("{", "Inicio do bloco"), 
    RKEY("}", "Fim do bloco"),
    BEGIN("begin", "Inicio do programa"),
    END("end", "Fim do programa"),
    LPAREN("(", "Delimitador de inicio"),
    RPAREN(")", "Delimitador de fim"),
    DSTRING("", "Delimitador de string"),

    INTFORMAT("%i", "Formatador"),
    FLOATFORMAT("%f", "Formatador"),
    CHARFORMAT("%c", "Formatador"),
    
    VOID("void", "Sem retorno");

	
	private String value;
	private String description;
	
	Token(String value, String description) {
		this.value = value;
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
