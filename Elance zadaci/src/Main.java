import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner unos= new Scanner(System.in);
		String input=unos.nextLine();
		
		String[] datum= input.split("-");
		
		int godina=Integer.parseInt(datum[0]);
		int mjesec=Integer.parseInt(datum[1]);
		
		Date date= (new GregorianCalendar(godina, mjesec, 10)).getTime();
		SimpleDateFormat f = new SimpleDateFormat("EEEE");
	    String day=f.format(date);
	    System.out.println(day);
	    

		
		
		
		
		
	}

}
