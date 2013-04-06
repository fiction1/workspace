package Maslina;

/**
 * Superklasa svih maslina
 *
 */
public class Maslina {

	/**
	 * Ovo je za crne masline
	 */
	public static final long BLACK = 0x000000;
	/**
	 * ovo je za zelene masline
	 */
	public static final long GREEN = 0x00FF00;

	public String ime = "Kalamata";
	public String aroma = "Travnata";
	public long boja = Maslina.BLACK;
	private int ulje = 3;

	public int getUlje() {
		return ulje;
	}

	public void setUlje(int ulje) {
		this.ulje = ulje;
	}

	public Maslina() { // konstruktor metoda
		System.out.println("Konstruktor od " + this.ime);
	}

	public Maslina(int ulje) {
		setUlje(ulje);
	}

	/**
	 * metoda za drobljenje jedne masline
	 */
	public int drobi() {
		System.out.println("You crushed a " + this.ime + " olive");
		return ulje;

	}

}
