import java.io.ObjectInputStream.GetField;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

//import java.util.Scanner;

public class Kalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		String datum1 = unos.nextLine();
		

		
//		
			String[] datumNiz1 = datum1.split("/");
//
			int dan1 = Integer.parseInt(datumNiz1[0]);
//			int mj1  = datum(datumNiz1, 1);
//			int god1 = datum(datumNiz1, 2);
			
			
			int dva=new Integer("2351");
//			System.out.println(dan1);
//			System.out.println(mj1);
//			System.out.println(god1);
//			
//			
////	
			System.out.println(dva+"\n"+dan1);
////			
////		String datum2 =unos.nextLine();
////		
////			String[] datumNiz2= datum2.split("/");
//			
//			Calendar datum= Calendar.getInstance();
//			int dan2=datum.get(Calendar.DAY_OF_MONTH);
//			int mj2=(datum.get(Calendar.MONTH))+1;
//			int god2=datum.get(Calendar.YEAR);
//			
////			int dan2 = datum(datumNiz2, 0);
////			int mj2  = datum(datumNiz2, 1);
////			int god2 = datum(datumNiz2, 2);
////	
//			System.out.println(dan2);
//			System.out.println(mj2);
//			System.out.println(god2);
//		
//		int i=0; 	// brojac dana od dana u prvom unosu do dana u drugom unosu
//		int prijestup=0;// brojac prijestupnih
//		int godPr=0;
//		while (god1!=god2 || mj1!=mj2 || dan1!=dan2){
//			if(God.prijestupnaGod(god1)&& god1!=godPr){
//				prijestup++;
//				godPr=god1;
//			}
//			dan1++;
//			i++;
//			if (dan1>Mjesec.danaUMj(mj1, god1)){
//				dan1=1;
//				mj1++;
//				if(mj1>12){
//					mj1=1;
//					god1++;
//				}
//			}
//		
//			
//		}
//		System.out.println("\n"+i+"\nDoviðenja\n"+prijestup);
//		unos.close();
//		
//	
//	}
//
//	private static int datum(String[] datumNiz, int i) {
//		int dan=Integer.parseInt(datumNiz[i]);
//		return dan;
	}
//	
}
