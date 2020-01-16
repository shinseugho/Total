package 라이브러리_java.util;
/*  Wrapper 클래스
 * ========
 * 기본형 (int, long...)을 쉽게 제어하기 위해 만들어진 클래스
 * int => Integer
 * double => Double
 * byte => Byte
 * boolean => Boolean
 * 
 * => String s = "100";
 *    int i = (int)s;
 */
import java.util.*;

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan= new Scanner(System.in); System.out.println("정수 입력: "); String
		 * no1= scan.next();
		 * 
		 * System.out.println("정수 입력: "); String no2= scan.next();
		 * 
		 * System.out.println(Integer.parseInt(no1) + Integer.parseInt(no2));
		 */
		
		String s ="true";
		if(Boolean.parseBoolean(s)==true)
		{
			System.out.println("출력");
		}
	}

}
