package zadaciSneta;
import java.io.IOException;
import java.util.Scanner;


public class Vjezba33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner unos= new Scanner(System.in);
		
		double a=1;
		double b;
		double rez=0;
		String operacija;
		char oper;
		//System.out.println("Unesite prvi broj(0 je za izlaz)");
//		a = unos.nextDouble();
		
		
		while(a!=0){
			System.out.println("Unesite prvi broj(0 je za izlaz)");
			a = unos.nextDouble();
			System.out.println("Unesite racunsku operaciju (*,/,+,-)");
			
			
			
			operacija=unos.next();
			char[] operacija2= operacija.toCharArray();
			char operacija3=operacija2[0];
			
			System.out.println(operacija3);
							
							
		
			
		
			

			System.out.println("Unesite drugi broj");
			b=unos.nextDouble();
			
		
				switch (operacija2[0]) {
					case '+':
					rez=a+b;
					System.out.println("Rezultat "+a+ " + "+b+" je: "+rez);
					break;
					
					case '-':
					rez=a-b;
					System.out.println("Rezultat "+a+ " - "+b+" je: "+rez);
					break;
					
					case '*':
					rez=a*b;
					System.out.println("Rezultat "+a+ " * "+b+" je: "+rez);
					break;
					
					case '/':
					rez=a/b;
					System.out.println("Rezultat "+a+ " / "+b+" je: "+rez);
					break;
					
					default:
					System.out.println("Unjeli ste pogresu operaciju:");
					break;
					}
		
		
			
			
			
			
			
		
		
		}
		
		
	}

}
