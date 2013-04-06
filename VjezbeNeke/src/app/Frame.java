package app;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea ja = new JTextArea();
	private JButton button = new JButton("Press me");

	public Frame() {
		setVisible(true);
//		setLocation(25, 25);
		setMinimumSize(new Dimension(400,200));
//		setExtendedState(MAXIMIZED_BOTH);
		
		//setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

		setLayout(new GridLayout(1,1));
		
		ja.setSize(25, 25);
		ja.add(button);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ja.append("\nButton was clicked at");
			}
		});

		add(ja);
		add(button);
	}
}
