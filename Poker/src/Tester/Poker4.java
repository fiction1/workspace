package Tester;

import java.util.Scanner;

import Deck.Deck;
import Poker.Karta;

public class Poker4 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int brojIgraca = 0;
		while (brojIgraca <= 0 || brojIgraca > 6) { //
			System.out.println("Broj igraca?"); 	// broj
			brojIgraca = unos.nextInt();			// igraca
			unos.nextLine(); 						//
		}

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
			System.out.println();
		}

		unos.close();
	}

}
