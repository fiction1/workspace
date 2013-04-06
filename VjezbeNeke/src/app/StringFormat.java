package app;

import java.nio.file.Path;
import java.nio.file.Paths;

public class StringFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path p1 = Paths.get("joe");
		Path p2 = Paths.get("sally");
		
		
		Path p1_to_p2 = p1.relativize(p2);
		Path p2_to_p1 = p2.relativize(p1);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1_to_p2.toString());
		System.out.println(p2_to_p1.toString());
		System.out.println();
		
		Path p4 = Paths.get("home");
		Path p5 = Paths.get("home/sally/bar");
		System.out.println(p4.toString());
		System.out.println(p5.toString());
		
		
		
	}

}
