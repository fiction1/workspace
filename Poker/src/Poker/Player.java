package Poker;

import java.util.ArrayList;

public class Player {
	public String ime = "";
	public Karta karta1;
	public Karta karta2;
	private int gold = 2000;

	public String toString() {
		return "\n"+this.ime + "\n" + this.karta1.getBoja() + " "
				+ this.karta1.getRank() + "\n" + this.karta2.getBoja() + " "
				+ this.karta2.getRank()+"\n";
	}

	public Player() {

	}

	// /////////////////////tester
//	public static void main(String[] args) {
//		Player tomislav = new Player();
//		Player konj = new Player();
//
//		ArrayList<Player> igrac = new ArrayList<>();
//		tomislav.karta1 = new Karta();
//		tomislav.karta2 = new Karta();
//		
//		konj.karta1 = new Karta();
//		konj.karta2 = new Karta();
//		
//		igrac.add(tomislav);
//		igrac.add(konj);
//
//		tomislav.ime = "Tomislav";
//		konj.ime = "Konj";
//		System.out.println(tomislav +"\n" + konj);
//		String ime = "Tomislav";
//
//	}

	// ///////////////
}
