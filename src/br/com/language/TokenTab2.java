package br.com.language;

//Representa os "tokens separadores" com 2 caracteres ou mais

public enum TokenTab2 {
    AND("&&", "Operador logico"),
    OR("||", "Operador logico"),

    NOTEQUAL("!=", "Operador relacional"),
    EQUAL("==", "Operador relacional"),
    GET(">=", "Operador relacional"), //GET = greater or equal to
    LET("<=", "Operador relacional"); //LET = less or equal to

    
    private String value;
	private String description;
	
	TokenTab2(String value, String description) {
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
