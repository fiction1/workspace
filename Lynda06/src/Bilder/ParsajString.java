package Bilder;

public class ParsajString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="Dobrodosli u vukojebinu!";
		System.out.println("Duzina stringa je:" +s1.length());
		int pozicija=s1.indexOf("vukojebinu");
		System.out.println("Pozicija vukojebine je:"+pozicija);
		
		String sub=s1.substring(11);
		System.out.println(sub);
		
		String s2="Zdravo        ";
		int duzina1=s2.length();
		System.out.println(duzina1);
		
		String s3=s2.trim();
		System.out.println(s3.length());



	}

}
