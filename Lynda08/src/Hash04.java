import java.util.HashMap;


public class Hash04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, String> map= new HashMap<String, String>();
		
		map.put("Hrvatska", "Zagreb");
		map.put("Bosna", "Sarajevo");
		System.out.println(map);
		
		map.put("Slovenija", "Maribor");
		System.out.println(map);
		
		String glavniGrad=map.get("Bosna");
		System.out.println("Glavni grad Bosne je: "+glavniGrad);
		
		map.remove("Slovenija");
		System.out.println(map);
		
		
		
	}

}
