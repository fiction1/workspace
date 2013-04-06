import java.util.ArrayList;


public class ZbrajanjeNeko {
	
	
	
	public static void main(String[]args){
		
		double[] zbroj={2,4,8,16,32,64,128,256,1024};
		
		double[] veciZbroj=new double[40];
		
		System.arraycopy(zbroj, 0, veciZbroj, 0, zbroj.length);
		
		
		
		for (int i=9;i<veciZbroj.length;i++){
			veciZbroj[i]=veciZbroj[i-1]*2;
		}
		for (int i = 0; i < veciZbroj.length; i++) {
			System.out.println(veciZbroj[i]/(1024*1024));
		}
//		ArrayList<int[]> brojevi=new ArrayList<int[]>();
//		brojevi.add(int)=3;
		
		
	}

}
