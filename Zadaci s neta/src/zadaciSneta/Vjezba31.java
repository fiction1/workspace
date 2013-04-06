package zadaciSneta;

public class Vjezba31 {

	/**
	 * snakeeyes 
	 */
	public static void main(String[] args) {
		int kocka1;
		int kocka2;
		int i=0;
		int brojac=0;
		int brojacIf;
		int avg=0;
		
		
	
			
			do	{	
				kocka1=(int)(Math.random()*6+1);
				kocka2=(int)(Math.random()*6+1);
				i++;
				System.out.println(kocka1+"\n"+kocka2+"____");
				
			
			} while(kocka1!=1 || kocka2 !=1);
		
		
		System.out.println("kocka 1 pokazuje: "+kocka1+".\nKocka 2 pokazuje: "+ kocka2 +"\n To se dogodilo iz "+i +" pokusaja.");
				
			
			
		
	
		
	
		
		
		
		
		
	}

}
