package ���̺귯��_java.util;
import java.util.*;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "admin|ȫ�浿|1234|����|����|1111-1111";
		StringTokenizer st = new StringTokenizer(data,"|");
		/*
		 * String id = st.nextToken(); String name = st.nextToken(); String pwd =
		 * st.nextToken(); String sex = st.nextToken(); String addr = st.nextToken();
		 * String tel = st.nextToken();
		 * 
		 * System.out.println("ID: "+id); System.out.println("Name: "+name);
		 * System.out.println("Pwd: "+pwd); System.out.println("Sex: "+sex);
		 * System.out.println("Addr: "+addr); System.out.println("Tel: "+tel);
		 */
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		

	}

}
