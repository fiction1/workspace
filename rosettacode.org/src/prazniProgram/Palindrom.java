package prazniProgram;

public class Palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long r = 0L;
		long r1=0L;
		long rez=0L;
		for (int i = 1; i < 999; i++) {
			for (int j = 1; j < 999; j++) {

				r = i * j;

				String s = r + "";
				String sd;
				StringBuilder sb = new StringBuilder();

				for (int k = s.length() - 1; k >= 0; k--) {
					sb.append(s.charAt(k));

					
				}
				sd = sb.toString();

				r1=Long.parseLong(sd);
				
				
				if (s.equals(sd)) {
					if(r1>rez){
					rez=r1;
					System.out.println(rez);
					}
					
					
				
					
					
				}

			}
		}
	

	}

}
