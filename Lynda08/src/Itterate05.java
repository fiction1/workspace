import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;


public class Itterate05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Hrvatska");
		lista.add("Srbija");		
		lista.add("Bosna");
		System.out.println(lista);
		ListIterator<String> iteratorListe=lista.listIterator();
		while (iteratorListe.hasNext()){
			String vrijednost= iteratorListe.next();
			System.out.println(vrijednost);
		}
	
		
		
		HashMap<String, String> map= new HashMap<String, String>();
		map.put("Hrvatska", "Zagreb");
		map.put("Bosna", "Sarajevo");
		map.put("Slovenija", "Maribor");
		System.out.println(map);
		Set<String> keys=map.keySet();
		Iterator<String> iterator =keys.iterator();
		while (iterator.hasNext()){
			String value =iterator.next();
			System.out.println("Glavi grad " +value+" je " +map.get(value));
		}
		
	}

}
