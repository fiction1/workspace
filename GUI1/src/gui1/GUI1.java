package gui1;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame	jf = new JFrame("GUI components");
		jf.setLayout(new GridLayout(2,2));
		
		JButton b= new JButton("Click Me");
		
		JTextField tf = new JTextField("edit this");
		
		JPanel p= new JPanel();
		JRadioButton cb1= new JRadioButton("English", true);
		JRadioButton cb2= new JRadioButton("Fran\u00e7ais");
		JRadioButton cb3= new JRadioButton("Deutsch");
		
		ButtonGroup group = new ButtonGroup();
		group.add(cb1);
		group.add(cb2);
		group.add(cb3);
		
		p.setLayout(new GridLayout(3,1));
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		
		String [] labels = { "Fred", "Jim", "Sheila"};
		
		JList l= new JList(labels);
		
		
		
		jf.add(b);
		jf.add(tf);
		jf.add(p);
		jf.add(l);
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(150, 150, 300, 200);
		jf.setVisible(true);
		
		
	}

}
