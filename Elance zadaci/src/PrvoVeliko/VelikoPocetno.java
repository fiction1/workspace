package PrvoVeliko;

import java.util.ArrayList;
import java.util.Scanner;

public class VelikoPocetno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String a = input.nextLine();
		String b = input.nextLine();
		String c = input.nextLine();
		ArrayList<String> aLista = new ArrayList<String>();

		listaVelikih(a, aLista);
		listaVelikih(b, aLista);
		listaVelikih(c, aLista);

		for (int i = 0; i < aLista.size(); i++) {
			System.out.println(aLista.get(i));
			input.close();
		}

	}

	// //////////////////////////////////////////////////////////////////////////////
	//
	// /////////////////////////////////////////////////////////////////////////////
	private static void listaVelikih(String a, ArrayList<String> aLista) {
		String[] aNiz = a.split(" ");
		// System.out.println(aNiz[0]);

		for (int i = 0; i < aNiz.length; i++) {
			char[] aChar = aNiz[i].toCharArray();

			String testAchar = Character.toString(aChar[0]);
			String testAcharVeliko = testAchar.toUpperCase();
			if (testAchar.equals(testAcharVeliko)) {
				aLista.add(aNiz[i]);
			}
		}

	}

}
