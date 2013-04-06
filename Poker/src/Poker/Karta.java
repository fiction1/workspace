package Poker;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;


public class Karta {
	private Rank rank;
	private Boja boja;
	private BufferedImage slika;

	public Rank getRank() {
		return rank;
	}

	public Boja getBoja() {
		return boja;
	}

	@Override
	public String toString() {
		return boja +" "+rank;
	}
	
	
	public void getKarta() {
		System.out.println(getBoja() + " " + getRank());
	}
	
	public Karta getKarta(Karta karta){
		this.rank=karta.rank;
		this.boja=karta.boja;
		return karta;
	}


	public Karta(Rank rank, Boja boja) {
		this.rank = rank;
		this.boja = boja;
		File slika= new File(rank+"-"+boja+".jpg");
	}
	
	public BufferedImage getSlika() {
		return slika;
	}

	public Karta(ArrayList<Karta> deck){
		ArrayList<Karta> deck1= new ArrayList<>();
		for (Boja boja : Boja.values()) {
			for (Rank rank : Rank.values()) {
				Karta karta = new Karta(rank, boja);
				deck1.add(karta);
			}
			}
		
	}
//
//	public Karta() {
//		rank=null;
//		boja=null;
//	}

	
	
	
	
	 public Karta() { //bezkoristan
	 boja = randomBoja();
	 rank = randomRank();
	 }

	 public Boja randomBoja() { //Bezkoristan
	 int randomBoja = (int) (Math.random() * 4 + 1);
	 switch (randomBoja) {
	 case 1:
	 boja = Boja.HERC;
	 break;
	 case 2:
	 boja = Boja.KARA;
	 break;
	 case 3:
	 boja = Boja.TREF;
	 break;
	 case 4:
	 boja = Boja.PIK;
	 break;
	 }
	 return boja;
	 }

	 public Rank randomRank() { //bezkoristan
	 int randomRank = (int) (Math.random() * 13 + 1);
	 switch (randomRank) {
	 case 1:
	 rank = Rank.AS;
	 break;
	 case 2:
	 rank = Rank.DVOJKA;
	 break;
	 case 3:
	 rank = Rank.TROJKA;
	 break;
	 case 4:
	 rank = Rank.CETVORKA;
	 break;
	 case 5:
	 rank = Rank.PETICA;
	 break;
	 case 6:
	 rank = Rank.SESTICA;
	 break;
	 case 7:
	 rank = Rank.SEDMICA;
	 break;
	 case 8:
	 rank = Rank.OSMICA;
	 break;
	 case 9:
	 rank = Rank.DEVETKA;
	 break;
	 case 10:
	 rank = Rank.DESETKA;
	 break;
	 case 11:
	 rank = Rank.DECKO;
	 break;
	 case 12:
	 rank = Rank.BABA;
	 break;
	 case 13:
	 rank = Rank.KRALJ;
	 break;
	
	 }
	 return rank;
	 }
	

//	 public static void parKarti() { //bezkoristan
//	 Karta karta1 = new Karta();
//	 Karta karta2 = new Karta();
//	
//	 if (karta1.rank == karta2.rank && karta1.boja == karta2.boja) {
//	 karta2 = new Karta();
//	
//	 }
//	 System.out.println(karta1.getBoja() + " " + karta1.getRank() + "\n"
//	 + karta2.getBoja() + " " + karta2.getRank());
//	 if ((karta1.rank == karta2.rank)
//	 || (karta2.rank == Rank.AS && karta1.rank == Rank.AS)) {
//	 System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//	 System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//	 System.out.println("!!!!!!!!!!!!!!!!!!PAŽNJA!!!!!!!!!!!!!!!!!!!!");
//	 System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//	 System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//	 }
//	 }

}
