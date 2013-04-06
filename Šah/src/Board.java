import java.awt.Point;
import java.util.HashMap;


public class Board {
	private static HashMap<Polje, Point> polje= new HashMap<>();
	
	
	public static HashMap<Polje, Point> getPolje() {
		return polje;
	}
	
	
	
	public Board(){
		String[]s= {"A","B","C","D","E","F","G","H"};
		for (int slova = 0; slova < 8; slova++) {
			
			for (int brojevi = 1; brojevi <= 8; brojevi++) {
				
				polje.put(Polje.valueOf(s[slova]+""+brojevi), new Point(0,0));
				
				
				
			}
		}
		
	}
	public static void main(String[] args) {
		new Board();
		System.out.println(getPolje());
	}
}
