
public class Strings01 {

	public static void main(String[] args) {
		String s1= "Dobrodosli u Zlatar!";
		String s2= new String("Dobrodosli U Zlatar!");
		System.out.println(s2);
		 
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("Isti su!");
		} else {
			System.out.println("Nisu isti!");
		}
		
		char[] chars=s1.toCharArray();
		for (char c : chars) {
			System.out.println(c);
		}
			
		}

}
