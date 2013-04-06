
public class Uvjeti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=100;
		int b=80;
		if (a<b){
			System.out.println(a+" je manje od"+b);
		}
		else {
			System.out.println(a+" je veci od "+b);
		}
		
		
		switch(a){
		case 100:
		case 99: 
			System.out.println("a je 98 ili 99!");
			break;
		case 90:
			System.out.println("a je 90");
			break;
		case 80:
			System.out.println("a je 80");
			break;
		default:
			System.out.println("A je neki drugi broj");
			break;
		
		}
		
		
	}

}
