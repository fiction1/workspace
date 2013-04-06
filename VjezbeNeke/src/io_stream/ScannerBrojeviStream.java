package io_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ScannerBrojeviStream extends JFrame {

	private JPanel panel;
	private JTextArea area;

	public ScannerBrojeviStream() throws FileNotFoundException {
		panel = new JPanel();
		area = new JTextArea();
		panel.add(area);

		add(panel);
		setVisible(true);
		setLocation(40, 40);
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Scanner s = null;
		double sum = 0;
		try {
			s = new Scanner(new BufferedReader(new FileReader("brojevi.txt")));
			s.useLocale(Locale.US);
			while (s.hasNext()) {
				if (s.hasNextDouble()) {
					sum += s.nextDouble();

				} else {
					s.next();
				}

			}
		} finally {
			if (s != null) {
				s.close();
			}
			area.append(sum + "\n");
		}

	}

	public static void main(String[] args) {
		try {
			new ScannerBrojeviStream();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
