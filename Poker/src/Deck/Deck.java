package Deck;

import java.util.ArrayList;

import Poker.Boja;
import Poker.Karta;
import Poker.Rank;

public class Deck {
	public ArrayList<Karta> deck= new ArrayList<Karta>();
	
	
	public ArrayList<Karta> getDeck() {
		return deck;
	}



	public Deck(){
		for (Boja boja : Boja.values()) {
			for (Rank rank : Rank.values()) {
				Karta karta = new Karta(rank, boja);
				deck.add(karta);
			}
			}
	}

	
	
	public  Karta dajKartu(int i) {
		return deck.get(i);
	}



	


		
}
