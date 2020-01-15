package 데이터연산처리;
/*
 * ? : 형식
 * (조건문?값1:값2) = 웹(react)에서 많이 사용
 * 조건이  true 면 값1 출력하고, false 시 값2 출력 
 */

import java.util.Scanner;

public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 국어, 영어, 수학 점수를 받아서 평균 = 평균이 60점 이상이면 pass		
		
		Scanner scan = new Scanner (System.in) ; 
		/*
		 * System.out.print("국어점수 : "); int kor = scan.nextInt() ;
		 * 
		 * System.out.print("영어점수 : "); int eng = scan.nextInt() ;
		 * 
		 * System.out.print("수학점수 : "); int math = scan.nextInt() ;
		 * 
		 * 
		 * int avg = (kor + eng + math)/3 ;
		 * 
		 * String result = avg>=60? "Pass" : "Nonpass" ;
		 * 
		 * System.out.println("결과 : " + result);
		 */

//나이를 입력 = 15세 이상이면 (영화관람가능)/ 이하면 (영화관람불가)
		
		/*
		 * System.out.println(" 나이 : "); int age = scan.nextInt() ;
		 * 
		 * String result = age>=15 ? "영화관람가능" : "영화관람불가" ;
		 * 
		 * System.out.println("결과 : "+ result) ;
		 */

//좌석이 1 2 3 4 5 => 1, 2, 4 좌석은 예매불가능 3, 5은 예매가능
		
		System.out.println("좌석 번호 (1~5) : ");
		int seat = scan.nextInt() ;
		
		String result = (seat == 3 || seat == 5) ? " 예매가능" : "예매불가능" ;
		System.out.println("예매가능여부 : " + result);
		
	}

}
