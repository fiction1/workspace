package cave;


class Thing{
	public String ime;
	public static String opis;
	
	
	
}

public class Stvar {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thing stvar1= new Thing();
		Thing stvar2= new Thing();
		stvar2.opis="Smrdim";
		stvar1.opis= "Mirisim";
		stvar1.ime="Ðubre";
		stvar2.ime="Gnoj";
		
		System.out.println(stvar1.opis);
		System.out.println(stvar2.opis);
		
	}

}	
