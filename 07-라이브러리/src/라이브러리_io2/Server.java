package ���̺귯��_io2;

import java.util.*;
import java.io.*;
import java.net.*;
/*     Ŭ������ ����
 *      = �Ϲ�Ŭ����
 *      = �߻�Ŭ����(�������̽�)
 *      = ����Ŭ����
 *        1) Ŭ�������� ������ ����(:static -> ���Ŭ����)
 *           class A
 *           {
 *              class B
 *              {
 *              }
 *           
 *           }
 *           server�� ������ �ִ� ��� ���� ����
 *       2) ��Ӿ��� �������̵� ���(: �͸��� Ŭ����)
 */
public class Server implements Runnable{
	
	private ServerSocket ss;
	//������Ʈ�ѹ�
	private final int PORT=6666;
	//������������(ip, port)
	private Vector<Client> waitVc=new Vector<Client>();
	
	//��������: �޸��Ҵ� �ѹ��� ���
	public Server() {
		try
		{
	        ss=new ServerSocket(PORT);
	        //����(: bind), ���(: listen)
	        System.out.println("Server Start...");
	        
		}catch(Exception ex) {}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// ���ӽ� ó��
		 while(true)
		 {
			 try 
			 {
				 //���ӽ� Ŭ���̾�Ʈ ������ �޾Ƽ� �����ϰ� ������ ����
				 //���ӽÿ� ������ Socket(ip,port)
				 Socket s=ss.accept();
				 System.out.println("Ŭ���̾�Ʈ ���ӿϷ�!!: "+ s.getInetAddress().getHostAddress());
				 //Socket => Ŭ���̾�Ʈ(: ����)
				 Client client=new Client(s);
				 client.start();
				 waitVc.add(client);
			 }catch(Exception ex) {}
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();
	}
	//inner class: 	
	class Client extends Thread
	{
		//Server�� ���� ��� ������ ��밡��
		Socket s;//Ŭ���̾�Ʈ ����(������ => ����Ʈ���� ����)
		OutputStream out;//Ŭ���̾�Ʈ�� ����� ���� 
		BufferedReader in;//Ŭ�󸮾�Ʈ�κ��� ��û�� �۽�
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				// Ŭ���̾�Ʈ�κ��� ���� ������ ����
				out=s.getOutputStream();
				// ����Ʈũ�� ��ȯ���ִ� �ڵ�(input=1byte, stream=2byte)
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				
			}catch(Exception ex) {}
		}
		
		//��� == �߿�! 
		public void run()
		{
			while(true)
			{
				try
				{
					//Ŭ���̾�Ʈ ���� �޼��� �б�
					String msg=in.readLine();
					System.out.println("Client: "+msg);
					//������ ��ü Ŭ���̾�Ʈ�� ������
					for(Client c:waitVc)
					{
						c.out.write((msg+"\n").getBytes());
					}
				}catch(Exception ex) {}
			}
		}
	}

}
