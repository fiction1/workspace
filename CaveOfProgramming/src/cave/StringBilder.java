package cave;

public class StringBilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String info = "";
		info += "Moje ime je Bob";
		info += " ";
		info += "I am a builder";

		System.out.println(info);

		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		System.out.println(sb);

		StringBuilder s = new StringBuilder();

		s.append("My name is Tomislav").append(" ").append("I am a skydiver.");

		System.out.println(s);

		// /// Formatting //////////

		System.out
				.print("Here is some text.\tThat was a tab.\nThat was a newline");
		System.out.println(" More text");

		System.out.printf("Total cost %d\n", 5);

		System.out.printf("Total cost: %-5d ; quantity is %d\t", 5, 120);
//		for (int i = 0; i < 20; i++) {
//			System.out.printf("%2d: some text %s \n", i, "Hahaha");
//			
//		}
		
		System.out.printf("Total value: %5.3f \n", 5.3);
		System.out.printf("Total value: %-6.1f\n", 325.64252);
		

	}

}
