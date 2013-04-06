package io_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Vjezba {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {

		try (Scanner s = new Scanner(new BufferedReader(new FileReader(
				"knjiga")))) {
			s.useDelimiter("\t");
			while (s.hasNext()) {
				System.out.println(s.next());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
