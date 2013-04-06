package novi;

public class Sat {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		Vrijeme vrijeme = new Vrijeme();
		vrijeme.setTime(13, 37, 25);
		System.out.println(vrijeme.toMilitary());
		System.out.println(vrijeme.toString());
		
		
	}

}
