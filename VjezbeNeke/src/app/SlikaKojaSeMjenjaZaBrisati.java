package app;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SlikaKojaSeMjenjaZaBrisati extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel container = new JPanel(){
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g; // cast g to Graphics2D
			

		
			
			if (click==1){
				g2.drawLine(250, 250, 40, 250);
				g2.setColor(Color.white);
				g2.drawLine(40, 40, 250, 250);
			} else if(click ==2){
				g2.drawLine(250, 250, 40, 250);
				g2.setColor(Color.white);
				g2.drawLine(40, 40, 250, 250);
				g2.setColor(Color.GREEN);
				g2.drawLine(40, 250, 40, 40);
			} else if (click==3){
				g2.drawLine(250, 250, 40, 250);
				g2.setColor(Color.white);
				g2.drawLine(40, 40, 250, 250);
				g2.setColor(Color.GREEN);
				g2.drawLine(40, 250, 40, 40);
				g2.setColor(Color.BLUE);
				g2.drawLine(40, 40, 250,40);
			}else if(click==4){
				g2.drawLine(250, 250, 40, 250);
				g2.setColor(Color.white);
				g2.drawLine(40, 40, 250, 250);
				g2.setColor(Color.GREEN);
				g2.drawLine(40, 250, 40, 40);
				g2.setColor(Color.BLUE);
				g2.drawLine(40, 40, 250,40);
				g2.setColor(Color.cyan);
				g2.drawLine(250, 40, 250,250);
			}else if(click==5){
				g2.drawLine(250, 250, 40, 250);
				g2.setColor(Color.white);
				g2.drawLine(40, 40, 250, 250);
				g2.setColor(Color.GREEN);
				g2.drawLine(40, 250, 40, 40);
				g2.setColor(Color.BLUE);
				g2.drawLine(40, 40, 250,40);
				g2.setColor(Color.cyan);
				g2.drawLine(250, 40, 250,250);
				g2.setColor(Color.ORANGE);
				g2.drawLine(250, 40, 40,250);
			}
			else
			{
				g2.drawString("GOTOVO!!!", 150, 150);
			}
		}
		
	};
	private static int click = 1;

	public SlikaKojaSeMjenjaZaBrisati() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(25, 25, 300, 300);
		add(container);
		setBackground(Color.BLUE);
		container.setSize(300, 300);
		container.setBackground(Color.RED);
		
		
	

		container.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				
				container.repaint();
				
				click++;
			
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {

			}
		});

	}


	public static void main(String[] args) {
		new SlikaKojaSeMjenjaZaBrisati();

	}

}
