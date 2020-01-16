package 반복문_다중조건문;
import java.util.Scanner;

/*
 *   선택문 : 한개의 값을 받아서 처리 ( break 설정시 한 번만 수행 & 여러번도 가능) 
 *   
 *   형식 ) 
 *   switch(값) ==== 값에 정수,문자,문자열 입력가능
 *   {
 *       case1: 
 *       처리
 *       case2:
 *       처리
 *       case3:
 *       처리
 *       ========
 *       default:
 *       처리
 *       ========default문은 생략가능하다.
 *   }
 *   
 *   끝맺음이 ;이 아니라 :이다. 
 *   break 설정이 핵심이다.
 *   
 *   다중if <=> switch 변경이 자유자재여야한다.
 *   
 *   
 *   
 */

import java.util.Scanner;

public class 선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//입력
		System.out.println("첫번째 정수 : ");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수 : ");
		int num2 = scan.nextInt();
		
		System.out.println("연산자(+,-,*,/) : ");
		String op = scan.next();
		
		//처리
		switch(op) {
		case "+":
			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			break;
		case "-":
			System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			break;
		case "*":
			System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			break;
		case "/":
			if (num2==0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.printf("%d / %d = %.2f\n",num1,num2,num1/(double)num2);
			break;
		default:		
			System.out.println("잘못된 연산자입니다");
		}
		

	}

}
