import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SwtichWithInts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String unos = getInput("Unesite broj izmeðu 1 i 12: ");
		int mjesec = Integer.parseInt(unos);
		switch (mjesec) {
		
		case 1:
			System.out.println("Mjesec Sijecanj");
			break;
			
		case 2:
			System.out.println("Mjesec Veljaca");
			break;
			
		case 3:
			System.out.println("Mjesec Ožujak");
			break;
			
		default:
			System.out.println("Izabrali ste neki drugi mjesec");
			break;
		}
		
		
	}
	private static String getInput(String upit){
		BufferedReader stdin= new BufferedReader( 
				new InputStreamReader(System.in));
		
		System.out.print(upit);
		System.out.flush();
		try{
			return stdin.readLine();
		} catch (Exception e){
			return "Error: " +e.getMessage();
		}
	}
}
