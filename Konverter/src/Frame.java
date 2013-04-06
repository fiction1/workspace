import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2486742774121115802L;
	private JTextArea area = new JTextArea("test me");
	private JButton button = new JButton("ok");
	private JTextField unos = new JTextField("edit me");
	private String[] lista = {"Fahrenheit to Celsius", "Celsius to Fahrenheit",
			"Pounds to kilograms", "Kilograms to pounds", "Meters to feets", "Feets to meters" ,};
	private JComboBox<String> list = new JComboBox<>(lista);

	private JPanel p1= new JPanel(new GridLayout(2,1));
	private JPanel p2= new JPanel();
	private JPanel p3= new JPanel();

	private JLabel l1= new JLabel("Celsius");
	private JLabel l2= new JLabel("Fahrenheit");

	public Frame() {
		setResizable(false);
		setTitle("Many converter");
		setVisible(true);
		setLocation(25, 25);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(300, 200));
		setLayout(new GridLayout());
		area.setEditable(false);
//		GridBagConstraints grid = new GridBagConstraints();
//		grid.anchor = GridBagConstraints.EAST;
//		grid.gridx = 0;
//		grid.gridy = 0;

		
		// combobox
		add(p1);
		p1.add(list);
		p2.setBackground(Color.RED);
		p3.setBackground(Color.BLUE);
		
		
		p1.add(p2);
		p2.setLayout(new GridLayout(2,2));
//		p2.add(p3);
		p3.add(button);
		p3.add(list);
		
		p2.add(area);
		p2.add(l1);
//		p2.add(button);
		p2.add(unos);
		p2.add(l2);
//		p2.add(p2);
		p1.add(p3);

		list.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText(vrijednostL1(list.getSelectedIndex()));
				l2.setText(vrijednostL2(list.getSelectedIndex()));
				
			}
		});
		
		
		
		unos.addMouseListener(new MouseAdapter() { // mouse pressed "textfield"
			public void mousePressed(MouseEvent me) {
				unos.setText("");

			}
		});

		unos.addActionListener(new ActionListener() { // text field enter
														// ponasanje

			@Override
			public void actionPerformed(ActionEvent e) {

				convert(list.getSelectedIndex());


			}
		});

		button.addActionListener(new ActionListener() { // / akcija na "BUTTON"

			@Override
			public void actionPerformed(ActionEvent e) {
				convert(list.getSelectedIndex());
			}
		});

	}

	public String vrijednostL1(int a){   //bira odgovarajucu vrijednost za L1
		
		String b=null;
		
		switch (a){
		case 0:
			b="Celsius";
			break;
		case 1:
			b="Fahrenheit";
			break;
		case 2:
			b="Kilograms";
			break;
		case 3:
			b="Pounds";
			break;
		case 4:
			b="Feets and inches";
			break;
		case 5:
			b="Meters";
			
		}
		
		
		return b	;
	}
	
	
public String vrijednostL2(int a){   //bira odgovarajucu vrijednost za L2
		
		String b=null;
		
		switch (a){
		case 0:
			b="Fahrenheit";
			break;
		case 1:
			b="Celsius";
			break;
		case 2:
			b="Pounds";
			break;
		case 3:
			b="Kilograms";
			break;
		case 4:
			b="Meters";
			break;
		case 5:
			b="Feets and inches";
			
		}
		
		
		return b	;
	}
	
	public void convert(int p) {
		area.setText("");
		float a = 0;

		try {
			String s = unos.getText();
			a = Float.parseFloat(s);
			float c = 0;
			switch (p) {
			case 0: // F to cel
				c = (5f / 9f) * (a - 32f);
				area.append(String.format("%4.2f °C", c));
				break;

			case 2: // pound-kg
				c = a * 0.4535f;
				area.append(String.format("%4.2f kg", c));
				break;

			case 3: // kg-p
				c = a / 0.4535f;
				area.append(String.format("%4.2f lbs", c));
				break;

			case 5:// feet to m
				c = a * 0.3048f;
				area.append(String.format("%6.4f m", c));
				break;

			case 4: // m to feet

				float rje = a *39.37f;
				float rje1=rje%12;
				int c2=(int) rje/12;
			
				area.append(String.format("%d' %.2f\"", c2,rje1));
				break;

			case 1:// cel to F
				c = (a * (9f / 5f)) + 32f;
				area.append(String.format("%4.2f F", c));
			}

		} catch (NumberFormatException e1) {
			area.append("Enter NUMBER!!!");

		}
	}

}
