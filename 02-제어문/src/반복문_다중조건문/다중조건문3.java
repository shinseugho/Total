package 반복문_다중조건문;
//정수 2개입력받아서 연산자 1개 사칙연산처리
//String 은 ==을 쓰지말고  equals를 써야한다.

import java.util.Scanner;

public class 다중조건문3 {

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
	
	
	//결과
	if(op.equals("+"))
	{
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
	}
	else if(op.equals("-"))
	{
		System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
	}
	else if(op.equals("*"))
	{
		System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
	}
	else if(op.equals("/"))
	{
		if (num2==0)
			System.out.println("0으로 나눌 수 없습니다.");
		else
			System.out.printf("%d / %d = %.2f\n",num1,num2,num1/(double)num2);
	}	
	else
	{
		System.out.println("잘못된 연산자입니다");
	}
	
	}

}

