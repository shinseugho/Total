package 라이브러리_io;

import java.io.*;
import java.net.*;
/*   MVC, Spring, Kotlin  
 *   서버
 *        대기서버(: 1개) ====> 연결기기(Socket) ====> 전화기
 *                  ServerSocket(:접속 처리)
 *        통신서버 (: 접속수만큼 생성(: Thread)) Socket
 *        
 *   서버 => 여러 개의 통신하는 프로그램이 필요하다.
 *         ===========(: 동일)              
 */
public class Server implements Runnable{
	
	private ServerSocket ss;
	
	public Server() 
	{
		try
		{
			//bind: 개통, 통신이 가능 
			//bind는 IP, Port로 구성되어있다.
			//서버는 고정포트, 클라이언트는 임시포트
			//listen은 대기상태
			ss=new ServerSocket(3355);
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Server server = new Server();
		new Thread(server).start();
		//server안의 run함수 출력

	}
	
	// 쓰레드 작동
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true)
		{
			try
			{
				Socket s=ss.accept(); //클라이언트의 정보(Socket)
				System.out.println("접속클라이언트IP: "+s.getInetAddress().getHostAddress());
				System.out.println("임시포트: "+s.getPort());
				System.out.println("=======================");
			}catch(Exception ex) {}
		}
	}

}
