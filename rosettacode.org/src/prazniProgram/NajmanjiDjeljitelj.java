package prazniProgram;

public class NajmanjiDjeljitelj {

	public static void main(String[] args) {
		long rez1=0;
		long rez2=0;
		
		
		for (int i = 1; i <= 100; i++) {
			rez1+=i*i;
		}
		
		for (int i = 1; i <= 100; i++) {
			rez2+=i;
		}
		rez2=rez2*rez2;
		
		System.out.println(rez1);
		System.out.println(rez2);
		System.out.println(rez2-rez1);
		
		
		
	}
}
