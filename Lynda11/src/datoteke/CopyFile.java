package datoteke;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		try {
			File f1 = new File("text.txt");
			File f2 = new File("target.txt");

			InputStream input = new FileInputStream(f1);
			OutputStream out = new FileOutputStream(f2);

			byte[] buffer = new byte[1024];
			int duzina;

			while ((duzina = input.read(buffer)) > 0) {
				out.write(buffer, 0, duzina);

			}
			input.close();
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
	}

}
