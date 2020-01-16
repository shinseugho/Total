package 반복문_dowhile문;
/*
 *     do ~ while  : 한번 이상을 수행하는 반복문 ( 사용빈도는 많지않다. if, while, for문이 중요하다.)
 *     
 *     형식) 
 *           데이터베이스 : 웹
 *           네트워크      : 스마트폰
 *           
 *           초기값
 *           do{
 *           
 *            시행문장(여러문장 사용가능)
 *            증감식
 *            i++( or i+=3이나 i--등 도 가능)      
 *           
 *           }while(조건문);
 *           
 */

public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 10 까지 증가
		int i = 1 ;
		do {
			System.out.println("i="+i);
			i++;
		}while(i<=10);
		
		System.out.println("10~1");

		do  //초기화없이 1까지 감소
		{
			System.out.println("i="+(i-1));
			i--;
		}while(i>1);

	}

}
