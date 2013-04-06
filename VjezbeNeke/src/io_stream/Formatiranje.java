package io_stream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Formatiranje extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextArea area;

	public Formatiranje() {
	panel = new JPanel();
	area = new JTextArea();
	panel.add(area);

	int i = 10;
	double r = Math.sqrt(i);
	
	area.append("Korijen od "+i+" je "+r);
//	System.out.format("Korijen od %tB je %-3.1f.",i,r);
	System.out.format("%f, %2$+020.10f %n",Math.PI, Math.PI);
	
	add(panel);
	setVisible(true);
	setLocation(40, 40);
	setSize(300, 200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
	public static void main(String[] args) {
		new Formatiranje();
	}
		
}
