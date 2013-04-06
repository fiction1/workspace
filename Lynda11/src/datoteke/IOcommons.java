package datoteke;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class IOcommons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			File f1 = new File("text.txt");
			File f2 = new File("target.txt");
			
			FileUtils.copyFile(f1, f2);
			System.out.println("File copied!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
