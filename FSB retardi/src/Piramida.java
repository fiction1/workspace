import java.util.Scanner;

public class Piramida {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int a = unos.nextInt();
		int b = unos.nextInt();
		int c = unos.nextInt();

		piramida(a);
		piramida(b);
		piramida(c);

	}

	private static void piramida(int a) {
		for (int i = 1; i <= a; i++) { // broj redova ==a

			for (int z = a - i; z >= 0; z--) { // prazna mjesta
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) { // brojevi
				System.out.print(((int) (Math.random() * i + 1)) + " ");
			}

			System.out.println();
		}
	}

}
