import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
	
		int a=3; 
		int b=2;
		int c=4;
//		System.out.println("Pick first number between 1 and 9");
//		a= unos.nextInt();
//		System.out.println("Pick second number between 1 and 9");
//		b= unos.nextInt();
//		System.out.println("Pick third number between 1 and 9");
//		c= unos.nextInt();
	
		
		ispis(a);
		ispis(b);
		ispis(c);
	
		
	unos.close();
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////////////
//	metoda  "ispis" za izbor izlaza na temelju unosa
/////////////////////////////////////////////////////////////////////////////////////////////	
	private static void ispis(int a) {
		switch (a){
		
		case 1:
			System.out.println("1");
			break;
			
		case 2:
			System.out.println(" 1");
			System.out.println("2 2");
			break;
		case 3:
			System.out.println("  1");
			System.out.println(" 2 2");
			System.out.println("3 3 3");
			break;
		case 4:
			System.out.println("   1");
			System.out.println("  2 2");
			System.out.println(" 3 3 3");
			System.out.println("4 4 4 4");
			break;
			
		case 5:
			System.out.println("    1");
			System.out.println("   2 2");
			System.out.println("  3 3 3");
			System.out.println(" 4 4 4 4");
			System.out.println("5 5 5 5 5");
			break;
		case 6:
			System.out.println("     1");
			System.out.println("    2 2");
			System.out.println("   3 3 3");
			System.out.println("  4 4 4 4");
			System.out.println(" 5 5 5 5 5");
			System.out.println("6 6 6 6 6 6");
			break;
		case 7:
			System.out.println("      1");
			System.out.println("     2 2");
			System.out.println("    3 3 3");
			System.out.println("   4 4 4 4");
			System.out.println("  5 5 5 5 5");
			System.out.println(" 6 6 6 6 6 6");
			System.out.println("7 7 7 7 7 7 7");
			break;
		case 8:
			System.out.println("       1");
			System.out.println("      2 2");
			System.out.println("     3 3 3");
			System.out.println("    4 4 4 4");
			System.out.println("   5 5 5 5 5");
			System.out.println("  6 6 6 6 6 6");
			System.out.println(" 7 7 7 7 7 7 7");
			System.out.println("8 8 8 8 8 8 8 8");
			break;
		case 9:
			System.out.println("        1");
			System.out.println("       2 2");
			System.out.println("      3 3 3");
			System.out.println("     4 4 4 4");
			System.out.println("    5 5 5 5 5");
			System.out.println("   6 6 6 6 6 6");
			System.out.println("  7 7 7 7 7 7 7");
			System.out.println(" 8 8 8 8 8 8 8 8");
			System.out.println("9 9 9 9 9 9 9 9 9");
			break;
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	
}
