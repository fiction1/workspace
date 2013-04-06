package cave;

import java.util.Scanner;

public class DajPet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a=0;
		
		do{
			System.out.println("Give me 5!!");
			a=input.nextInt();
		}while(a!=5);
		
		System.out.println("High five");
	}

}
