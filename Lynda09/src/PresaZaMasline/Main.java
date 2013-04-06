package PresaZaMasline;

import java.util.ArrayList;

import Maslina.Kalamata;
import Maslina.Ligurian;
import Maslina.Maslina;
import Presa.Presa;

/**
 * Ovo je main class za moju aplikaciju
 * @author Tomislav
 *@version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Maslina> masline= new ArrayList<Maslina>();
		
		Maslina maslina;
		
		maslina=new Kalamata();
		masline.add(maslina);
		
		maslina=new Ligurian();
		masline.add(maslina);
		
		maslina=new Kalamata();
		masline.add(maslina);

		
		Presa presa =new Presa();
		presa.getUlje(masline);
		
		
		System.out.println("Imate "+ presa.getUkupnoUlje()+" litara ulja");
		
		
		presa.getUlje(masline);
		
		
		System.out.println("Imate "+ presa.getUkupnoUlje()+" litara ulja");
		
		
		Kalamata maslina1=(Kalamata) masline.get(0);
	
		System.out.println("Maslina 1 je iz: "+maslina1.getPorijeklo());
	}

}
