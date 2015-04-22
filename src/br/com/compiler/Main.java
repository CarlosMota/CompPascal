package br.com.compiler;


import java.util.List;

import br.com.lexicalanalyzer.Scanner;

public class Main {

	public static void main(String[] args) {
		args[0] = "\"jULIAe1\"; +begin == in in out end && in || 2*3 + = == \"1jul_iane\"; 1312 \"edu\"; (312+123) out (\"%f\",10);";
		System.out.println(args[0] + "\n");

		Scanner scanner = new Scanner();
//		List<HashMap> tokens = scanner.getLexeme(args[0]);
//		for (HashMap t : tokens) {
//			System.out.println(t.keySet() + " -> " + t.values());
//		}

		List<String> strings = scanner.getAtom(args[0]);
		for (String string : strings) {
			System.out.println(string);
		}
		
//		scanner.getAtom("\"jULIAe1\"; +begin in in out end && in || 2*3 + = == \"1jul_iane\"; 1312 \"edu\"; (312+123) out (\"%f\",10);");
		
	}
	
}
