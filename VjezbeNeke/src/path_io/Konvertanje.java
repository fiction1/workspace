package path_io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Konvertanje {

	public static void main(String[] args) {
		Path p1 = Paths.get("C:\\home\\joe\\foo");
		// Result is C:\home\joe\foo\bar
		System.out.format("%s%n", p1.resolve("bar"));
		// Result is /home/joe
		Paths.get("foo").resolve("/home/joe");
	}

}
