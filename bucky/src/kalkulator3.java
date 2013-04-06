
import java.util.Scanner;
class kalkulator3 {

		public static void main(String[] args) {
			Scanner entry = new Scanner(System.in);
			/* Scanner ime = new Scanner(System.in);*/ 
			double stnm, ndnm, res;
			
			System.out.println("Enter 1st number: ");
			stnm = entry.nextDouble();
			
			System.out.println("Enter 2nd number: ");
			ndnm = entry.nextDouble();
			
			res = stnm+ndnm;
			System.out.println(res);

			
			System.out.println("Hi. What's your name?");
			/*entry.nextLine();*/
			String a = entry.next(); /* String a = ime.nextLine();*/
			
			System.out.println("Unesite prvi broj");
			int b = entry.nextInt();
			System.out.println("Unesite drugi broj");
			int c = entry.nextInt();
			int d=b+c;
		
			System.out.println("Hi "+a +" "+ d);
			
		}

	}