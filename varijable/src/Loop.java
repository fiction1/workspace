
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 0;
		
		
		while (a<10){
			System.out.print("a je:"+ a++ +"\n");
		}
		System.out.println("Loop je gotov");
		
		while (a<10){
			System.out.print("a je:"+ a++ +"\n");
		}
		System.out.println("Drugi loop je gotov");
		
		do { System.out.print("a je:"+ a++ +"\n");
			} 
		while (a<10);
		System.out.println("\"do while\" loop je gotov");
		
		
		for (int x=0; x<10;x++){
			System.out.println("x je: "+x);
		}
		System.out.println("for petlja je gotova!");
		
		for (; a<20;){
			System.out.println("a je: "+ a++);
		}
		System.out.println("for petlja je gotova!");
		
		
		
		for (;;){
			System.out.println("a je: "+ a++);
			if (a>25){break;}
			}
			
		
	}

}
