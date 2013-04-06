import java.io.*;


public class Klakulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1= getInput("Unesite neki broj: ");
		String s2= getInput("Unesite neki broj: ");
		String operacija=getInput("Enter 1=Add, 2=Substract, 3=Multiply, 4=Divide");
		int opInt=Integer.parseInt(operacija);
		double result=0;
		
		switch (opInt) {
			case 1:
			result = addValues(s1, s2);
			break;
		case 2:
			result = substractValues(s1, s2);
			break;
			
		case 3:
			result = multiplyValues(s1, s2);
			break;
				
		case 4:
			result = divideValues(s1, s2);
			break;
		default:
			System.out.println("Unjeli ste pogresnu vrijednost!");
			return;
		}
		
		
		
		
//		double result = addTwoValues(s1, s2);
		
		
		System.out.println("rjesenje je "+ result);
		
//		double rezultatOdVise = addMultipleValues(1,2,3,4,5,6,7,8,9,10);
//		System.out.println("1+2+3+4+5="+rezultatOdVise);
		
	
	}

	private static double divideValues(String s1, String s2) {
		double d1= Double.parseDouble(s1);
		double d2= Double.parseDouble(s2);
		double result= d1/d2;
		return result;
	}

	private static double multiplyValues(String s1, String s2) {
		double d1= Double.parseDouble(s1);
		double d2= Double.parseDouble(s2);
		double result= d1*d2;
		return result;
	}

	private static double substractValues(String s1, String s2) {
		double d1= Double.parseDouble(s1);
		double d2= Double.parseDouble(s2);
		double result= d1-d2;
		return result;
	}

	private static double addValues(String s1, String s2)
			throws NumberFormatException {
		double d1= Double.parseDouble(s1);
		double d2= Double.parseDouble(s2);
		double result= d1+d2;
		return result;
	}

//	private static double addTwoValues(String s1, String s2) {
//		double d1= Double.parseDouble(s1);
//		double d2= Double.parseDouble(s2);
//		double result= d1+d2;
//		return result;
//	}

	private static String getInput(String upit){
		BufferedReader stdin= new BufferedReader( 
				new InputStreamReader(System.in));
		
		System.out.print(upit);
		System.out.flush();
		try{
			return stdin.readLine();
		} catch (Exception e){
			return "Error: " +e.getMessage();
		}
		
	}

//	private static double addMultipleValues(double ... values){
//			double rezultat = 0d;
//			for (double d : values) {
//				rezultat+= d;	
//			}
//			return rezultat;
//	}

}
