package Poker;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Deck.Deck;

public class PokerSTARO {
	public static void main(String[] args) {
//		Karta igrac1 = new Karta();
//		Karta igrac2 = new Karta();
//		Karta igrac3= new Karta();
//		Karta igrac4= new Karta();
//		Karta igrac5 = new Karta();
//		Karta igrac6 = new Karta();
		
//		karta(igrac1);		
//		karta(igrac2);
//		karta(igrac3);
//		karta(igrac4);
//		karta(igrac5);
//		karta(igrac6);
//		
//		Deck deck = new Deck();
//		ArrayList<Karta> sranje = new ArrayList<>();
//		System.out.println();
//
//
//
//		newDeck(igrac1, sranje);
//		newDeck(igrac2, sranje);
//		newDeck(igrac3, sranje);
//		newDeck(igrac4, sranje);
//		newDeck(igrac5, sranje);
//		newDeck(igrac6, sranje);


//		int j = 0;
//		for (Karta karta : sranje) {

//			System.out.println(j + ".\n" + karta.getBoja() + " "
//					+ karta.getRank());
//			j++;
//		}
//
	}

	private static void karta(Karta igrac1) {
		System.out.println("Igrac ima " + igrac1.getBoja() + " "
				+ igrac1.getRank());
	}

	private static void newDeck(Karta igrac1, ArrayList<Karta> sranje) {
		int i =0;
		test: {
			for (Karta karta : sranje) {

				if (igrac1.getBoja() == karta.getBoja()
						&& igrac1.getRank() == karta.getRank()) {
					break test;
				}
				i++;
			}
		}

		System.out.println(i);

		sranje.remove(i);
	}

	// private static void printaj(int igrac, ArrayList<Karta> sranje) {
	// System.out.println(sranje.get(igrac).getBoja() + " "
	// + sranje.get(igrac).getRank());
	// }

	// public static void main(String[] args) {
	// int d = 0;
	// // int asevi=0;
	// // int kraljevi=0;
	// // int babe=0;
	// // int decki=0;
	// // int desetke=0;
	//
	// for (int i = 0; i < 500; i++) {
	// Karta karta3 = new Karta();
	// Karta karta4 = new Karta();
	//
	// while (karta3.getRank() == karta4.getRank()
	// && karta3.getBoja() == karta4.getBoja()) {
	// karta4 = new Karta();
	// }
	// if (karta3.getRank() == karta4.getRank()) {
	// // switch (karta3.getRank()){
	// // case AS:
	// // asevi++;
	// // break;
	// // case KRALJ:
	// // kraljevi++;
	// // break;
	// // case BABA:
	// // babe++;
	// // break;
	// // case DECKO:
	// // decki++;
	// // break;
	// // case DESETKA:
	// // desetke++;
	// // break;
	// // }
	// System.out.println(i + ".\n" + karta3.getBoja() + " "
	// + karta3.getRank() + "\n" + karta4.getBoja() + " "
	// + karta4.getRank());
	// d++;
	// }
	// }
	//
	// System.out.println(d);
	// //
	// System.out.println("broj aseva: "+asevi+"\nbroj kraljeva: "+kraljevi+"\nbroj baba: "+babe+"\nbroj decki: "+decki+"\nbroj desetki:"+desetke);
	//
	// }

}
