package readAfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.omg.PortableInterceptor.SUCCESSFUL;

public class ReadAFile {

	public static void main(String[] args) {

		BufferedReader tipkovnica = new BufferedReader(new InputStreamReader(
				System.in));

		boolean uspjeh = false;

		FileReader fr = null;
		BufferedReader br = null;

		while (!uspjeh) {

			System.out.println("Enter filename: ");
			String filename = null;

			try {
				filename = tipkovnica.readLine();
				fr = new FileReader(filename);
				br = new BufferedReader(fr);
				uspjeh = true;
			} catch (FileNotFoundException ex) {
				System.err.println("File " + filename + " was not found");
			} catch (IOException ex) {
				System.err.println("Failed to read the keyboard");
			}
		}

		String line;
		try {
			while ((line = br.readLine()) != null) {
				System.out.println("Read: " + line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();

		}

	}

}
