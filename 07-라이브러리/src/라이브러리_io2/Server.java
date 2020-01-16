package 라이브러리_io2;

import java.util.*;
import java.io.*;
import java.net.*;
/*     클래스의 종류
 *      = 일반클래스
 *      = 추상클래스(인터페이스)
 *      = 내부클래스
 *        1) 클래스끼리 데이터 공유(:static -> 멤버클래스)
 *           class A
 *           {
 *              class B
 *              {
 *              }
 *           
 *           }
 *           server가 가지고 있는 모든 변수 공유
 *       2) 상속없이 오버라이딩 사용(: 익명의 클래스)
 */
public class Server implements Runnable{
	
	private ServerSocket ss;
	//조별포트넘버
	private final int PORT=6666;
	//접속유저정보(ip, port)
	private Vector<Client> waitVc=new Vector<Client>();
	
	//서버가동: 메모리할당 한번만 사용
	public Server() {
		try
		{
	        ss=new ServerSocket(PORT);
	        //개통(: bind), 대기(: listen)
	        System.out.println("Server Start...");
	        
		}catch(Exception ex) {}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 접속시 처리
		 while(true)
		 {
			 try 
			 {
				 //접속시 클라이언트 정보를 받아서 저장하고 쓰래드 전송
				 //접속시에 정보를 Socket(ip,port)
				 Socket s=ss.accept();
				 System.out.println("클라이언트 접속완료!!: "+ s.getInetAddress().getHostAddress());
				 //Socket => 클라이언트(: 유저)
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
		//Server가 가진 모든 데이터 사용가능
		Socket s;//클라이언트 연결(연결기계 => 소프트웨어 제작)
		OutputStream out;//클라이언트로 결과값 전송 
		BufferedReader in;//클라리언트로부터 요청값 송신
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				// 클라이언트로부터 값을 전송할 목적
				out=s.getOutputStream();
				// 바이트크기 변환해주는 코드(input=1byte, stream=2byte)
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				
			}catch(Exception ex) {}
		}
		
		//통신 == 중요! 
		public void run()
		{
			while(true)
			{
				try
				{
					//클라이언트 전송 메세지 읽기
					String msg=in.readLine();
					System.out.println("Client: "+msg);
					//접속한 전체 클라이언트에 값전송
					for(Client c:waitVc)
					{
						c.out.write((msg+"\n").getBytes());
					}
				}catch(Exception ex) {}
			}
		}
	}

}
