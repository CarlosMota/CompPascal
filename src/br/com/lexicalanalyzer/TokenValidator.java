package br.com.lexicalanalyzer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.language.Token;

public class TokenValidator {
	
	public boolean isSymbol(String input) {
		Token[] tokenArray = Token.values();

		for (Token token : tokenArray) {
			if (token.getValue().equals(input))
				return true;
		}
		
		return false;
	}
	
	public boolean isIdentifier(String input) {
		String stringPattern = "[a-zA-Z]\\w+";
		return validateToken(stringPattern, input);
	}
	
	public boolean isChar(String input) {
		String stringPattern = "'[a-zA-Z]'";
		return validateToken(stringPattern, input);
	}
	
	public boolean isString(String input) {
		String stringPattern = "\"\\w+\"";
		return validateToken(stringPattern, input);
	}
	
	public boolean isInt(String input) {
		String stringPattern = "[0-9]+";
		return validateToken(stringPattern, input);
	}

	public boolean isFloat(String input) {
		String stringPattern = "[0-9]+(.[0-9]+|f|.[0-9]+f)";
		return validateToken(stringPattern, input);
	}
	
	public boolean validateToken(String stringPattern, String input) {
		Pattern pattern = Pattern.compile(stringPattern);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}

}
