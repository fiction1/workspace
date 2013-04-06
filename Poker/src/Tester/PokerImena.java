package Tester;

import java.util.ArrayList;
import java.util.Scanner;

import Deck.Deck;
import Poker.Karta;
import Poker.Player;

public class PokerImena {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		Karta[] f = new Karta[5];

		int brojIgraca = 0;
		while (brojIgraca <= 0 || brojIgraca > 6) { //
			System.out.println("Broj igraca?"); // broj
			brojIgraca = unos.nextInt(); // igraca
			unos.nextLine(); //
		}

		ArrayList<Player> igraci = new ArrayList<>();
		for (int i = 0; i < brojIgraca; i++) {
			igraci.add(new Player());
		}

		Deck deck = new Deck();

		for (int i = 0; i < brojIgraca; i++) {
			System.out.println("Ime igraca " + (i + 1) + ". :");
			igraci.get(i).ime = unos.nextLine();
			System.out.println();
		}

		podijeliKartePreflop(brojIgraca, igraci, deck);
		System.out.println(igraci);
		
		System.out.println();
		
		f[0]= zajednickaKarta(deck);
		f[1]= zajednickaKarta(deck);
		f[2]= zajednickaKarta(deck);
		
		System.out.println("FLOP!!");
		System.out.println(f[0] + "        " + f[1] + "        " + f[2]);
		
		f[3] = zajednickaKarta(deck);
		
		System.out.println("TURN");
		System.out.println(f[3]);

		f[4] = zajednickaKarta(deck);
		
		System.out.println("RIVER");
		System.out.println(f[4]);
		System.out.println("\n\n\n");
		for (Karta karta : deck.deck) {
			System.out.println(karta);
		}
		System.out.println(deck.deck.size());

		unos.close();
	}

	private static Karta zajednickaKarta(Deck deck) {
		Karta f1;
		int random = (int) (Math.random() * deck.deck.size());
		f1 = deck.getDeck().get(random);
		deck.deck.remove(random);
		return f1;
	}

	private static void podijeliKartePreflop(int brojIgraca,
			ArrayList<Player> igraci, Deck deck) {
		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < brojIgraca; b++) {
				if (a < 1) {

					int random = (int) (Math.random() * deck.deck.size());
					igraci.get(b).karta1 = deck.getDeck().get(random);

					deck.deck.remove(random);

				} else {
					int random = (int) (Math.random() * deck.deck.size());
					igraci.get(b).karta2 = deck.getDeck().get(random);
					deck.deck.remove(random);
				}
			}

		}
	}

}
