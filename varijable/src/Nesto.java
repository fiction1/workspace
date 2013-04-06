
class Nesto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x=0;
		String[] a= {"4","5","2","6","3"} ;
		String[] b= {"4","5","3","6","3"};
		boolean c=true;
		do {
		if (a[x]==b[x]){
			System.out.println("isto"+a[x]);
			
		}
		else {
			System.out.println("razlicito");
			c= false;
		}
		x++;
		}while (x<a.length&& c==true);
	

	
	}
}
