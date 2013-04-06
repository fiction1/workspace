package gui;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8026416994513756565L;


	/**
	 * @author Tomislav
	 * izlazi iz programa sa esx
	 */
	private class KeyHandler extends KeyAdapter{   

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode()== KeyEvent.VK_ESCAPE){
				dispose();
			}
		
		}
		
		
		
	}
	
	
	public MainFrame() {
		super("Demo");
		
		addKeyListener(new KeyHandler());
		
		setExtendedState(MAXIMIZED_BOTH);
		
		
		setUndecorated(false);
		getContentPane().setBackground(Color.CYAN);
		
		
		setLocation(25, 25);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
