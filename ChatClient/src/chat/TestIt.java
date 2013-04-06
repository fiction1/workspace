package chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestIt {

	public static void main(String[] args) throws Throwable{
		ServerSocket ss= new ServerSocket(1234);
		Socket s = ss.accept();
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(
				System.in));
		ChatUI theUI=new ChatUI("Windows Title", new OutputStreamWriter(System.out));
		
		String line;
		while((line=keyboard.readLine()) != null){
			theUI.appendText(line);
		}
		theUI.appendText("Connection lost");
	}

}
