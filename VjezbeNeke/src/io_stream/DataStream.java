package io_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class DataStream extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextArea text = new JTextArea();

	static final String dataFile = "invoicedata";

	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = { "Java T-shirt", "Java Mug",
			"Duke Juggling Dolls", "Java Pin", "Java Key Chain" };

	public DataStream() throws Throwable {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		text.setEditable(false);
		setVisible(true);
		setBounds(55, 55, 355, 325);
		add(text);
		DataOutputStream out = null;

		try {
			out = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream(dataFile)));

			for (int i = 0; i < prices.length; i++) {
				out.writeDouble(prices[i]);
				out.writeInt(units[i]);
				out.writeUTF(descs[i]);
			}
		} finally {
			out.close();
		}

		DataInputStream in = null;
		double total = 0.0;
		try {
			in = new DataInputStream(new BufferedInputStream(
					new FileInputStream(dataFile)));

			double price;
			int unit;
			String desc;

			try {
				while (true) {
					price = in.readDouble();
					unit = in.readInt();
					desc = in.readUTF();
					System.out.format("You ordered %d units of %s at $%.2f%n",
							unit, desc, price);
					total += unit * price;

					text.append(String.format("You ordered %d units of %s at $%.2f%n",
							unit, desc, price));

				}
			} catch (EOFException e) {
			}
			System.out.format("For a TOTAL of: $%.2f%n", total);
			text.append(String.format("For a TOTAL of: $%.2f%n", total));
		} finally {
			in.close();
		}

	}

	public static void main(String[] args) {

		try {
			new DataStream();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
