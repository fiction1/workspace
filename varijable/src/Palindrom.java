import java.util.Scanner;
/**
 * @author Tomislav
 *
 */
public class Palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner unos= new Scanner(System.in);
		
		System.out.println("Unesite neku rijeè: ");
		String rijec=unos.nextLine();
		
		
		
		
		System.out.println("Unjeli ste: "+rijec);
		
		int x=rijec.length();

		int a;
		
		
		do	{
	        	System.out.println("koje slovo rijec zelite? (od 1 do"+x+")");
	            a=unos.nextInt();
	            }while (a > x || a<=0);
		
	    int b=a-1;
	    int j=1;
	    int i=0;
	    
	    String[] niz= rijec.split("(?!^)")		;		/*("");*/
	    String[] palindrom=new String[x];
	    
		do{ 
			System.out.println(j+". : "+niz[i]+"   ");
			i++;
			j++;
			
		}while (i<x);
		
		
		int m=0,n=x-1;
		
		
		
		do {
			palindrom[m]=niz[n];
			System.out.println(palindrom[m]+"   ");
			m++;
			n--;
			
		}while(m<=x-1);
		
		int z=0;
		boolean uvjet=true;
		
	
		
		while (z<x-1 && uvjet==true) {
			if (niz[z].equals(palindrom[z])){
				System.out.println("notbreak");
				uvjet=true;
				}
				else {
					uvjet=false;
					System.out.println("Rijec nije palindrom");
					
				}
			z++;
			
			if(z==x-1 && uvjet==true){
			System.out.println("Rijec je palindrom");
		}
		}
		
		
	    String h=niz[3]; 
		
		System.out.println("\n"+"3.slovo niza je: " +h); 
		
		
		System.out.println(a+".slovo: "+rijec.substring(b,a));
		System.out.println("Duljina rijeci je (x): "+x);
		
		
		
		
		}

}




/*

[21:51] [W From] [90:Tilionis:1]: while (x < y)
[21:51] [W From] [90:Tilionis:1]: {
[21:52] [W From] [90:Tilionis:1]: if (niz[x] != niz[y]) return false;
[21:52] [W From] [90:Tilionis:1]: x++; y--;
[21:52] [W From] [90:Tilionis:1]: }
[21:52] [W From] [90:Tilionis:1]: return true;  */