package io_stream;

import java.io.FileReader;
import java.io.FileWriter;

public class IoCharStream {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Throwable {
		
		FileReader inputStream=null;
		FileWriter outputStream=null;
		
		inputStream=new FileReader("pjesma.txt");
		outputStream=new FileWriter("kopijaPjesme2.txt");
		int c;
		while ((c=inputStream.read()) !=-1){
			outputStream.write(c);
			System.out.println(c);
		}
		
		
		 {
			if (inputStream!=null){
				inputStream.close()	;
			}
			if (outputStream!=null){
				outputStream.close();	
			}
		}
		
		
	}

}
