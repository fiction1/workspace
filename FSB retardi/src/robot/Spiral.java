package robot;

import java.applet.Applet;
import java.awt.Graphics;

public class Spiral extends Applet{
	
	public void init(){
		Robot.setWindow(this);
	}
	public void paint(Graphics g){
		Robot r= new Robot();
		r.olovkaDolje();
		for (int i=0;i<1000;i++){
			r.pomakni(i);
			r.lijevo(36);
		}
	}
}
