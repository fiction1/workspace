
public class ProsjekNiza {
	public static float prosjek (float[] niz){
		 float rezultat=0F;
		 for (int i = 0; i < niz.length; i++) {
			rezultat+=niz[i];
			}
		 rezultat= rezultat/niz.length;
		 return rezultat;
	}
}
