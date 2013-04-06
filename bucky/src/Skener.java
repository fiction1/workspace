
import java.util.*;

class Skener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner unos= new Scanner(System.in);
//		String ime;
//		
//		System.out.println("Kak se zoves?");
//		ime=unos.next();
//		System.out.println(ime);
		int goal=1000100;
		int small=1000000;
		int big=1000;
		
		boolean a;
		 if (goal > small + big * 5){
		        a=false;}
		    else if (goal % 5 == 0){ 
		        a= goal / 5 <= big;}
		    else
		        {a= goal % 5 <= small;}
		 System.out.println(a);
		
	}

}
