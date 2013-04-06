package kasting;

import javax.print.DocFlavor.BYTE_ARRAY;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte byteValue=20;
		short shrotValue=55;
		int intValue=888;
		long longValue=2424242;
		
		float floatValue=2424.5f;
		double doubleValue= 24.4;
		
		System.out.println(Byte.MAX_VALUE);
		
		intValue=(int)longValue;
		System.out.println(intValue);
		
		doubleValue=intValue;
		System.out.println(doubleValue);
		
		
		intValue=(int) floatValue;
		
		System.out.println(intValue);
		
		
		byteValue=(byte)128;
		System.out.println(byteValue);
	}

}
