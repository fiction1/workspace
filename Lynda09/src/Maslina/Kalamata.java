package Maslina;

public class Kalamata extends Maslina {

	public Kalamata() {
		super(2);
		this.ime="Kalamata";
		this.aroma="Grassy";
		this.boja=Maslina.BLACK;
	}
	

	
	/**
	 * Ovo je unikatna metoda za kalamatu
	 */
	public String getPorijeklo(){
		return "Grèka";
	}

}
