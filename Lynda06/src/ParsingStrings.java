
public class ParsingStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1="Dobrodosli u Zlatar!";
		
		System.out.println("Duljina stringa: "+s1.length());
		
		int pos = s1.indexOf("Zlatar");
		System.out.println("Pozicija Zlatara: "+pos);
		
		String sub= s1.substring(13);
		System.out.println(sub);
		
		
		String s2="Dobrodosli!               ";
		int len1=s2.length();
		System.out.println(len1);
		String s3=s2.trim();
		System.out.println(s3.length()+s3);
	}

}
