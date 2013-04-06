package zadaciSneta;
import java.util.Scanner;


public class Vjezba25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		int n;
		int dozens;
		int ostatak;
		int gross;
		
		System.out.println("koliko jaja imate?");
		n=unos.nextInt();
		gross=n/144;
		ostatak=n%144;
		dozens=ostatak/12;
		ostatak=ostatak%12;
		
		System.out.println("Your number of eggs is "+gross+" gross, "+dozens+" dozen, and "+ostatak);
		
		System.out.println("nesto"+(9*144 + 3*12 + 10));
		
		
	}

}
