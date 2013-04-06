package Poker;

import java.util.ArrayList;

public class IgracSTARO {
	private Karta karta;
	
	
	public IgracSTARO(ArrayList<Karta> karta){
//		this.karta=new Karta();
		for (int j = 0; j < karta.size(); j++) {
			if(this.karta.getRank()==karta.get(j).getRank() && this.karta.getBoja()==karta.get(j).getBoja()){
//				this.karta=new Karta();
			}
		}
		
	}
	
	
	
	public Karta getKarta() {
		return karta;
	}



	public void nesto(){
		System.out.println(karta.getRank()+" "+karta.getBoja());
	}
	
	
}
