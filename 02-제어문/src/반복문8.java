// 구구단 => dan을 입력받아서 
/*
 * 프로그램
 * ======
 * 사용자 정의 + java라이브러리 + 외부오픈소스(mvnrepository.com)
 * ==================================================== 조립
 */
import java.util.Scanner;

public class 반복문8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단 입력 : ");
		int dan = scan.nextInt();
		
		int i = 1;
		while(i<=9)
		{
			System.out.printf("%2d *%2d = %2d\n",dan,i,dan*i);
			i++;
		}

	}

}
