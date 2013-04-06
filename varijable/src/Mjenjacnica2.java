
public class Mjenjacnica2 {

	
	public static void main(String[] args) {
		ConsoleReader neznam = new ConsoleReader(System.in);   

		System.out.println("Unesi iznos eura: ");
		int euro=neznam.readInt();
		System.out.println("Unesi iznos centa: ");
		int cent=neznam.readInt();
		cent=100*euro+cent;
		double kuna = cent*0.0751;
		System.out.print("Kuna: " + kuna);
	}

}
