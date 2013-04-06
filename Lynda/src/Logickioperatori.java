
public class Logickioperatori {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean b1=true;
		boolean b2=false;
		
		boolean b3 =!b1;
		System.out.println("Vrijednost b1 je "+b1);
		System.out.println("Vrijednost b2 je "+b2);
		System.out.println("Vrijednost b3 je "+b3);
	
		int i =1;
		
		boolean b4=(i!=0);
		System.out.println("Vrijednost b4 je "+b4);
		
		String s="tue";
		boolean b5= Boolean.parseBoolean(s);
		System.out.println("Vrijednost b5 je " +b5);
		
	
	}

}
