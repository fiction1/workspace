
public class Strukture1 {

	public static void prikaziItem(Item nekiItem){
		System.out.println("item na lageru je: "+nekiItem.ime+" kolicine "+nekiItem.kolicina+" dkg a cijena mu je "+ nekiItem.cijena +"kn");
		
	}
	
	
	public static void main(String[] args) {
		Item jedanItem = new Item(); 
		jedanItem.ime="pahuljice";
		jedanItem.cijena=30;
		jedanItem.kolicina=500;
		
		Item drugiItem = new Item(); 
		drugiItem.ime="brasno";
		drugiItem.cijena=7;
		drugiItem.kolicina=250;
		
		
//		System.out.println("item na lageru je: "+jedanItem.ime+" kolicine "+jedanItem.kolicina+" dkg a cijena mu je "+ jedanItem.cijena +"kn");
//		System.out.println("item na lageru je: "+drugiItem.ime+" kolicine "+drugiItem.kolicina+" dkg a cijena mu je "+ drugiItem.cijena +"kn");
	
		
		prikaziItem(jedanItem);
		prikaziItem(drugiItem);
	
	}

}
