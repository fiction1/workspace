package app;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class CopyOfXMLBuilder extends JFrame{
	private JTextArea text=  new JTextArea();
	public CopyOfXMLBuilder(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(25, 25, 300, 200);
		add(text);
		text.setEditable(false);
		
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder= factory.newDocumentBuilder();
			Document document= builder.parse("http://www.hnb.hr/tecajn");//"http://www.bug.hr/rss/gmvijesti/");
			
			NodeList list = document.getElementsByTagName("pre");
			text.append("there are "+list.getLength()+ " items\n");
		
			
			for (int i = 0; i < list.getLength(); i++) {
				Element item= (Element)list.item(i);
				text.append(item.getFirstChild().getNodeValue()+"\n");
				
			}
			
			
		} catch (ParserConfigurationException e) {
		} catch (SAXException e) {
		} catch (IOException e) {
		}
	}
	

	public static void main(String[] args) {
	
		new CopyOfXMLBuilder();
		
		
	}

}
