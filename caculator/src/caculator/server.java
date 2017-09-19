package caculator;

import java.io.*;
import java.net.*;
import java.math.*;

public class server {
	public static void main(String argv[]) throws Exception
	{
		String clientSentence;
		String Result = "";
		int tmp;
		String arr[];

		//소켓 생성
		ServerSocket welcomeSocket = new ServerSocket(6789);
		System.out.println("Server start..\n");

		//승인
		Socket connectionSocket = welcomeSocket.accept();

		//읽고 쓰기
		BufferedReader inFromClient = 
				new BufferedReader(new InputStreamReader(
						connectionSocket.getInputStream()));

		DataOutputStream outToClient = 
				new DataOutputStream(connectionSocket.getOutputStream());

		//클라이언트에서 정보가 안올때까지 반복
		while((clientSentence = inFromClient.readLine())!= null) {
			System.out.println("FROM CLIENT: " + clientSentence);

			//더하기일경우
			if(clientSentence.startsWith("ADD"))
			{
				arr = clientSentence.split(" ");

				//arr의 길이를 보고 3이상이면 argument가 많다고 생각
				if((arr.length >3))
				{
					Result = "Too many arguments\n";
				}
				else
				{
					tmp = Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]);
					Result = Result + tmp;
				}
			}

			//빼기 일 경우
			else if(clientSentence.startsWith("MINUS"))
			{
				arr = clientSentence.split(" ");

				if((arr.length >3))
				{
					Result = "Too many arguments\n";
				}
				else
				{
					tmp = Integer.parseInt(arr[1]) - Integer.parseInt(arr[2]);
					Result = Result + tmp;
				}
			}

			//나누기일경우
			else if(clientSentence.startsWith("DIV"))
			{
				arr = clientSentence.split(" ");

				if((arr.length >3))
				{
					Result = "Too many arguments\n";
				}
				else if(arr[2].equals("0"))
				{
					Result = "Divided by zero\n";
				}
				else
				{
					tmp = Integer.parseInt(arr[1]) / Integer.parseInt(arr[2]);
					Result = Result + tmp +"\n";
				}
			}

			//곱하기 일경우
			else if(clientSentence.startsWith("MUL"))
			{
				arr = clientSentence.split(" ");

				if((arr.length >3))
				{
					Result = "Too many arguments\n";
				}
				else
				{
					tmp = Integer.parseInt(arr[1]) * Integer.parseInt(arr[2]);
					Result = Result + tmp;
				}
			}

			// 그외의 입력은 잘못되었다고 말해줌
			else
			{
				Result = "Incorrect operations!\n";
			}

			outToClient.writeBytes("Answer = " + Result);
		}
		welcomeSocket.close();
		System.out.println("\n---Server shut down---\n");
	}
}