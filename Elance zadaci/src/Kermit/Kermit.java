package Kermit;
public class Kermit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a=300;
		int b=6;
		int c=3;
		int d=5;
		int[]skok={20,10,5};
		int duljina=skok.length;
		int rezultat=0;
		
		
		poziv(a, skok, duljina, rezultat);
		poziv(b, skok, duljina, rezultat);
		poziv(c, skok, duljina, rezultat);
		poziv(d, skok, duljina, rezultat);
	}
	
///////////////////////////////////////////////////////////////////////////////
//
///////////////////////////////////////////////////////////////////////////////
	
	private static void poziv(int a, int[] skok, int duljina, int rezultat) {
		for (int i = 0; i < a; i++) {
			
			rezultat+=skok[brojacNiza(duljina, i)];
		}
		System.out.println("Kermit je presao "+ rezultat+"cm");
	}
	
///////////////////////////////////////////////////////////////////////////////
//
///////////////////////////////////////////////////////////////////////////////
	
	public static int brojacNiza(int duljina,int i){
		int rezultat=0;
		rezultat=i%duljina;
		return rezultat;
	}
}
///////////////////////////////////////////////////////////////////////////////
//
///////////////////////////////////////////////////////////////////////////////