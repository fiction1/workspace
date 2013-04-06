package app;
import java.util.Scanner;
public class TestPass {



	public static void main(String[] args) {
	String[] Array = new String[2];
	Scanner in = new Scanner(System.in);
	String pattern = "((?=.*[0-9])(?=.*[A-Z])(?=.*[@#*=])(?=[\\S]+$).{5,10})";

	for(int i=0; i<Array.length;i++){
	Array[i] = in.nextLine();
	   }
	System.out.println(""); //print empty line

	for(int i=0; i<Array.length;i++){
	if(Array[i].matches(pattern)){
	System.out.println("PASS");
	}
	else {
	System.out.println("FAIL");
	}
	       }
	      in.close();

	}
}
	