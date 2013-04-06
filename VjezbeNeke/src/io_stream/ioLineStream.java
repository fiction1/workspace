package io_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ioLineStream {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws FileNotFoundException  {
		BufferedReader in = null;
		PrintWriter out = null;

		try {
			in = new BufferedReader(new FileReader("pjesma2.txt"));
			out = new PrintWriter(new FileWriter("characteroutput.txt"));
			String s;

			while ((s = in.readLine()) != null) {
				out.println(s);

			}
			{

				if (in != null) {

					in.close();
				}

				if (out != null) {
					out.close();
				}

			}
		} catch (IOException e) {
			System.err.println("no such file");
		}

	}
}
