package prazniProgram;

public class Prosti1001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=1;
		
		for (int i = 3;; i+=2) {
		
			for (int j = 2; j <= i; j++) {
				if(i%j==0 && j!=i){
					break;
				} else if (j==i) {
					n++;
					System.out.println(i);
				}
			}
			
			
			
			if (n==10001) {
				System.out.println(i);
				break;
			}
			
		}
		
		
	}

}
