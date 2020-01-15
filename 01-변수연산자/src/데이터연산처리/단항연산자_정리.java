package 데이터연산처리;
/*
 * 
 */

public class 단항연산자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10 ;
		int b = a++ ; // a = 11 , b = 10
		int c = ++a ; // a = 12 , c = 12
		              // a = 12, b =10, c = 12 
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		
		char ch = 'A' ;
		System.out.println(++ch) ; // 뒤에 붙으면 출력하고 증가하라 는 의미 (앞에 붙으면 증가하고 출력하라는 의미)
		
		int i = 10 ;
		int j = i++ + i++ + ++i + ++i + i++ + i++ + i-- + --i;
		//       10    11   13    14     14    15    16   14       		
		System.out.println(i);
		System.out.println(j);
		
		int x = 10 ; 
		int y = 9  ;		
		boolean bCheck=(x<y)&&(++y==x);		
		System.out.println(bCheck);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		// 증감연산자       반복문에서 사용
		// 부정연산자(!) 조건문을 만들때 사용한다
		
	}

}
