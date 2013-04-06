package io_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoByteStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Throwable {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("pjesma1.txt");
			out = new FileOutputStream("kopijaPjesme.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (Exception e) {
			System.err.println("No such file");
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}

}
