package io_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ScannerStream extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextArea area;

	public ScannerStream() throws FileNotFoundException {
		panel = new JPanel();
		area= new JTextArea();
		panel.add(area);

		add(panel);
		setVisible(true);
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Scanner s = null;

		try{
			s = new Scanner(new BufferedReader(new FileReader("pjesma.txt")));
			s.useLocale(getLocale());
			while (s.useDelimiter("a") != null) {
				area.append(s.next()+"\n");
			}}
		finally{ if (s != null) {
            s.close();}
		}
		
	}


	public static void main(String[] args) {
		try {
			new ScannerStream();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
