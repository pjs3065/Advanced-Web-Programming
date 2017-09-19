package caculator;

import java.io.*;
import java.net.*;

public class client {
	public static void main(String argv[]) throws Exception
	{
		String sentence;
		String Result;

		Socket clientSocket = new Socket("127.0.0.1", 6789);

		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

		while (!(sentence = inFromUser.readLine()).equalsIgnoreCase("exit")) {
			outToServer.writeBytes(sentence +'\n');
			Result = inFromServer.readLine();
			System.out.println(Result);
		}
		clientSocket.close();
	}
}