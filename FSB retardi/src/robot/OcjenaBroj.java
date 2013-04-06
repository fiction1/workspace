package robot;

import java.util.Scanner;

public class OcjenaBroj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int[] lista = new int[10];
		String a;// = unos.nextLine();
		
			for (int i = 0; i < lista.length; i++) {
				System.out.println(" Unesite " + (i + 1)
						+ ". ocjenu u rangu 0-10 (za kraj napisite kraj)");
				a = unos.nextLine();
				
				
				if (a.equals("kraj")) {
					break;
				}
				lista[i] = Integer.parseInt(a);
			}
			try {
				for (int i = 0; i < (lista.length + 1); i++) {
					String x = "X";
					System.out.print((i + 1) + " ");
					for (int j = 0; j < lista[i]; j++) {
						System.out.print(x);
					}
					System.out.println();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("GREŠKA");
			}

		

	}

}
