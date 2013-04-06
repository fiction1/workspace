
public class DvaDNizovi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [][] drzave= new String [3][2];
		drzave[0][0]= "Hrvatska";
		drzave[0][1]= "Zagreb";
		drzave[1][0]= "Srbija";
		drzave[1][1]= "Beograd";
		drzave[2][0]= "Bosna i Hercegovina";
		drzave[2][1]= "Sarajevo";
		
		for (int i = 0; i < drzave.length; i++) {
			StringBuilder sb= new StringBuilder();
			for (int j = 0; j < drzave[i].length; j++) {
				if (j==0) {
					sb.append("Glavni grad ");
				} 
				else {
					sb.append(" je ");
				}
				sb.append(drzave[i][j]);
				}
			System.out.println(sb);
		}
	}

}
