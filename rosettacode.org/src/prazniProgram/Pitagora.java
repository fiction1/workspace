package prazniProgram;

public class Pitagora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		int sum=10000;
		for (a = 1; a <= sum / 3; a++) {
			for (b = a + 1; b <= sum / 2; b++) {
				c = sum - a - b;
				if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
						&& c>0) {
					System.out.println(a * b *c);
				} else {
					continue;

				}

			}

		}

	}

}
