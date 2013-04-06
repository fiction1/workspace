package generici;

import java.util.ArrayList;
import java.util.HashMap;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		///////////stari stil prije java 5//////
		ArrayList list = new ArrayList();
		
		list.add("banana");
		list.add(1);
		list.add(155);
		list.add("ananas");
		list.get(2);
		
		int d= (int)list.get(2);
		/////////////////////////////////////////////
		
		//////////////novi stil///////////////
		
		ArrayList<String> strings = new ArrayList<>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String dog=strings.get(2);
		System.out.println(dog);
		
		/////////////////////////////////////////////
		HashMap<Integer, String> map= new HashMap<>();
		map.put(3, "tri");
		System.out.println(map.get(3));
		
	}

}
