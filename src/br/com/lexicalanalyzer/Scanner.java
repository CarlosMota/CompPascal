package br.com.lexicalanalyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.language.Token;
import br.com.util.AuxFunctions;

public class Scanner {

	public List<String> getAtom(String code) {
		List<String> listTab2 = AuxFunctions.splitTokenTab2(code);
		List<String> listTab1 = AuxFunctions.splitTokenTab1(listTab2);
		List<String> listAtom = AuxFunctions.splitSpace(listTab1);
		
		return listAtom;
	}
	
	public List<HashMap> getLexem(String code) {
		List<HashMap> resultList = new ArrayList<HashMap>();

		String[] inputArray = code.split("  |+");
		Token[] tokenArray = Token.values();
		boolean flag;

		for (String input : inputArray) {
			flag = false;

			for (Token token : tokenArray) {

				// Identifica os símbolos de entrada correspondentes aos tokens
				// da linguagem
				if (token.getValue().equals(input)) {
					HashMap<String, String> result = new HashMap<String, String>();

					result.put(input, token.getDescription());
					resultList.add(result);

					flag = true;
					break;
				}
			}

			if (!flag) {
				HashMap<String, String> result = new HashMap<String, String>();

				if (input.startsWith("\"") && input.endsWith("\";")) {
					System.out.println(input.substring(1, input.length() - 2));
					// System.out.println(isString(input.substring(1,
					// input.length() - 2)));

					result.put(input, Token.STRING.getDescription());
					resultList.add(result);
				}

				if (input.startsWith("\'") && input.endsWith("\';")) {
					result.put(input, Token.CHAR.getDescription());
					resultList.add(result);
				}

				if (input.startsWith("(")) {
					result.put(input, Token.PLUS.getDescription());
					resultList.add(result);
				}
			}
		}

		return resultList;
	}

}