
public class Metode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		napraviNekaj();
		
		loopMe();
		
	}
	private static void loopMe() {
		int top=10;
		for (int i = 0; i < top; i++) {
			System.out.println("vrijednost je "+i);
		}
	}
	private static void napraviNekaj(){
		System.out.println("Napravi nekaj dela");
	}
}
