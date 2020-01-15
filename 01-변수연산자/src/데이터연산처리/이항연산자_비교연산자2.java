package 데이터연산처리;


//사용자의 입력값을 받아서 (짝수, 홀수) 판단

import java.util.Scanner ;

public class 이항연산자_비교연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner(System.in) ;
	
	//변수 
	int num ;
	
	//입력부
	System.out.println("정수 입력 : ");
	num = scan.nextInt();
	
	//조건문
	String result = num%2==0?"짝수":"홀수" ;
	
	//출력문
	System.out.println(num+"는(은)"+result+"입니다");
		
	}

}
