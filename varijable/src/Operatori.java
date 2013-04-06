
import java.util.Scanner;
class Operatori {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		short aShort = 1;
        int anInteger = 13;
        long aLong = 0xCAFEBABE;
		
		
		
		/*Scanner unos=new Scanner(System.in);*/
		short kratki=1;
		int srednji=13;
		/*System.out.print("Unesi neki long:) :");*/
		long dugi2=0xCAFEBABE;
		long dugi=0xCAFEBABE;
		/*long dugi=unos.nextLong();*/
		int konverzija=(int)dugi2;
		
		
		short zamjenadugi=(short)dugi;
		/*
		short zamjenadugi2=(short)dugi2;
		
		System.out.println("Long je: "+dugi+" a long2 je: "+dugi2);*/
		System.out.println("lng kao short je:"+zamjenadugi/*+ " a zamjena dugi 2 je: "+zamjenadugi2*/);
		System.out.println("long CAFEBABE u int  je: "+konverzija);
		
	    anInteger = 64 + 64; //128
        System.out.println("anInteger is " + anInteger);
        anInteger = anInteger - 127; //1
        System.out.println("anInteger is " + anInteger);
        anInteger = anInteger * 100; // 100
        System.out.println("anInteger is " + anInteger);
        anInteger = anInteger / 10; // 10
        System.out.println("anInteger is " + anInteger);
        anInteger = anInteger % 4; // 2.|2|
        System.out.println("anInteger is " + anInteger);
        
        //________________________
        
        System.out.println("anInteger++ daje vrijednost: "+ anInteger++); // 2 (pamti 3)
        System.out.println("anInteger daje vrijednost: "+ anInteger); //3
        System.out.println("++anInteger daje vrijednost: "+ ++anInteger); // 4
        System.out.println("--anInteger daje vrijednost: "+ --anInteger); //3
        
		
    	System.out.println("Assignment value is " + (anInteger = 99));

        // Assignment operators: avoid casts, evaluate once
        anInteger += 99; // equivalent to anInteger = anInteger + 99;
        anInteger += aLong; // assignment operators include implied casts
        
        // Comparison operators return boolean results
        System.out.println("100 > 99  " + (100 > 99));
        System.out.println("100 < 99  " + (100 < 99));
        System.out.println("100 >= 99 " + (100 >= 99));
        System.out.println("100 <= 99 " + (100 <= 99));
        System.out.println("100 == 99 " + (100 == 99));
        System.out.println("100 != 99 " + (100 != 99));
		
		
		
		
		
	}

}
