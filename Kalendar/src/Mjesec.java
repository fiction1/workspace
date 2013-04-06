
public class Mjesec {
	
	
	
	
	public static int danaUMj(int mj,int god){
		int rez=0;
		switch (mj)	{
		case 4:
		case 6:
		case 9:
		case 11:
			rez =30;
			break;
		case 2:
			if (((god%100)!=0)&&(god%4==0)|| (god%400==0)){
				rez=29;
			}else {
				rez=28;
				}
			break;
		default:
				rez=31;
				}
		return rez;
	}
	
	
}
