package 데이터연산처리;
/*
*      데이터 저장(변수) ====== 데이터 가공 
*                          (연산자, 제어문) => 메소드 
*      변수 + 메소드 => 클래스 (객체지향프로그램) 
*                   ===================
*                   재사용(=상속), 수정(=오버라이딩), 추가(=오버로딩) 가능하도록 제작
*                => 설계 (인터페이스) 
*                => 데이터 여러개 저장 => 자료구조  
*     ============================== 라이브러리
*     
*     연산자 (자바에서 제공하는 연산자, 연산 = 같은 데이터형만 연산이 가능 ex ) int + int , double + double .....)
*     단항연산자
*       = 증감연산자  : 한개증가(++), 한개감소(--)
*                   전치연산자 ++a , --a 증가(감소)부터하고 다른 연산 수행
*                   후치연산자 a++ , a-- 다른 연산 수행하고 증가(감소)
*       = 부정연산자 : !
*                   boolean true-> false, false-> true 변경
*       = cast연산자 (형변환 연산자) : (type)
*                  byte < char   < int < long < float < double           
*                         short
*                         
*                  자동형변환 (upcasting)
*                  강제형변환 (downcasting)
*                  
*                
*     이항연산자
*      = 비트연산자 (직렬연산자:&, 병렬연산자:|, ^)
*      = 시프트연산자  (<<,>>) : 비트이동연산자
*      = 산술연산자 (+,-,*,/,%)
*      = 비교연산자 (==(같다), !=(같지않다), <(작다), >(크다), <=, >= ) ex) 5==8 => false, 5!=8 => True
*      = 논리연산자 (&& (and연산자) ,||(or연산자))
*      = 대입연산자 (=, +=, -=, *=, /= .... op=)
*     
*     
*     삼항연산자
*      조건? 값1 : 값2
*      => 조건(true) = 값 1
*      => 조건(false) = 값2
*      
*      ex) 10%2==0?"짝수":"홀수"   (if~else)
*                                          
*                                            
*      double d=123456.78;
*      int a=(int)((d-123456)*100); = ?                                       
*/
public class 연산자_종합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		double d=123456.78;
		int a=(int)((d-123456)*100);
		
		System.out.println("a="+a);
		// 비트크기가 맞지않아 생각과는 다른답이 계산됨
		
		float f=123456.78f;
		int b=(int)((f-123456)*100);
		
		System.out.println("b="+b);
		
		
	}

}
