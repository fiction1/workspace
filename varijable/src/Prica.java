
class Prica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConsoleReader korisnik= new ConsoleReader(System.in);
		System.out.println("Zdravo. Kako se zoveš: ");
		String ime=korisnik.readLine();
		System.out.println("Koliko imaš godina " + ime +" ?");
		int god=korisnik.readInt();
		System.out.print(god+ " su lijepe godine, ");
		System.out.println("ali " + (god+1)+" je bolja.");
		System.out.println("Vidimo se kasnije "+ime+"!");

	}

}
