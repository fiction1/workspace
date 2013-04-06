
public class Loops {
	static private String[] mjesec={"Sijecanj", "Veljaca", "Ozujak", 
		"Travanj","Svibanj", "Lipanj",
		"Srpanj", "Kolozov", "Rujan", 
		"Listopad", "Studeni", "Prosinac"};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		for (int i =0; i<mjesec.length;i++){
//			System.out.println(mjesec[i]);
//		}
	
//		for (String mesec : mjesec) {
//			System.out.println(mesec);
//		}
	
		int counter=0;
//		while (counter<mjesec.length) {		
//			System.out.println(mjesec[counter]);
//			counter++;
//		}
		
		do  {		
			System.out.println(mjesec[counter]);
			counter++;
		}while (counter<mjesec.length);

		
	}

}
