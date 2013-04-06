
class Mjenjacnica1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConsoleReader lova= new ConsoleReader(System.in);
		int c=750; //tecaj eura 
		System.out.println("Unesite iznos kuna:");
		int kuna=lova.readInt();
		System.out.println("Unesite iznos lipa:");
		int lipa=lova.readInt();
		lipa=kuna*100+lipa;
		double euro=(double)lipa/c;
		System.out.println("Imate: "+euro+" €.");
		
		
	}

}
