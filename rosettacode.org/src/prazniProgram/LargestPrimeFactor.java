package prazniProgram;

public class LargestPrimeFactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long rjesenje =0;
		
		long broj= 600_851_475_143L;
	
		for (long i=2; i <= broj/2; i++) {
			if(broj%i==0){
				test:{
				for (long  j = 2; j <= i/2; j++) {
					if (i%j!=0) {
						if(j==i-1){
							rjesenje=i;
							System.out.println(rjesenje);
						}
					}
					else{
						break test;
					}
				}
				}
				
			}
		}
		
		
		
	}

}
