package 라이브러리_java.util;
import java.util.*;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data ="Java Oracle HTML CSS JavaScript JSP Spring Kotlin";
		StringTokenizer st = new StringTokenizer(data);
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		

	}

}
