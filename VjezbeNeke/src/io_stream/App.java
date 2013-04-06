package io_stream;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class App extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea text;
	private JTextField text2;

	private BufferedImage image;

	/**
 * 
 */
	public App() {
		setTitle("Test");
		setLayout(new GridLayout(2,2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(500, 500));
		setVisible(true);

		text = new JTextArea(400, 400);
		text.setEditable(false);
		text2 = new JTextField();
		add(text);
		add(text2);

		try {
			BufferedReader in = new BufferedReader(new FileReader("pjesma.txt"));
			String l;
			while ((l = in.readLine()) != null) {
				text.append(l + "\n");

			}
			in.close();
		} catch (Exception e) {
		}

		try {
			File slika = new File("As-Pik.jpg");
			// image = ImageIO.read(App.class.getResource());
			image = ImageIO.read(slika);
		} catch (IOException e) {
			System.err.println("neka greska");
		}

		text.setLineWrap(true);

		text2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text3 = text2.getText();
				text.append(text3 + "\n");
				text2.selectAll();

				PrintWriter out = null;
				try {

					out = new PrintWriter(new FileWriter("chat.txt"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				out.println(text3);
				text2.setText("");
			}
		});

	}

	public void paint(Graphics g) {
		super.paint(g);
//		g.drawImage(image, 0, 30, this);
		g.drawImage(image, 10, 130, 283/3, 425/3, this);
	}

	// //////////////////////////////////////////////////////////////main

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new App();

			}
		});
	}

}
