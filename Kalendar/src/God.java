
public class God {
	private int god;
	private static int refGod=2012;
	
	public static boolean prijestupnaGod(int god){		
		return (((god%100)!=0)&&(god%4==0)|| (god%400==0));		
	}
	
	public int godDana(int god){
		int dani=0;
		if (prijestupnaGod(god)){
			dani=366;
		} else {
			dani = 365;
		}
		return dani;
	}
	
	public static boolean godina(int god){
		boolean rez=false;
		if (god==refGod) {
			rez=true;
		}
		return rez;
	}
}
