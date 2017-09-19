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

		//���� ����
		ServerSocket welcomeSocket = new ServerSocket(6789);
		System.out.println("Server start..\n");

		//����
		Socket connectionSocket = welcomeSocket.accept();

		//�а� ����
		BufferedReader inFromClient = 
				new BufferedReader(new InputStreamReader(
						connectionSocket.getInputStream()));

		DataOutputStream outToClient = 
				new DataOutputStream(connectionSocket.getOutputStream());

		//Ŭ���̾�Ʈ���� ������ �ȿö����� �ݺ�
		while((clientSentence = inFromClient.readLine())!= null) {
			System.out.println("FROM CLIENT: " + clientSentence);

			//���ϱ��ϰ��
			if(clientSentence.startsWith("ADD"))
			{
				arr = clientSentence.split(" ");

				//arr�� ���̸� ���� 3�̻��̸� argument�� ���ٰ� ����
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

			//���� �� ���
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

			//�������ϰ��
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

			//���ϱ� �ϰ��
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

			// �׿��� �Է��� �߸��Ǿ��ٰ� ������
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