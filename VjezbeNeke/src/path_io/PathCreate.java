package path_io;

import java.awt.Dimension;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class PathCreate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PathCreate() {
		JTextArea area = new JTextArea();
		add(area);

		setVisible(true);
		setLocation(35, 35);
		setMinimumSize(new Dimension(400, 200));
		setTitle("Ljeto nam se vratilo");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		area.setEditable(false);
		Path put = Paths.get("pjesma.txt");
		Path slika = Paths
				.get("C:/Users/Tomislav/workspace/VjezbeNeke/As-Pik.jpg");

		area.append(slika.toString() + "\n");
		area.append(put.toString() + "\n");

		area.append(slika.getFileName() + "\n");
		area.append(put.getFileName() + "\n");

		area.append(put.getNameCount() + "\n");
		area.append(put.getName(put.getNameCount() - 1) + "\n");
		area.append(slika.getParent() + "\\" + slika.getFileName() + "\n");
		area.append(String.format("toString: %s%n", slika.toString()));

		area.append("ovde sam\n");

		area.append(String.format("%s%n", slika.toUri()));

		try {

			Path praviPut = put.toRealPath(LinkOption.NOFOLLOW_LINKS);
			area.append(praviPut + "\n");
		} catch (IOException e) {
			area.append("Some error has occurred");
		}

	}

	public static void main(String[] args) {
		new PathCreate();

	}

}
