/*               
 *               * 변수=>발전사항=>클래스(변수,변수+메소드,메소드)
 *                              =====
 *                              ~VO, ~DTO
 *                              ~Manager, ~Service, ~DAO
 *                              
 *                 변수=>배열=>구조체=>클래스=>파일=>RDBMS(오라클)
 *                 ======================================== 이 모두가 데이터베이스이다.
 *                 
 * 자바클래스 구조 => 컴포넌트 베이스 
 *               예) 컴퓨터구조 : CPU, 메모리, 하드디스크, 사운드카드 ... : 기능별로 분류한 구조를 컴포넌트 베이스라고 한다. 
 *               구성요소 = 변수 + 메소드 + 생성자
 *                       변수로 사용이 가능한 것 = 단일변수((ex)int year), 클래스((ex)String name), 배열((ex)int[] year)
 * class ClassName
 * {
 *  ======= 클래스만 가지고 있는 변수 ======= 전역변수 (다른 클래스에서 사용이 가능)
 *     => 메모리에 따로 저장되는 변수 (Instance 변수) 
 *     => 공유하는 변수                     (Static 변수)   = 메모리 공간이 한개 (한 번 변경시 전부 변경)
 *  ==================================
 *  생성자 함수 : 전역변수의 초기화=>한번만 호출, 객체생성될때 처음으로 호출
 *            클래스명과 동일
 *            리턴형X
 *            원도우, 네트워크, 데이터베이스 ...
 *            => 만약 생성자가 없는 경우에는 JVM이 자동으로 만들어 준다 (default생성자)
 *               * void 리턴 / import / 생성자 의 경우 JVM이 자동으로 생성해준다.
 *  ==================================
 *  메소드 : 기능수행  
 *  ==================================
 * }
 * 
 *  클래스명 => MovieVo (영화 데이터를 모은 클래스)
 *           MusivVo (음악 데이터를 모은 클래스)
 *           
 *           class FoodHouseVO{
 *                 String[] poster;
 *                 String addr,tel ...;
 *                 String[] menu; 
 *                 String[] reply;
 *           배열도 변수가 될 수 있다는 것을 잘 생각해야한다.    
 *           
 *   백두산 (2019)
 *   평점6.9/10
 *   드라마/액션
 *   한국
 *   2019.12.19 개봉
 *   128분, 12세이상관람가
 *   (감독) 이해준, 김병서
 *   (주연) 이병헌, 하정우, 마동석, 전혜진, 수지
 *   
 *   class MovieVO = 사용자가 만든 데이터형
 *                   int a / double d = 자바에서 기본제공되는 데이터크기가 있기에 new를 작성하지않아도 데이터크기가 자동적으로 할당된다.  
 *                   MovieVO vo       = 자바에서 기본제공되지않는 데이터 크기가 없기에 new를 작성해서 데이터크기를 할당해줘야한다.
 */

class MovieVO{
	//instance변수=> 메모리 저장시점 : new 사용시 저장(별도 메모리 생성)
      String title;
      String score;
      String genre;
      String regdate;
      int time;
      String grade;
      String director;
      String actor;
}

public class 클래스변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 불러들이는 방식
		 * 1. 메모리 저장 후 호출 
		 */
		
		//new가 안들어가면 null => 메모리공간 할당, new의 리턴값은 int이다.
		MovieVO m1=new MovieVO(); 
		m1.title="백두산(2019)";  // . = 메모리주소접근연산자
	    m1.score="평점6.9/10";
	    m1.genre="드라마/액션";
	    m1.regdate="한국";
		MovieVO m2=new MovieVO();
		m2.title="천문:하늘에 묻는다(2019)";
		MovieVO m3=new MovieVO();
		m3.title="캣츠(2019)";
		
		MovieVO m4=m3;
		m4.title="시동(2019)";
		
		System.out.println("m1 : "+m1);
		System.out.println("m2 : "+m2);
		System.out.println("m3 : "+m3);
		System.out.println("m4 : "+m4);
		
		System.out.println("저장된 영화 제목\n");
		System.out.println(m1.title);
		System.out.println(m1.score);
		System.out.println(m1.genre);
		System.out.println(m1.regdate);
		System.out.println(m2.title);
	//======================================
		System.out.println(m3.title);
		System.out.println(m4.title);
		
		System.out.println("====================================");
		
		MovieVO[] vo={m1,m2,m3,m4};
		for(int i=0;i<vo.length;i++)
		{
			System.out.println(vo[i].title);
			System.out.println(vo[i].score);
			System.out.println(vo[i].genre);
			System.out.println(vo[i].regdate);
		}

	}

}
