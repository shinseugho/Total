/*     메소드
 *     1) 형식
 *        리턴형 메소드명(매개변수) =>선언부
 *        {
 *             기능구현
 *             return 결과값  (결과값과 리턴형의 데이터형이 같아야한다.) 
 *        }
 *        => 리턴형이 없는 경우 => return을 생략할 수 있다.
 *        => 모든 메소드는 종료하기 위해서 반드시 마지막에 return을 사용한다.
 *           예외) 조건문을 사용해서 return을 사용할 수 있다.
 *                return문 밑에는 어떤 문장도 사용이 불가능하다.
 *                                
 *                display(10);
 *                static void display(int a)
 *                {
 *                      System.out.println(a);
 *                      return;
 *                      System.out.println(a+1);  // 이문장이 오류가 발생한다. 그 이유는 return이후에 있기때문이다.
 *                }
 *                
 *                display(10);
 *                static void display(int a)
 *                {
 *                      System.out.println(a);
 *                      if(a==10) return;
 *                      System.out.println(a+1);  // 이문장은 조건이 맞아 실행되지않는다. 
 *                }
 *                
 *     2) 리턴형
 *        기본형 : int method()
 *        클래스 : Movie method()
 *        배열    : int[] method()
 *        void : 결과값이 없는 경우
 *     
 *     3) 매개변수
 *        사용자 요청값
 *        3개 이상이면 배열/클래스를 사용하는 경우가 많다.
 *     
 *     4) 매개변수 전송법
 *        call by value : 기본형, String
 *        ============================== 메모리를 따라 생성(복제값)
 *        call by reference : 배열, 클래스     
 *        ============================== 같은 주소를 이요해서 값변경
 *     
 *     5) 호출
 *        메소드명()
 *        메소드명(10,20)              
 *        =======================   return형이 없는 경우
 *        데이터형 변수=메소드()
 *        데이터형 변수=메소드(10,20)
 *     
 *     *  모든 메소드는 수행이 종료한 다음에 다시 호출한 위치로 돌아간다.
 *     ** 메소드를 여러개 호출 시 한 개의 메소드가 수행을 종료해야 다음 메소드를 호출
 *        a()
 *        b()
 *        c()
 *        ========
 *          c()
 *        ========  
 *          b()
 *        ========
 *          a() ========> 수행   
 *        ======== 
 *        
 *        매개변수 전송 : call by value 메인값은 변경이 되지않는다.(주소가 개별생성)
 */
/* 프로그래머들이 선호하는 방식이다.
 * Call by Reference (주소를 넘기는 경우) => 배열, 클래스
 * 메인값도 변경이 된다. (주소로 변경하기때문이다.)
 * 
 * 
 *  class A
 *  {
 *     int a=10;
 *  }
 *  
 *  swap(A aa)
 *  { 
 *     aa.a=1000;
 *  }
 *  
 *  A aa=new A();
 *  swap(aa)
 *  
 *  aa.a ? 1000 
 */

public class 메소드22 {
	
	static void swap(String a, String b)
	{
		//변경전
		System.out.println("<변경전> swap: a= "+a+",b= "+b);
		
		//값변경
		String temp=a;
		a=b;
		b=temp;
		
		//변경후
		System.out.println("<변경후> swap: a= "+a+",b= "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		String b="Java";
		swap(a,b);
		System.out.println("<메인>  main: a= "+a+",b= "+b);
	}

}
