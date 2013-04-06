package prazniProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Zbroj5Uzastopnih {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

//		File brojevi = new File("brojevi.txt");
//		FileInputStream in = new FileInputStream(brojevi);
//
//		StringBuilder sb = new StringBuilder();
		
		int test=0000;
		int a;

//		while ((a = in.read()) != -1) {
//
//			sb.append(a);
//
//		}
//		in.close();

//		System.out.println(sb);

		int x = 0;
		int y = 5;
//		System.out.println(sb.length());
		int i=1;
		String sb="7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
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
