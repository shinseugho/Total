/*     메소드
 *         =매개변수 (사용자요청값) => 행위 => 여러개가능
 *         =리턴형    (요청내용에 대한 결과값 전송 = 한개(여러개라면 묶어서 전송))
 *                ===========================
 *                      기본형, 배열, 클래스
 *         ====================================================
 *         형식
 *            리턴형 메소드명(매개변수 ...) ==> 선언부
 *            {
 *                   ==> 구현부
 *                   return 결과값     =====> (리턴형 = 결과값)
 *                          =====                 ===== 작은 데이터형을 사용할 수 있다
 *            }
 *            
 *            return생략이 가능한 경우 : void일 대 생략이 가능하다
 *            
 *            ex)  int aaa()
 *                 {
 *                          return(int,char,byte,short) => 자바에서는 같은 데이터형으로 받는 것을 권장한다
 *                 }
 *            
 *            ********* 호출  int a = aaa()
 *             
 *            배열
 *            int[] aaa()
 *            {
 *                return 배열명
 *            }
 *            
 *            int[] arr = aaa()
 *            
 *            클래스
 *            String aaa()
 *            {
 *                return ""(문자열)
 *            }
 *            
 *            String s = aaa()
 *            
 *            결과값이 없는 경우
 *            void aaa()
 *            {
 *                return;
 *            }
 *            
 *            aaa()
 *            
 *            =========================
 *            
 *            매개변수가 있는 경우
 *            int plus(int a,int b)
 *            {
 *                       a=10,b=30
 *                return a+b;
 *            }
 *            
 *            int a = plus(10,30) 
 *            
 *            void aaa()
 *            {
 *                 === 1
 *                 === 2
 *                 === 3
 *                 === 4
 *                 === 5
 *                 === 6
 *                 === 7
 *           }
 *           
 *           aaa() => 1234567
 *           aaa() => 1234567 =>반복과 관련된 부분 
 *           
 *           제어문은 반드시 패턴이 존재해야 사용할 수 있다.
 *           
 *           패턴이 없으면 배열로 묶어서 사용할 수는 있다.
 *           int[] arr = {1 5 7 4 3 2 1 2 8 9}
 *           String s="Hello Java";
 *           
 *           1 232 43434 434 343 4 34 34 343434  => int[] 배열로 묶는다.
 *           113 "aaa" "aadad" 0.9 10.2F 10L 'A' => 클래스로  묶어야한다. 그 이유는 데이터형이 제각각(3개이상)이기때문이다.
 */

public class 메소드14 {
	static String name;
	
	static void message()
	{
		System.out.println("Hello Java!!!");
		//return; 생략가능 생략시 JVM이 자동으로 코딩을 해준다.
	}
	
	static int aaa()
	{
		return 10;
	}
	
	static double bbb()
	{
		return 10.5;
	}
	
	static String ccc()
	{
		return "Hello";
	}
	
	static int[] ddd()
	{
		int[] arr = {1,2,3,4,5};
		return arr;
	}
	
	static int eee(int a)
	{
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		message();
		
//		메소드1 a = new 메소드1();
//		a. name="홍길동1";
//		메소드1 b = new 메소드1();
//		b. name="홍길동2";
//		메소드1 c = new 메소드1();
//		c. name="홍길동3";
//		메소드1 d = new 메소드1();
//		d. name="홍길동4";
//		메소드1 e = new 메소드1();
//		e. name="홍길동5";
		       // System.out.println(a.name); 을 출력하면 ? 홍길동5 그이유는 ? static은 한 자리만 가져가므로 최후의 변수만 입력된다.  
		
		
		int a = aaa();
		double b = bbb();
		String s = ccc();
		int[] arr = ddd();
		int aa = eee(10);
	}

}
