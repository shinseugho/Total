package ���̺귯��_io;

import java.io.*;
import java.net.*;
/*   MVC, Spring, Kotlin  
 *   ����
 *        ��⼭��(: 1��) ====> ������(Socket) ====> ��ȭ��
 *                  ServerSocket(:���� ó��)
 *        ��ż��� (: ���Ӽ���ŭ ����(: Thread)) Socket
 *        
 *   ���� => ���� ���� ����ϴ� ���α׷��� �ʿ��ϴ�.
 *         ===========(: ����)              
 */
public class Server implements Runnable{
	
	private ServerSocket ss;
	
	public Server() 
	{
		try
		{
			//bind: ����, ����� ���� 
			//bind�� IP, Port�� �����Ǿ��ִ�.
			//������ ������Ʈ, Ŭ���̾�Ʈ�� �ӽ���Ʈ
			//listen�� ������
			ss=new ServerSocket(3355);
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Server server = new Server();
		new Thread(server).start();
		//server���� run�Լ� ���

	}
	
	// ������ �۵�
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true)
		{
			try
			{
				Socket s=ss.accept(); //Ŭ���̾�Ʈ�� ����(Socket)
				System.out.println("����Ŭ���̾�ƮIP: "+s.getInetAddress().getHostAddress());
				System.out.println("�ӽ���Ʈ: "+s.getPort());
				System.out.println("=======================");
			}catch(Exception ex) {}
		}
	}

}
