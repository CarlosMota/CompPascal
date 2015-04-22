package br.com.language;

//Representa os "tokens separadores" com apenas 1 caracter

public enum TokenTab1 {
    PLUS("+", "Operador aritmetico"),
    MINUS("-", "Operador aritmetico"),
    TIMES("*", "Operador aritmetico"),
    DIVISION("/", "Operador aritmetico"),
    
    NOT("!", "Operador logico"),
    
    GT(">", "Operador relacional"), //GT = greater than
    LT("<", "Operador relacional"), //LT = less than

    ASSIGN("=", "Atribuidor"),
    EOL(";", "Fim de linha"), //EOL = end of line
    LKEY("{", "Inicio do bloco"), 
    RKEY("}", "Fim do bloco"),
    LPAREN("(", "Delimitador de inicio"),
    RPAREN(")", "Delimitador de fim");
	
    
    private String value;
	private String description;
	
	TokenTab1(String value, String description) {
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
