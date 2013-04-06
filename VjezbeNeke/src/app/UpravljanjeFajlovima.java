package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class UpravljanjeFajlovima {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Path izvor=Paths.get("fajlovi/pjesma.txt");
		System.out.println(izvor.getFileName());
		
		
//		Path target= Paths.get("fajlovi/newfile.txt");
//		Files.copy(izvor, target,StandardCopyOption.REPLACE_EXISTING);
//		Path toDelete= Paths.get("fajlovi/zaIzbrisati.txt");
//		Files.delete(toDelete);
//		System.out.println("Fajl izbrisan");
		
		Path newDir= Paths.get("fajlovi/newDir");
		Files.createDirectories(newDir);
		
		Files.move(izvor, newDir.resolve(izvor.getFileName()), StandardCopyOption.REPLACE_EXISTING);
		

		
	}

}
