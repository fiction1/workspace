
public class Sabstringam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String auto="Mercedes";
		String proba=auto.substring(2,5);
		int probaduljine=proba.length();
		int kvadrat=probaduljine*probaduljine;
		System.out.println(proba);
		System.out.println("Duljina rijeci je:" +auto.length());
		System.out.println("Sva mala slova: "+auto.toLowerCase());
		System.out.println("Sva velka slova: "+auto.toUpperCase());
		System.out.println(kvadrat);

	}

}
