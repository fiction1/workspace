package Username;

import java.util.Scanner;

public class UsernameCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String a=input.nextLine();
		
		String[] aNiz=a.split("");
		Boolean a1=provjeraDuljine(aNiz);
		
		
		
		
		
		Boolean provjera=false;
		int i =0;
		int j =0;
		do{
			
			do {
				if (aNiz[i].equals(j)) {
					
				} else {

				}
				j++;
			} while (j < 10 || provjera==true);
			
			i++;
		}while(i < aNiz.length || provjera==true);
		
				
			
			
		
		
		
		
		
		
		
		
		
		input.close();
		
	}

	private static Boolean provjeraDuljine(String[] aNiz) {
		Boolean provjera;
		for (int i = 0; i < aNiz.length; i++) {
			System.out.println(aNiz[i]);
		}
		if (aNiz.length <=5 || aNiz.length>11) {
			provjera=false;
		} else {
			provjera=true;
		}
		
		if (provjera==true) {
			System.out.println("PASS");
		}	else {System.out.println("FAIL");}
		return provjera;
	}
		
}
