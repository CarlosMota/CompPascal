package br.com.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

import br.com.language.TokenTab1;
import br.com.language.TokenTab2;

public class AuxFunctions {

	// Split dos "tokens separadores" com 2 caracteres ou mais
	public static List<String> splitTokenTab2(String input) {
		List<String> atomList = new ArrayList<String>();
		List<String> list = new ArrayList<String>();

		atomList.add(input);

		for (TokenTab2 token : TokenTab2.values()) {
			List<String> auxList = new ArrayList<String>();

			for (int i = 0; i < atomList.size(); i++) {
				list = AuxFunctions.splitString(atomList.get(i), token.getValue());
				for (int j = 0; j < list.size(); j++) {
					auxList.add(list.get(j));
				}
			}

			atomList.clear();
			atomList = auxList;
		}

		return atomList;
	}

	// Split dos "tokens separadores" com apenas 1 caracter
	public static List<String> splitTokenTab1(List<String> input) {
		List<String> atomList = new ArrayList<String>();
		String stringPattern = concatTokenTab1();
		StringTokenizer tokenizer;

		for (int i = 0; i < input.size(); i++) {
			boolean flag = false;

			for (TokenTab2 token : TokenTab2.values()) {
				if (input.get(i).equals(token.getValue())) {
					atomList.add(input.get(i));
					flag = true;
					break;
				}
			}

			if (!flag) {
				tokenizer = new StringTokenizer(input.get(i), stringPattern,
						true);

				while (tokenizer.hasMoreTokens()) {
					atomList.add(tokenizer.nextToken());
				}
			}
		}

		return atomList;
	}
	
	// Split de " "
	public static List<String> splitSpace(List<String> input) {
		List<String> atomList = new ArrayList<String>();

		for (int i = 0; i < input.size(); i++) {
			String[] inputArray = input.get(i).split(" ");

			for (int j = 0; j < inputArray.length; j++) {
				if (!inputArray[j].equals(""))
					atomList.add(inputArray[j]);
			}
		}

		return atomList;
	}
	
	//Split de string com delimiter.length() >= 0 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<String> splitString(String input, String delimiter) {
		if (input == null)
			return null;
		else if (input.equals("") || delimiter == null
				|| delimiter.length() == 0)
			return new ArrayList<String>();

		List<String> string;
		Vector v = new Vector();
		int pos = 0;
		int newpos = input.indexOf(delimiter, pos);

		while (newpos != -1) {
			v.addElement(input.substring(pos, newpos));
			v.addElement(delimiter);
			pos = newpos + delimiter.length();
			newpos = input.indexOf(delimiter, pos);
		}

		v.addElement(input.substring(pos));
		string = new ArrayList<>();

		for (int i = 0, cnt = v.size(); i < cnt; i++)
			string.add((String) v.elementAt(i));

		return string;
	}

	// Concatena todos os "tokens separadores" da linguagem
	public static String concatTokenTab1() {
		StringBuilder stringPattern = new StringBuilder();
		for (TokenTab1 token : TokenTab1.values()) {
			stringPattern.append(token.getValue());
		}

		return stringPattern.toString();
	}

}
