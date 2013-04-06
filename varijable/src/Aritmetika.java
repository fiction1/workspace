
public class Aritmetika {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConsoleReader unos= new ConsoleReader(System.in);
		int a,b;
		System.out.println("Unesite prvi cijeli broj: ");
		a=unos.readInt();
		System.out.println("Unesite drugi cijeli broj: ");
		b=unos.readInt();
		int suma =a+b;
		System.out.println("Suma broja:"+a+" i broja b:"+b+" iznosi: "+suma +" !");
		int razlika=a-b;
		System.out.println("Razlika izmeðu broja:" +a+" i broja b:"+b+" iznosi: "+razlika+" !");
		int umnozak=a*b;
		System.out.println("Umnožak broja:" +a+" i broja b:"+b+" iznosi: "+umnozak+" !");
		double prosjek=(a+b)/2;
		System.out.println("Prosjek brojeva " +a+" i "+b+" iznosi: "+prosjek+" !");
		int udaljenost= b-a;
		System.out.println("Udaljenost brojeva " +a+" i "+b+" iznosi: "+Math.abs(udaljenost)+" !");
		
	}

}
