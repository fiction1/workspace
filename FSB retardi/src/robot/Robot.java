package robot;

import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Robot {
	private double x, y;
	private double smjer;
	private int pozicijaOlovke; 
	private static Component window;
	public static final int GORE=0, DOLJE=1;

	public Robot() {
		int w = window.getWidth();// // postavi w
		int h = window.getHeight();// //postavi h
		x = 0.5 * w;
		y = 0.5 * h;
		smjer = 90;
		pozicijaOlovke = GORE;

	}

	public void olovkaDolje() {
		pozicijaOlovke=DOLJE;
	}

	public void olovkaGore() {
		pozicijaOlovke=GORE;
	}

	public void lijevo(double deg) {
		smjer = smjer + deg;
	}

	public void desno(double deg) {
		smjer = smjer - deg;
	}

	public void gletaGa(Robot r) {
		double dX = x - r.x;
		double dy = y - r.y;
		double rad = Math.atan2(dy, dX);
		r.smjer = 180 * rad / Math.PI;
	}

	public void pomakni(double s) {
		double stariX = x;
		double stariY = y;
		double radijani = smjer * Math.PI / 180;
		x = x + s * Math.cos(radijani);
		y = y - s * Math.sin(radijani);
		if (pozicijaOlovke==DOLJE) {
			Line2D.Double line = new Line2D.Double(stariX, stariY, x, y);
			Graphics2D g2 = (Graphics2D) window.getGraphics();
			g2.draw(line);
			g2.dispose();
		}

	}

	public static void setWindow(Component c) {
		window = c;
	}

}
