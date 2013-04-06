package Piramida;
import java.util.Scanner;


public class Piramida {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,c;
		a=input.nextInt();
//		b=input.nextInt();
//		c=input.nextInt();
		piramida(a);
//		piramida(b);
//		piramida(c);
		input.close();
	}
/////////////////////////////////////////////////////////////////////////////
	private static void piramida(int a) {
		for (int i = 1; i <= a; i++) {
			int p=a-i;
			String s=" ";
			for (int j = 0; j <=p; j++) {
				System.out.print(s);
			} 
			for (int j = 0; j < i; j++) {
				System.out.print(i+s);
			}
			
			System.out.println();
			}
	}

}
