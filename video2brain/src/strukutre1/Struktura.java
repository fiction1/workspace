package strukutre1;

public class Struktura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Item cetkica= new Item();
		cetkica.ime="akvafreš";
		cetkica.cijena=10;
		cetkica.kolicina=2;
		
		Item pasta=new Item();
		pasta.ime="kaladont";
		pasta.cijena=15;
		pasta.kolicina=200;
		
		paket(pasta);
		paket(cetkica);
		
		
	}
	 public static void paket(Item item){
		 System.out.println("Item je "+item.ime+". Cijena mu je: "+item.cijena+" kn. Dolazi u paketu:"+item.kolicina);
	 }
}
