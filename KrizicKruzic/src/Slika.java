import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;

public class Slika extends JFrame {
	private JPanel sadrzaj = new JPanel();
	private JPanel polje1 = new JPanel();
	private JPanel polje2 = new JPanel();
	private JPanel polje3 = new JPanel();
	private JPanel polje4 = new JPanel();
	private JPanel polje5 = new JPanel();
	private JPanel polje6 = new JPanel();
	private JPanel polje7 = new JPanel();
	private JPanel polje8 = new JPanel();
	private JPanel polje9 = new JPanel();


	
	public Slika() {
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBackground(Color.black);
		sadrzaj.setMaximumSize(new Dimension(600, 600));
		sadrzaj.setLayout(new GridLayout(3, 3));
		sadrzaj.setBackground(Color.RED);
	
		add(sadrzaj);
		sadrzaj.add(polje1);

		polje1.setBackground(Color.blue);
		sadrzaj.add(polje2);
		sadrzaj.add(polje3);
		sadrzaj.add(polje4);
		sadrzaj.add(polje5);
		sadrzaj.add(polje6);
		sadrzaj.add(polje7);
		sadrzaj.add(polje8);
		sadrzaj.add(polje9);
		
		polje1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
			
				polje1.setBackground(Color.red);
				
			

			}
		});
			
	


	}

}
