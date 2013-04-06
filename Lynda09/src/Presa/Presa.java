package Presa;
import java.util.Collection;

import Maslina.Maslina;

public class Presa {

	 
	private int ukupnoUlje=0;
	
	
	public int getUkupnoUlje() {
		return ukupnoUlje;
	}

	private void setUkupnoUlje(int ukupnoUlje) {
		this.ukupnoUlje += ukupnoUlje;
	}

	public Presa(){
	}
	
	public void getUlje(Collection<Maslina> masline){
		int ulje=0;
		
		for (Maslina maslina : masline) {
			ulje+=maslina.drobi();
		}
		
		
		setUkupnoUlje(ulje);
//		System.out.println("Imate "+ulje+" litara ulja ");
//		setUkupnoUlje(ulje);
	}
	
	
}
