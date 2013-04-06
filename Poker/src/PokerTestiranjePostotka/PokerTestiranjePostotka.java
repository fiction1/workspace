package PokerTestiranjePostotka;



import java.util.Scanner;

import Deck.Deck;
import Poker.Karta;

public class PokerTestiranjePostotka {

	public static void main(String[] args) {
//		float brojIstih = 0;
//		int brojMjesanja = 10000;
//		for (int h = 0; h < brojMjesanja; h++) {

			int brojIgraca = 6;
			// while (brojIgraca <= 0 || brojIgraca > 6) { //
			// System.out.println("Broj igraca?"); //broj
			// brojIgraca = unos.nextInt(); //igraca
			// unos.nextLine(); //
			// }
			Scanner unos = new Scanner(System.in);
			Deck deck = new Deck();
			Karta[][] igrac = new Karta[brojIgraca][2];
			for (int a = 0; a < 2; a++) {
				for (int b = 0; b < brojIgraca; b++) {
					int random = (int) (Math.random() * deck.deck.size());
					igrac[b][a] = deck.dajKartu(random);
					deck.deck.remove(random);
				}
			}

			for (int i = 0; i < brojIgraca; i++) {
				 igrac[i][0].getKarta();
				 igrac[i][1].getKarta();
//				if ((igrac[i][0].getRank() == igrac[i][1].getRank())
//						|| (igrac[i][0].getRank() == Rank.AS && igrac[i][1]
//								.getRank() == Rank.AS)) {
					// System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					// System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					// System.out.println("!!!!!!!!!!!!!!!!!!PAŽNJA!!!!!!!!!!!!!!!!!!!!");
					// System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					// System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//					brojIstih++;
//				}
				 System.out.println();
			}

//		}
//		System.out.println("Broj parova je: " + brojIstih);
//
//		System.err.format("%.2f%s", ((brojIstih / brojMjesanja) * 100), "%");
//
		unos.close();
	}

}
