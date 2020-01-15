package 데이터연산처리;
/*
 * 자바의 공간도
 *    ================
 *    Method 공간 (static)
 *    ================
 *    Stack     메모리관리({})이 끝나면 저장으로 회수                  = 지역변수
 *    ================
 *    Heap      사용자(프로그래머)가 관리(가비지컬렉션으로 회수)  = 멤버변수(전역변수)
 *    ================
 */

public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//증감연산자 -- , --
		int a = 10;
		//후치연산
		a--; 	
		a--;
		a--;
		
		System.out.println("a="+a);
		
		
		int b = 10;
		//전치연산
		--b;
		--b;
		--b;
		
		System.out.println("b="+b);
		
		
		int c = 10;
		int d = c--; // C값을 먼저 대입하고, +1를 하라
		
		System.out.println("C="+c);
		System.out.println("D="+d);
		
		
		int e = 10;
		int g = --e; // E값을 먼저 증가하고, 증가값을 대입하라
		
		System.out.println("E="+e);
		System.out.println("G="+g);
		

	}

}
