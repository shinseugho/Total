package 객체지향_01_생성자;
 import sun.applet.Main;

/*   클래스의 구성요소
 *   ==========================================================================
 *   변수(전역변수, 멤버변수)
 *   => 다른 클래스에서 사용가능
 *   => 메모리에서 해제되는 시점이 프로그램 종료시점
 *      (메모리 저장공간이 heap영역 = 휘발성 메모리영역)
 *   ==========================================================================
 *   생성자 : 멤버변수에 대한 초기화 담당
 *   특징) 1. 클래스명과 동일하게 작성 
 *        2. 리턴형이 없다 (void는 리턴형이다)
 *        3. 생성자는 여러개를 만들 수 있고 사용하지 않을 수 있다
 *        4. 오버로딩을 지원한다
 *           1) 한개의 클래스 안에서 같은 이름의 메소드를 여러 개 사용
 *           2) 매개변수가 다르다 (매개변수의 데이터형 혹은 갯수가 다르면 다른 메소드로 인식한다.)
 *           3) 리턴형은 관계없다
 *              void display()
 *              int display()    
 *              위의 둘은 같은 메소드이다.
 *           4) 기능이 같다
 *        5. 상속 예외 조건이다. (static과 생성자는 상속 예외 조건이다.)   
 *   윈도우 프로그램, 자동로그인 등의 명령문 구조에서 사용된다. (생성자 혹은 메소드)
 *   주메뉴 : 클래스
 *   부메뉴 : 메소드
 *   세부내용 : 변수
 *   ==========================================================================
 *   ==> 명령문의 집합 ==> 관련된 명령을 모아서 처리 (구조적 프로그램)
 *   메소드 : 멤버변수를 활용 => 기능
 *          연산 처리 + 제어문 처리 => 메소드는 사용자 요청을 처리하는 기능을 담당한다.
 *   ==========================================================================  
 *   
 */

public class MainClass {

	String name;
	String sex;
	int age;

	// 초기화==> MainClass mc = new MainClass()
	/*
	 * public MainClass() {
	 * 
	 * // 초기화 ==-> 윈도우, 네트워크, 데이터베이스 
	 * name = "심청이"; 
	 * sex = "여자"; 
	 * age = 25;
	 * 
	 * }
	 */
	
	//매개변수를 가진 생성자
	public MainClass(String name, String sex, int age) {
		
		/*변수명이 동일할때 지역변수(황토색)에 우선순위가 있어 멤버변수(클래스의 변수,파랑색)가 도달하지 못했다. 
		 *               => 앞에 this.를 붙여주면 지역변수와 매개변수명이 동일할때 구분을 위하여 사용한다.
		 *               this 변수는 static변수이다.
		 */
		System.out.println("this= "+this);
		this.name = name;
		this.sex = sex;
		this.age = age;
		/*  자신의 객체주소 => this => 반드시 메소드 안에서만 사용이 가능하다.
		 *  여기서 this를 사용하면 에러가 발생한다.
		 */ 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* MainClass mc = new MainClass(); 
		 * static이 아닌 변수는 저장공간을 별도로 만들어서 저장해야 한다 (new)
		 * 생성자는 호출시에 앞에 반드시 new를 붙여야한다.
		 * 
		 * System.out.println(mc.name); 
		 * System.out.println(mc.sex);
		 * System.out.println(mc.age);
		 */
		
		MainClass mc1 = new MainClass("이순신","남자",30); 
		System.out.println("mc1= "+mc1);
		System.out.println(mc1.name);
		System.out.println(mc1.sex);
		System.out.println(mc1.age);
		
		System.out.println("\n");
		
		MainClass mc2 = new MainClass("심청이","여자",20); 
		System.out.println("mc1= "+mc2);
		System.out.println(mc2.name);
		System.out.println(mc2.sex);
		System.out.println(mc2.age);
		
		System.out.println("\n");
		
		MainClass mc3 = new MainClass("강감찬","남자",35);
		System.out.println("mc1= "+mc3);
		System.out.println(mc3.name);
		System.out.println(mc3.sex);
		System.out.println(mc3.age);
		
		System.out.println("\n");
		
		System.out.println(new MainClass("박문수", "남자", 10).name);
		System.out.println(new MainClass("박문수", "남자", 10).sex);
		System.out.println(new MainClass("박문수", "남자", 10).age);
		
	}

}
