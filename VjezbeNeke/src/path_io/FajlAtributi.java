package path_io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FajlAtributi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File slika= new File("As-Pik.jpg");
		Path put=Paths.get("As-Pik.jpg");
		try {
			BasicFileAttributes att= Files.readAttributes(put,BasicFileAttributes.class );
		
		System.out.println(att.creationTime());
		System.out.println(att.size());
		System.out.println(att.isRegularFile());
		System.out.println(att.isSymbolicLink());
		System.out.println(att.lastAccessTime());
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		long vrijeme= System.currentTimeMillis();
		long vrijeme2= System.currentTimeMillis();
	
		
		FileTime ft= FileTime.fromMillis(vrijeme);
		FileTime ft2= FileTime.fromMillis(vrijeme2);
		System.out.println(ft);
		System.out.println(ft2);
		
	}

}
