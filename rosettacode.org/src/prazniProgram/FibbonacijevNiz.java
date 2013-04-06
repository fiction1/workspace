package prazniProgram;



public class FibbonacijevNiz {

	public static void main(String[] args) {
		int sum = 0;
		int start=1;
		int pamtilo=0;
		
		int rjesenje=0;
		do{
			sum=start+pamtilo;
//			System.out.println(sum);
			pamtilo=start;
			start=sum;
			if (sum%2==0) {
				rjesenje+=sum;
				System.out.println(rjesenje);
			}
			
		}while (sum<4_000_000);
		
	}
}
