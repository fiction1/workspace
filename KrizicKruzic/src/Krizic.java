import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Krizic extends JFrame {

	public Krizic(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500,500);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);

		g.drawLine(30, 30, 60, 60);
		g.drawLine(30, 60, 60, 30);

	}

	public static void main(String[] args) {
		new Krizic();
	}

}
