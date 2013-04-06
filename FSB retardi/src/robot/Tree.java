package robot;

import java.applet.Applet;
import java.awt.Graphics;

public class Tree extends Applet {
	Robot robi;

	public void paint(Graphics g) {
		robi = new Robot();
		robi.pomakni(-100);
		crtajStablo(60);
	}

	void crtajStablo(double velicina) {
		if (velicina < 1) 
			return;
		
		robi.olovkaDolje();
		robi.pomakni(velicina);
		robi.olovkaGore();
		robi.lijevo(20);
		crtajStablo(velicina * 0.75);
		robi.desno(50);
		crtajStablo(velicina * 0.65);
		robi.lijevo(30);
		robi.pomakni(-velicina);
	}

	public void init() {
		robi.setWindow(this);
	}

}
