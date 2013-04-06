
public class Dan {
	
	
	public static String[] dan={"ponedjeljak","utorak","srijeda","cetvrtak","petak","subota","nedjelja"};
 


	public static String danIme(int x){
		String danIme=new String();
		if (x>0){
			danIme=dan[(x-1)%dan.length];
			
		}else if(x<=0){
			danIme=dan[dan.length-((-1*(x-1))%dan.length)];
		}
		return danIme;
	}




	
	
	
 
 
}
