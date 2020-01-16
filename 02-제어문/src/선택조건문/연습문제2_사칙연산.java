package 선택조건문;
//정수 두개와 연산자를 받아서 사칙연산

import java.util.Scanner;

public class 연습문제2_사칙연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 첫번째 정수 10
		// 두번째 정수 20
		// 연산자 입력 +  조건 : String op = scan.next()
		//                  char c = op.charAt(0)
		
		//입력부
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 정수 : ");
		int num2 = scan.nextInt();
		
		System.out.println("연산자 입력 : ");
		String op = scan.next();
		
		//연산자 전환
		char c = op.charAt(0) ;
		
		//처리부
		if ( c =='+')
		{
			System.out.println(num1+"+"+num2+" = "+(num1+num2));
		}
		if ( c =='-')
		{
			System.out.println(num1+"-"+num2+" = "+(num1-num2));
		}
		if ( c =='*')
		{
			System.out.println(num1+"*"+num2+" = "+(num1*num2));
		}
		if ( c =='/')
		{
			
			if (num2==0)
				System.out.println("0으로 나눌 수 없습니다");
			else 
				System.out.println(num1+"/"+num2+" = "+(num1/num2));
		}
		
		
	}

}
