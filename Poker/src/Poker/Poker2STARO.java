package Poker;

import java.util.ArrayList;

import Deck.Deck;

public class Poker2STARO {

	public static void main(String[] args) {
		
		ArrayList<Karta> koristeneKarte = new ArrayList<Karta>();

		IgracSTARO[] igrac1 = new IgracSTARO[2];
		igrac1[0] = new IgracSTARO(koristeneKarte);
		koristeneKarte.add(igrac1[0].getKarta());
		igrac1[1] = new IgracSTARO(koristeneKarte);
		koristeneKarte.add(igrac1[1].getKarta());

		IgracSTARO[] igrac2 = new IgracSTARO[2];
		igrac2[0] = new IgracSTARO(koristeneKarte);
		koristeneKarte.add(igrac2[0].getKarta());
		igrac2[1] = new IgracSTARO(koristeneKarte);
		koristeneKarte.add(igrac2[1].getKarta());

		ispisKarte: {
			int i = 0;
			for (Karta karta : koristeneKarte) {
				karta.getKarta();
				if (i % 2 != 0) {
					System.out.println();
				}
				i++;
			}
		}


	}

}
