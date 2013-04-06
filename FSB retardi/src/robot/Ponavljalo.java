package robot;

import java.util.ArrayList;
import java.util.Scanner;

public class Ponavljalo {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		String d = new String();
		int brojac = 0;
		while (!d.equalsIgnoreCase("kraj")) {
			d = unos.next();
			lista.add(d);
			if (!(lista.size() == 0)) {
				for (int i = 0; i < lista.size() - 1; i++) {
					if (lista.get(brojac).equalsIgnoreCase(lista.get(i))) {
						System.out.println("ponovljena rijec");
						lista.remove(i);
						i--;
						brojac--;
						break;
					}
				}
			}

			brojac++;
		}

		lista.remove("kraj");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		unos.close();
	}

}
