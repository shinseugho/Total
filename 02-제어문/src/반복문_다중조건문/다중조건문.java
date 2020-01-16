package 반복문_다중조건문;
/*
 *     다중조건문 : 여러개의 조건을 제시하고 해당 조건 1개만 수행이 되도록 만든다.
 *     
 *     1) 형식 
 *        if ( 조건문 )
 *            실행문장1         true 일 경우, 실행문장1을 수행하고 종료
 *                           false 일 경우, 바로 밑 조건문으로 이동
 *        else if ( 조건문 )
 *                 실행문장2
 *        else if ( 조건문 )
 *                 실행문장3
 *        ================         
 *        else 
 *                 실행문장4
 *        ================  해당 조건이 없는 경우에 처리 (생략이 가능하다.)         
 */

//성적처리 3개의 점수를 받아서 총점,평점, 학점을 출력

import java.util.Scanner;

public class 다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor,eng,math,total,temp ; 
		double avg ; 
		char score ; 
		
		Scanner scan = new Scanner(System.in) ;
		
		/* new 는 메모리할당 역활
		 * Scanner(Sytem.in) 은 변수에 대한 초기화 ( 생성자 )
		 * 클래스는 사용자 정의 데이터형 (변수+메소드)이다.
		 */
				
		System.out.println("국어 점수 : ");
	    kor = scan.nextInt();
		
		System.out.println("영어 점수 : ");
	    eng = scan.nextInt();
	    
		System.out.println("수학 점수 : ");
	    math = scan.nextInt();
	    
	    total = kor + eng + math ;
	    
	    avg = total/3.0 ;
	    
	    temp = (int)avg;  // total/3 과 동일하다. 
	    
	    if (temp >= 90)       score = 'A';
	    else if ( temp >=80 ) score = 'B';
	    else if ( temp >=70 ) score = 'C';
	    else if ( temp >=60 ) score = 'D';
	    else                  score = 'F';
	    
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score);
		
	}

}
