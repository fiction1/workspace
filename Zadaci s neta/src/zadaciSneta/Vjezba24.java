package zadaciSneta;
import java.util.Scanner;


public class Vjezba24 {

	/**
	 * penny=1cent
	 * nickel=5cent
	 * dime=10cent
	 * quarters=25cent
	 * 	 */
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int penny;
		int nickel;
		int dime;
		int quarters;
		int cent=0;
		int dolar=0;
		
		System.out.println("Unesite broj quarters-a:");
		quarters=unos.nextInt();
		cent=quarters*25;
		
		System.out.println("Unesite broj dime-a:");
		dime=unos.nextInt();
		cent+=dime*10;
		
		System.out.println("Unesite broj nickel-a:");
		nickel=unos.nextInt();
		cent+=nickel*5;
		
		System.out.println("Unesite broj penny-a:");
		penny=unos.nextInt();
		cent+=penny;
		
		dolar=cent/100;
		cent=cent%100;
		System.out.println("Imate "+dolar+" dolar i "+cent+" centi");
		
	}

}
