package zadaciSneta;
import java.util.Scanner;


public class Vjezba23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		String ime;
		System.out.println("Kako se zovete?");
		ime=unos.next();
		
	
		ime=ime.toUpperCase();
		
		System.out.println("Zdravo, "+ime+", drago mi je sto smo se upoznali!");
		
		
	}

}
