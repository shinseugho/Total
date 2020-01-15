package 데이터연산처리;
import java.util.*;   // Scanner 기능 ( 변수 scanf )
/*
 *     자바와 C언어의 차이 
 *     
 *     자바 는 클래스 단위 기반
 *     C언어는 함수 단위 기반
 */
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /* 변수 => 값을 설정하는 방식     1. 직접입력     int a; //선언 a = 10
         *                                  int a = 10; //선언과 동시에 값을 대입 
		 *                       2. 입력한 값을 받아서 저장
		 *                       3. 랜덤(난수) => 임의의 수를 저장  
		 */                   
/*  int a=(int)(Math.random()*100)+1; // Math.random() 은 0.0 ~ 0.99 의 사이 숫자가 임의 생성된다. 따라서, 옆의 코딩은 1 ~ 100 까지의 숫자가 랜덤으로 생성된다.
*	System.out.println("A="+a);
*		
*	Scanner scan=new Scanner(System.in); // System.in 은 키보드 입력값을 받는 역활을 한다.
*	
*	System.out.println("정수입력 :");
*	int b=scan.nextInt();
*	System.out.println("b="+b);
*/
		
		
		// 산술연산자 
		//국어,영어,수학 점수를 받아서 총점, 평균 => 소수점 2자리
		
		int kor, eng, math, total;
		double avg;
		
		//입력할 수 있는 기능의 클래스 
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수 : ");
		kor=scan.nextInt();
		
		System.out.println("영어점수 : ");
		eng=scan.nextInt();
		
		System.out.println("수학점수 : ");
		math=scan.nextInt();
		
		//총점
		total = kor+eng+math;
		
		//평균
		avg=total/3.0;
		
		//결과출력
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %.2f",avg);
		
		
		
	}

}
