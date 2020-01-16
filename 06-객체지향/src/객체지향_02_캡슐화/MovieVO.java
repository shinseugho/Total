package 객체지향_02_캡슐화;
/* ~VO : 데이터형 클래스 => 캡슐화
 *            변수 : 읽기/쓰기 => 메소드화 처리
 *            
 * 변수초기화 1) 생성자             ] 개별저장 
 *         2) 초기화블록       ]  
 *         ============ 
 *         3) setter     ] 한번에 저장
 *         
 *         class A
 *         {
 *              int a; 
 *              for(int i=0;i<10;i++
 *              {
 *                 a=1; 
 *              }
 *         }
 *         => 오류 : class안에서는 for문을 시행하지 못한다. 선언(int a=10;)만 가능하다.
 *         
 *          class A
 *         {
 *              static int a=10; 
 *              static 
 *              {
 *                for(int i=0;i<10;i++)
 *                    {
 *                         a=1; 
 *                    }
 *              }
 *         }
 *         => A = 9 를 출력한다. (초기화블록 A(){}이 존재한다.)(static이 없으면 {}만 열고 닫으면된다.)    
 *         
 *   초기값을 먼저 읽고, Instance블록(초기화블록)을 찾고 마지막으로 생성자를 찾아 생성자를 출력하기에 초기화블록과 생성자 중 선택을 해서 사용하는 것이 좋다.
 *   static은 static{}을 쓰는 것이 편하고, instance블록은 생성자를 사용하는게 편하다. 왜냐하면 static은 자동저장이기때문이다.
 */

/* 백두산 (2019)
 * 평점6.7/10
 * 드라마/액션
 * 한국
 * 2019.12.19 개봉
 * 128분, 12세이상관람가
 * (감독) 이해준, 김병서
 * (주연) 이병헌, 하정우, 마동석, 전혜진, 수지
 * 누적관객6,789,642명
 * 대한민국 관측 역사상 최대 규모의 백두산 폭발 발생.
 * 갑작스러운 재난에 한반도는 순식간에 아비규환이 되고,
 * 남과 북 모두를 집어삼킬 추가 폭발이 예측된다.
 */

public class MovieVO {
	
	private String title;
	private double score;
	private String genre;
	private String redate;
	private int time;
	private String grade;
	private String director;
	private String actor;
	private int showUser;
	private String story;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRedate() {
		return redate;
	}
	public void setRedate(String redate) {
		this.redate = redate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getShowUser() {
		return showUser;
	}
	public void setShowUser(int showUser) {
		this.showUser = showUser;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
}
