
public class SimpleArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a1= new int[3];
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		int a2[]= new int[3];
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}
		
		int a3[]={3,4,6};		
		for (int i = 0; i < a3.length; i++) {
			System.out.println(a3[i]);
		}
		System.out.println("Vrijednost pvrog broja je: "+a3[0]);
	}

}
