package 조건문;
/*
 *  if 수행문장의 범위
 *  
 *    if ( 조건문 )
 *        실행문장1     ==> if 소속문장
 *        실행문장2     ==> if 미소속문장 / true,false와 관련 없이 무조건 수행
 *    
 *    => Java에서 모든 제어문은 {}이 없는 경우 한 문장만 수행한다.
 *    
 *    
 *    if ( 조건문 )
 *    {
 *         실행문장1
 *    }
 *    실행문장 2 
 *    => 가독성, 최적화 ( 리펙토링 ), 마이그레이션( Spring => SpringBoot ) 을 위해서 조건문 작성을 할때 정리가 필요하다.
 *     
 */

import java.util.Scanner;

public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner (System.in) ;
		
		int num=20;		
		//여러문장 제어
		int b= 100;
		int a = 10;
		
		if (num%2!=0)
		{
			System.out.println("b는"+b+"입니다.");
	      	System.out.println(num+"는(은) 짝수입니다.");
		    System.out.println("프로그램 종료");
		    b++; //  
		}
		System.out.println(b);
		//System.out.println(b); //b값이 {}에서만 사용했으므로 {}밖에서는 사용할 수 없다. = 지역변수 ( {}안에서만 사용하는 변수 ) 
		
		int c=10;
		
		++c;
		++c;
		++c;
		
		System.out.println("c = "+c); 
		
		int d=10;
		d+=3;
		
		System.out.println("d = "+d);
				
	}

}
