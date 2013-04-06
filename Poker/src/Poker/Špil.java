package Poker;
public class Špil {
		private static Karta[] karta = new Karta[52];

	public Špil() {
		int i = 0;
		for (Boja boja : Boja.values()) {
			for (Rank rank : Rank.values()) {
			//	karta[i] = new Karta(rank, boja);
				System.out.println(rank + " " + boja);
			}
		}
	}


}
