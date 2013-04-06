package datum1;

public class Datum1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Datum sastanak2=new Datum(15,4,2013);
		Datum boljiSastanak=new Datum(10,12,1985);
//		Datum sastanak=new Datum();
//		sastanak.dan=10;
//		sastanak.mj=4;
//		sastanak.god=2000;
//		sastanak.dan++;
//	
//		ispis(sastanak);
		
//		boljiSastanak.sljedeciDan();
		boljiSastanak.sljedeciDan();
		ispis(boljiSastanak);
//		ispis(sastanak);
		
		
	}

	private static void ispis(Datum sastanak) {
		System.out.println("Sastanak je "
				+sastanak.getDan()+"/"
				+sastanak.getMj()+"/"
				+sastanak.getGod());
	}

}
