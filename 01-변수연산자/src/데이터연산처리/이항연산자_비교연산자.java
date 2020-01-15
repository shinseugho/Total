package 데이터연산처리;
/*
 * 값 표현 
 * char    ==> '' 
 * String   => ""
 * int     ==> 10(10진법), 010(8진법), 0x12(16진법), 0b1010101(2진법)
 * long    ==> 10l, 10L
 * float   ==> 10.5f, 10.5F
 * boolean  => true, false
 * 
 * 비교연산자 => 결과값(boolean) : true, false
 * ==(같다)         ex) 6==7(false), 6==6(true)
 * !=(같지않다)      ex) 6!=7(true), 6!=6(false)
 * <(작다)          ex) 6<7(true)   
 * >(크다)          ex) 6>7(false)
 * <=(작거나 같다)    ex) 6<=6(true)
 * >=(크거나 같다)    ex) 6>=6(true)
 * ==============================================  if, while, for 문에서 자주 사용된다.
 * 
 *    *  if문은 조건문
 *   **  while, for문은 반복문
 */

import java.util.Scanner;

public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b1 = 10==11;
		System.out.println("b1="+b1);
		
		b1 = 10!=11;
		System.out.println("b1="+b1);
		
		b1 = 10<11;
		System.out.println("b1="+b1);
		
		b1 = 10>11;
		System.out.println("b1="+b1);
		
		// char은 모든연산에서 정수로 변경
		// A = 65, B = 66
		b1 = 65<='A';
		System.out.println("b1="+b1);
		
		b1 = 65>='B';
		System.out.println("b1="+b1);
		
		//char의 번호 ( ASC )
		System.out.println((int)'A');   //65
		System.out.println((int)'0');   //48
		System.out.println((int)'a');   //97
		
		// 두개의 정수를 받아서 큰 값을 출력
		
		Scanner scan =new Scanner(System.in); 
		
		/* 
		 * scan.nextInt()              int
		 * scan.nextDouble()           double
		 * scan.next()                 String
		 * scan.nextBoolean()          boolean
		 * scan.nextchar()은 존재하지않는다.
		 */
		
		//변수
		
		int num1, num2 ;
		
		System.out.print("첫번째 정수 입력 :");  //사용자가 입력
		num1=scan.nextInt();                //num1에 저장      
		
		System.out.print("두번째 정수 입력 :");
		num2=scan.nextInt();
		
		//num1,num2 비교 (삼항연산자 사용/ 조건?true:false)
		
		int result = num1<num2?num2:num1; 
		System.out.println("큰 값은 "+result+" 입니다.");
	}

}
