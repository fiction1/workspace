
public class Prosjek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 float[] niz1={1.5F,5F,10F,2.2F,5,8F};
		 float[] niz2={12.5F, 24F, 43F, 65F};
		 
		 
		 
		 System.out.println(prosjek(niz1));
		 System.out.println(prosjek(niz2));
		 ProsjekNiza dva= new ProsjekNiza();
		
			System.out.println(dva.prosjek(niz2));
		
	}
	
	 public static float prosjek (float[] niz){
		 float rezultat=0F;
		 for (int i = 0; i < niz.length; i++) {
			rezultat+=niz[i];
			}
		 rezultat= rezultat/niz.length;
		 return rezultat;
	 }
}
