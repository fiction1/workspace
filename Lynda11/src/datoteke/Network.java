package datoteke;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Network {

	public static void main(String[] args) {
		try {
			URL url = new URL(
					"file:///D:/Programiranje/java%20oracle%20tutorial/java/IandI/createinterface.html");

			InputStream stream = url.openStream();
			BufferedInputStream buffer = new BufferedInputStream(stream);

			StringBuilder sb = new StringBuilder();

			while (true) {
				int data = buffer.read();
				if (data == -1) {
					break;
				} else {
					sb.append((char) data);
				}

			}

			System.out.println(sb);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
