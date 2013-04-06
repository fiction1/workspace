package robot;

public class MyNesto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int howMany = args.length;

		if (howMany == 0) {
			System.out.println("Niste upisai ni jedan dodatni argument.");

		} else {

			System.out.println(args[howMany - 1]);
			for (int i = howMany - 2; i >= 0; i--) {
				System.out.print(" " + args[i]);
				System.out.println();
			}
		}

	}

}
