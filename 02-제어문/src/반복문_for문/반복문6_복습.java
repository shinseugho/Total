package 반복문_for문;
import java.util.Scanner;

public class 반복문6_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("3자리 대문자 입력 : ");
		String alpha = scan.next();
		
		for(int i=0;i<alpha.length();i++)
		{
			char c = alpha.charAt(i);
			System.out.print((char)(c-3));
		}

	}

}
