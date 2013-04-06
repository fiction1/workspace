package readingFilesUsingScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	public static void main(String[] args) {
		String fileName= "C:/Users/Tomislav/Desktop/Warrior.txt";
//		String fileName="example.txt";
		Scanner input;
		try {
			File textFile= new File(fileName);
			
			input = new Scanner(textFile);
			
			int value= input.nextInt();
			System.out.println("Read value: "+value);
			
			input.nextLine();
			
			int count = 1;
			while (input.hasNextLine()){
				String line= input.nextLine();
				System.out.printf("%2d%s%s\n",count,": ",line);
				count++;
			}
		} catch (FileNotFoundException e) {
			System.err.println("File does not exist.");
		}
		
		
		
		
	}

}

