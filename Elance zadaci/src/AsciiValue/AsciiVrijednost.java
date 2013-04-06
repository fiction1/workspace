package AsciiValue;

import java.util.Scanner;

public class AsciiVrijednost {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner unos= new Scanner(System.in);
		String input=unos.nextLine();
		int rezultat1=0;
		int rezultat2=0;
		int rjesenje;
		
		String[] ulaz= input.split(",");
		
//		System.out.println(ulaz[0]);
		
		char[] znak0=ulaz[0].toCharArray();
		char[] znak1=ulaz[1].toCharArray();
		
		
		int[]prvi=new int[znak0.length];
		int[]drugi=new int[znak1.length];
		
		
		kreirajNiz(znak0, prvi);
		kreirajNiz(znak1, drugi);
		//int prvi=(int)znak1[3];
		
		rezultat1 = vrijednostNiza(rezultat1, prvi);
		rezultat2 = vrijednostNiza(rezultat2, drugi);
		
		rjesenje=rezultat1-rezultat2;

		System.out.println(rjesenje);
		
	}

	private static int vrijednostNiza(int rezultat1, int[] prvi) {
		for (int i = 0; i < prvi.length; i++) {
			rezultat1+=prvi[i];
		}
		return rezultat1;
	}

	private static void kreirajNiz(char[] znak1, int[] prvi) {
		for (int i = 0; i < prvi.length; i++) {
			prvi[i]=znak1[i];
		}
	}

	

}
