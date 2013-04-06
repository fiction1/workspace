import java.util.ArrayList;


public class Arraylist03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Hrvatska");
		lista.add("Srbija");		
		lista.add("Bosna");
		System.out.println(lista);
		lista.add("Slovenija");
		System.out.println(lista);
		lista.remove(1);
		System.out.println(lista);
		
		String drzava=lista.get(1);
		System.out.println("Druga drzava je: "+drzava);
		
		int pozicija=lista.indexOf("Hrvatska");
		System.out.println(pozicija+1+". je Hrvatska");
		
		int duzina=lista.size();
		System.out.println(duzina + " su drzave u nizu");
		
	}

}
