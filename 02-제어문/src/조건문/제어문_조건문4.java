package 조건문;
// 입력 (정수)=> 년도 윤년여부 출력

/*
 *   윤년조건  1) 4년마다                            year%4==0
 *          2) 100년마다 제외                  year%100!=0
 *          3) 400년마다                        year%400==0
 */

import java.util.Scanner;

public class 제어문_조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in) ;
		
		System.out.println("정수입력 : ");
		int year = scan.nextInt() ; 
		
		if ((year%4==0 && year%100!=0)||year%400==0 )  //윤년조건
		{
			System.out.println(year+"년도는 윤년입니다.");
		}
		
		if (!((year%4==0 && year%100!=0)||year%400==0 )) //윤년미조건
		{
			System.out.println(year+"년도는 윤년이 아닙니다.");
		}
		
	}

}
