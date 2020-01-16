/*
 *  while(true)/for(;;) 는 무한루프
 *  
 *  반복문을 제어하는 명령어 break, continue가 있다.
 *  continue = 특정내용을 제외한다.
 *  break    = 반복문을 종료한다.
 */
import java.util.Scanner;

public class 반복문11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// while 1 ~ 사용자입력값  까지의 짝수합, 홀수합, 총합을 출력
		
		int sum=0,even=0,odd=0;
		int i=1;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("정수 입력 : ");
		int user = scan.nextInt();
		
		while (i<=user)		
		{
			sum+=i;
			if (i%2==0)  even+=i;
			else          odd+=i;
			i++;
		}
		
		System.out.println("총합 : "+sum);
		System.out.println("짝수의 합 : "+even);
		System.out.println("홀수의 합 : "+odd);
	}

}
