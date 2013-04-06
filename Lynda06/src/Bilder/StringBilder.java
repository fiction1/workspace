package Bilder;

public class StringBilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="Zdravo";
		StringBuilder sb= new StringBuilder(s1);
		sb.append(" tebi konju");
		System.out.println(sb);
	}

}
