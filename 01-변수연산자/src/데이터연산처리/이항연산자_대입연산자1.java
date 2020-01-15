package 데이터연산처리;
/*
 *   대입연산자
 *     =    ex) a = 10 ; 10을 a라는 메모리에 첨부하라.
 *   
 *   복합대입연산자 
 *     +=   ex) int a = 10 ; a+=10 ; (: a = a + 10) = a = 20  
 *     -=   ex) int a = 10 ; a-=5  ; (: a = a - 5 ) = a =  5
 *     *=   ex) int a = 10 ; a*=3  ; (: a = a * 3)  = a = 30
 *     /=   ex) int a = 10 ; a/=2  ; (: a = a / 2)  = a =  5
 *     <<=
 *     >>=
 *     &=   ex) int a = 10 ; a&=3  ; (: a = a & 3)  = a =  2
 *     |=   ex) int a = 10 ; a|=3  ; (: a = a | 3)  = a = 11
 *     ^=   ex) int a = 10 ; a^=3  ; (: a = a ^ 3)  = a =  9
 *     
 *     = , += , -= 은 반드시 기억하는게 좋다
 *     
 *    연산자에서  ++, -- , ! , (type) , + , - , * , / , % , && , ||, == , < , > , <= , >= , = , += , -= , ? , : 는 공부해두는 것이 좋다.
 *     
 */
public class 이항연산자_대입연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10 ; // 10을 a에 대입해라.
		a+=1; //a에 1을 더한 값을 대입해라.
		System.out.println("a = " + a);  // 한개증가시키는 경우 = a++,++a,a+=1,a=a+1 를 사용할 수 있고, 이 중에서 선택하면 된다. 
		
		
		
	}

}
