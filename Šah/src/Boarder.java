import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Point;


public class Boarder extends JPanel {

	/**
	 * Create the panel.
	 */
	public Boarder() {
		setVisible(true);
		setMinimumSize(new Dimension(400, 400));
		setMaximumSize(new Dimension(400, 400));
		setSize(new Dimension(400, 400));
		setLayout(new GridLayout(8, 8, 0, 0));
		
		String[]s= {"A","B","C","D","E","F","G","H"};
		for (int slova = 0; slova <63; slova++) {
			
			new JPanel();
		}

	}
	public static void main(String[] args) {
		new Boarder();
	}

}
