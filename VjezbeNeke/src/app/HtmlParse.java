package app;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class HtmlParse extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8278202955201830302L;
	private JTextArea text= new JTextArea();
	private JScrollPane pane= new JScrollPane(text);

	public HtmlParse() throws IOException {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(25, 25, 300, 200);
		
		pane.setVisible(true);
		
		add(text);
		String s="<html><head><title>First parse</title></head>"
		  + "<body><p>Parsed HTML into a doc.</p></body></html>";

		Document doc = Jsoup.connect("http://www.hnb.hr/tecajn/").get();//"http://en.wikipedia.org/").get();
		Document doc2 = Jsoup.parse(s);
		Elements newsHeadlines = doc.select("#mp-itn b a");
		Elements title = doc.getAllElements();
		text.append(newsHeadlines+"\n");
		text.append(title+"\n");
	}

	public static void main(String[] args) throws IOException {
		new HtmlParse();
	}

}
