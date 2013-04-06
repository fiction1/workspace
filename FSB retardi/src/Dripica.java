
public class Dripica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int d = 10;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
