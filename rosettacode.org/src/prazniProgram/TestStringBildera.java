package prazniProgram;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestStringBildera {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File brojevi = new File("brojevi.txt");
		Scanner in=new Scanner(new BufferedInputStream(new FileInputStream(brojevi)));
		int test=0;

		StringBuilder sb = new StringBuilder();

		while (in.hasNext()) {

			sb.append(in.next());

		}
		in.close();

	
		
		int x = 0;
		int y = 5;
//		System.out.println(sb.length());
		int i=1;
	
		do {
			
//			System.out.println(sb.substring(x, y));
			String upit= sb.substring(x, y);
			String upit0=upit.substring(0, 1);
			String upit1=upit.substring(1, 2);
			String upit2=upit.substring(2, 3);
			String upit3=upit.substring(3, 4);
			String upit4=upit.substring(4, 5);
			
			
			int next0=Integer.parseInt(upit0);
			int next1=Integer.parseInt(upit1);
			int next2=Integer.parseInt(upit2);
			int next3=Integer.parseInt(upit3);
			int next4=Integer.parseInt(upit4);
			int upitBroja=next0*next1*next2*next3*next4;
			
			System.out.format("%4d.  %d*%d*%d*%d*%d    %d\n",(i++),next0,next1,next2,next3,next4,upitBroja);
			if (test<=upitBroja) {
				
				test=upitBroja;
			}
			
			x++;
			y++;
			
		} while (y <= sb.length());
		
		System.err.println(test);

	}

}
