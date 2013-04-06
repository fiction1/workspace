package Events;

import java.util.ArrayList;
import java.util.Scanner;

public class EventInvite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		ArrayList<String> eventA= new ArrayList<String>();
//		ArrayList<String> eventB= new ArrayList<String>();
		ArrayList<String> isti=new ArrayList<String>();
		int brojIstih=0;
		
		System.out.println("Unesite id osoba koje su bile na prvom eventu:");
		String A=input.nextLine();
		
		System.out.println("Unesite id osoba koje su bile na drugom eventu:");
		String B=input.nextLine();
		
		String[] nizA= A.split(",");
		String[] nizB= B.split(",");
		
		for (int i = 0; i < nizA.length; i++) {
			for (int j = 0; j < nizB.length; j++) {
				if (nizA[i].equals(nizB[j])){
					isti.add(nizA[i]);
				}
						
			}
		}
		
		brojIstih=isti.size();
		
		System.out.println("Broj istih posjetioca eventa je: "+brojIstih);
		for (int i = 0; i < isti.size(); i++) {
			System.out.println(isti.get(i));
		}
		input.close();
	}

}
