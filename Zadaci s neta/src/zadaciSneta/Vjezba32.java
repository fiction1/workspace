package zadaciSneta;

public class Vjezba32 {

//////////////////////////////////////////////////
public static int brojacIstih(int broj) {


int brIstih=0;
int m;		//rez module


for (int i =1; i<=broj; i ++){
m=broj%i;
if (m==0){
brIstih++;

}
}

//System.out.println(brIstih);
return brIstih;
}
///////////////////////////////////////////////////

	public static void main(String[] args) {
		int usporedba=0;
		int mozdaNajveci=0;
		int najveciBroj=0;
		int brojacIstihUsporedba;
	
		for (int i=1 ; i<=10000 ; i++){
		
			
			//System.out.println("broj djeljivih brojeva za broj "+i+" je:" +brojacIstih(i));
			brojacIstihUsporedba=brojacIstih(i);
			mozdaNajveci=i;
			
			if (usporedba<brojacIstihUsporedba){
				najveciBroj=i;
				usporedba=brojacIstihUsporedba;
			}
			
		}
		System.out.println("POBJEDNIK!!!!!!!!!!"+najveciBroj+ " ima "+usporedba+" djeljitelja");
		
		
		
	}

}
