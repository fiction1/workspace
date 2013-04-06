import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel container = new JPanel();
	String[] red = { "A", "B", "C", "D", "E", "F", "G", "H" };

	private HashMap<Polje, Point> lokacije = new HashMap<>();

	public App() {

		setBackground(Color.WHITE);
		setVisible(true);
		setBounds(35, 35, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(container);

		for (String string : red) {
			for (int i = 1; i <= 8; i++) {
				lokacije.put(Polje.valueOf(string + "" + i), new Point(70, 70));
			}
		}
		for (String string : red) {
			for (int i = 1; i < 8; i++) {
				System.out
						.println(lokacije.get(Polje.valueOf(string + "" + i)));
			}
		}

	}

	public void paint(Graphics g) {
		if (g instanceof Graphics2D) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
					RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
		// setFont(new Font("Arial", Font.CENTER_BASELINE, 145));
		//
		// g.drawString("živeli", 20, 175);

		int par = 0; // brojac kockica
		int stupac = 8;

		int col = 0; // index slova

		g.setColor(Color.red);
		g.drawRect(69, 69, 401, 401);

		for (int i = 70; i < 470; i += 50) { // ispis slova dole
			g.setColor(Color.BLACK);
			g.setFont(new Font("Aial", Font.PLAIN, 24));
			g.drawString(red[col], i + 15, 495);
			col++;
		}

		for (int a = 70; a < 470; a += 50) { // kockice
			g.setColor(Color.BLACK);
			g.setFont(new Font("Aial", Font.PLAIN, 24));

			g.drawString(stupac + "", 50, a + 30); // ispis brojeva lijevo

			for (int b = 70; b < 470; b += 50) {
				if (par % 2 != 0) { // if za bijele kockice
					g.setColor(Color.white);
					g.fillRect(a, b, 50, 50);

				} else { // else za crne kockice
					g.setColor(Color.black);
					g.fillRect(a, b, 50, 50);
				}
				par++;
			}
			
			par++;
			stupac--;
		}

	}

	public static void main(String[] args) {

		new App();

	}

}
