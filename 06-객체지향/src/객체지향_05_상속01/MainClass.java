package 객체지향_05_상속01;
import java.util.*;

import jdk.nashorn.internal.codegen.CompilerConstants.Call;

/*   객체지향
 *   1) 캡슐화
 *      1. 접근지정어
 *         =================================================================
 *                        자신의 클래스  같은폴더(패키지) 다른폴더(패키지) 모든 클래스
 *         =================================================================
 *         private          O            X            X            X
 *         =================================================================
 *         default          O            O            X            X
 *         =================================================================
 *         protected        O            O           O,X           X  
 *                                                상속이 있어야 가능    
 *         =================================================================   
 *         public           O            O            O            O
 *         ================================================================= 
 *         
 *         => 클래스 : public class className : 부품 => 연결해서 사용
 *         => 변수    : private int a;               => 데이터 보호
 *         => 메소드 : 메소드를 통해서 클래스끼리 연결
 *                   public 리턴형 메소드명(){}
 *         => 생성자 : 연결 => 메모리 할당
 *                   public 클래스명(){}
 *         => 변수는 은닉화하고, 메소드를 통해서 접근하는 방식 (getter/setter)       
 *         
 *     2. 재사용 기법
 *        1) 상속 (is-a)   기존 클래스의 모든 내용(변수, 메소드)을 받아서 재정의(확장)해서 사용
 *                       자바는 단일 상속만 지원한다.
 *                       상속기호 : extends
 *                       public  class MyWindow extends JFrame
 *                       * 예외 : 생성자, static 변수
 *                       ** static변수는 사용은 가능하지만 상속은 되지않는다. ? 
 *        2) 포함 (has-a) public class MyWindow
 *                       {
 *                              JFrame j = new JFrame();
 *                       }         
 *                       
 *        => 기능변경 / 기능추가 / 데이터추가 가 있는 경우에 상속
 *        => 있는 그대로 기능 그대로 사용하는 경우에 포함
 *        
 *    3. 상속시 (클래스비교)
 *       => 상속을 내리는 클래스가 더 크다
 *       => 형변환이 존재
 *       => ~이다라는 과정이 성립해야한다.
 *       
 *            인간
 *            
 *        남자        여자  
 *        
 *            남자  man  = new 남자(); 
 *            여자 woman = new 여자();
 *            
 *            인간 human = new 남자();
 *            인간 human = new 여자();
 *            
 *            남자 man = new 인간(); = 오류 : 인간은 남자다
 *            남자 man = new 여자(); = 오류 : 여자는 남자다  
 *            
 *            => 상속을 내리는 클래스는 (중복을 피해)공통점을 가지고 있어야한다. (추상화)
 *            
 *            상위클래스 (상속을 내리는 클래스) : super클래스, 부모클래스, Base클래스
 *            하위클래스 (상속을 받는 클래스)  : sub클래스, 자식클래스, 파생클래스
 *            
 *            => 기존 클래스의 모든내용을 가지고 와서 확장하는 내용
 *            => 자바의 클래스는 Object(자바 최상위클래스)상속을 가지고있다.
 *            => static, 생성자는 상속을 할 수 없다.
 *            => 중복된 코딩을 방지하고 재사응을 할 목적으로 만든 기능이다.
 *            => 상속을 내리는 클래스가 항상 크다.
 */
class Human{
	String name;
	String age;
	public Human()
	{
		System.out.println("Human() Call ...");
	}
}

class Sawon extends Human{
	
	String dept;
	String loc;
	public Sawon() 
	{
		System.out.println( "Sawon() Call ...");
	}
}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sawon s = new Sawon();
	s.age = "30";
	s.name = "홍길동";
	s.loc = "서울"; 
    s.dept = "개발부";
    
    System.out.println("이름: "+s.name);
    System.out.println("나이: "+s.age);
    System.out.println("부서: "+s.dept);
    System.out.println("근무지: "+s.loc);
	}

}
