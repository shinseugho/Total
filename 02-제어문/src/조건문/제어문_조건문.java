package 조건문;
/*
 *     조건문
 *     
 *      1. 단일조건문
 *         1) 형식 1-1) if ( 조건문 )
 *                         실행문장
 *                   
 *               2-2) if ( 조건문 )  
 *                    {
 *                       실행문장1
 *                       실행문장2
 *                    }
 *               
 *               2-3 ) if ( 조건문)
 *                         실행문장1   if와 관련있는 문장 
 *                         실행문장2   if와 관련없는 문장
 *                         
 *         2) 조건문 처리방법     true / false 부정연산자,비교연산자,논리연산자
 *         
 *         3) 실행                   조건이 true     문장수행 O
 *                         조건이 false    문장수행 X
 *                           
 *      2. 선택조건문
 *      3. 다중조건문
 *     
 */

//정수를 입력받아서 홀수/짝수 출력

/*
 *     자바에서 생략 가능
 *     1. import = 라이브러리 클래스를 불러오는 역활 java.lang (System, String, Math ....)
 *     2. return = 모든 메소드는 return 값을 가지지만 생략이 된다.
 *     3. 상속       = 모든 클래스(사용자정의)는 Object상속을 받지만 생략이 된다.
 *     4. 예외처리  = 모든 클래스(사용자정의)는 예외처리를 가지지만 생략이 된다. ( 예외처리 = 비정상종료를 방지하고 정상상태를 유지하여 에러를 미리 방지하는 프로그램이다. )
 */

import java.util.Scanner;   // import 는 이미 만들어진 클래스를 불러올 경우 사용한다.
                            // CBD = 컴포넌트 베이스 
                            // Java는 조립식 프로그램이다.

public class 제어문_조건문 {

	// if 단일조건문 작성   =  if문은 조건을 생각하는 것이 관건이다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner scan = new Scanner (System.in) ;  // 스캔기능활성화
		 
		System.out.print("정수 입력 : ");            // 입력부분
		
		int number = scan.nextInt();              // 입력값 저장 
		
		if (number%2==0)	                      // 사용자입력정수 판단조건문 ( 짝수 )
		{	
			
			System.out.println(number+"는(은) 짝수입니다");
			
		}
		
		if (number%2!=0)	                      // 사용자입력정수 판단조건문 ( 홀수 ) 또는 number%2==1 도 가능은하다.
		{	
			
			System.out.println(number+"는(은) 홀수입니다");
			
		}
	}

}
