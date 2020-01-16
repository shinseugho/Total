package 반복문_for문;
import java.util.Scanner;

/*
 *    for : 반복문 (반복횟수가 지정)
 *    =============
 *    for문의 종류
 *    1. 일반  for문 
 *       형식)
 *              for (초기값;조건식;증가식)
 *                  실행문장
 *              => 초기값 => 조건식 => 실행문장 => 증가식 => 조건식 .... =>조건식이 false가되면 종료 
 *               
 *              =초기값 ==> 0
 *              =실행문장의 범위  한문장{}(O,X), 여러문장{}(O)
 *              =증가식 ==>1개씩
 *              =변수가 한개이상  
 *               for(int i=0,j=1;i<=1 && j>=1;....)
 *              =for(int i = 0;.......)    
 *                   
 *    2. 향상된 for문 : 배열, 컬렉션 (데이터베이스) 
 *    
 *    =============
 *    메소드(일반메소드, 람다식(함수포인터):JDK1.8)
 *    
 */

//1~11 출력
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan = new Scanner(System.in); 
		 * scan.nextInt(); 
		 * scan.nextDouble();
		 * scan.nextBoolean(); 
		 * scan.next(); 
		 * System.out.println("Hello Java!!") ;
		 */
		int i=1;
		for (i=1;i<=10;i++)
		{
			System.out.println("i = "+i);
		}
		System.out.println("i = "+i);

	}

}
