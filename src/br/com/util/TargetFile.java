package br.com.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TargetFile {

	public static String ReadFile(String path) {
		StringBuilder text = new StringBuilder();

		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(path));
			while (in.ready()) {
				text.append(in.readLine());
			}

			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text.toString();
	}
}
