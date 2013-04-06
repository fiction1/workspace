import java.io.Console;
import java.util.logging.ConsoleHandler;


public class Metode {

	
	public static float prosjek(float[] zbroj){			//zbroj je mjesto na kojem se koristi niz za koji se poziva metoda
		float sum=0F;
		for (int i=0; i<zbroj.length; i++){
			sum +=zbroj[i];
		}
		return sum/zbroj.length;
	}
	
	public static float djelomicniProsjek(float[]zbroj, int first, int last){		// metoda se pozica s 3 varijable
		float sum=0F;
		for (int i=first;i<last;i++){
			sum +=zbroj[i];
		}
		return sum/(1+last-first);
		
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		
		float[] zbroj= {1.5F,45F, 46f,34.8F,500F};
		float sum =0F;
		
		float[] kita={1.5F,45F, 46f,34.8F,500F, 200F, 400F, 600F, 800F, -2627.3F};
		
		
		for (int i=0 ; i<zbroj.length ; i++){
			sum += zbroj[i];
		}
		float prosjek= sum/zbroj.length;
		
		float[] broj2 = {200F, 400F, 600F, 800F};
		float sum2 =0F;
		
		for (int i=0; i<broj2.length; i++){
			sum2 +=broj2[i];
		}
		float prosjek2 = sum2/broj2.length;
		
		
		
		System.out.println("Prosjek niza  je: " +prosjek(zbroj));		//metoda prosjek se poziva za niz zbroj
		System.out.println("Prosjek niza  je: " +prosjek2);
		System.out.println("Prosjek niza  je: " +prosjek(broj2));
		System.out.println("Prosjek niza  je: " +prosjek(kita));
		System.out.println("Djelomicni prosjek niza je: " +djelomicniProsjek(kita,1,5));		//poziva se metoda djelomicniProsjek koja koristi 3 varijable 
	}																							//(moze imati isto ime s ostalim metodama ali nesmije imati isti broj varijabli) 

}
