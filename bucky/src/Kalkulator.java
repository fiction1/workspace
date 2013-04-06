import java.util.*;
class Kalkulator {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		double prvibroj, drugibroj, rezultat;
		
		System.out.println("Unesite prvi broj: ");
		prvibroj = unos.nextDouble();
		
		System.out.println("Unesite drugi broj: ");
		drugibroj = unos.nextDouble();
		
		rezultat = prvibroj+drugibroj;
		System.out.println(rezultat);
		
		
		System.out.println("bok. kak se zoveš?");
		
		String ime = unos.nextLine();
		
		
		System.out.println("bok "+ime);
		
	}

}
