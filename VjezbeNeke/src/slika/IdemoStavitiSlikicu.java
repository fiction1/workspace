package slika;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.omg.CORBA.PUBLIC_MEMBER;

public class IdemoStavitiSlikicu extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel content = new JPanel();

	class Slika extends Component {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private BufferedImage img;

		public void paint(Graphics g) {
//			g.drawImage(img, 0, 0, null);
			g.drawImage(img, 0, 0, 100, 150, null);
			g.drawString("živeli", 25, 25);
		}
//
//		public Slika() {
//			
//		
//			
//			
//			try {
//				img = ImageIO.read(new File("As-Pik.jpg"));
//			} catch (IOException e) {
//			}
//
//		}
//
//		public Dimension getPrefferedSize() {
//			if (img == null) {
//				return new Dimension(100, 100);
//			} else {
//				return new Dimension(100, 200);
//			}
//		}
	}

	public IdemoStavitiSlikicu() {
		setBackground(Color.WHITE);
		
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		add(content);

		 add(new Slika() );

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				new IdemoStavitiSlikicu();

			}
		});

	}

}
