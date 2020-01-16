package 객체지향_01_생성자;
/*   1. 데이터의 초기화
 *      1) 생성자     : 초기화가 한번만 가능하다.
 *      2) setter : 원하는 언제나 초기화가 가능하다.
 */

//캡슐화
class Music {
	private int mno;
	private String title;
	private String singer;
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music music = new Music();
		
		//저장
		music.setMno(100);
		music.setTitle("나의 오랜 연인에게");
		music.setSinger("다비치");
		
		//읽기
		System.out.println(music.getMno());
		System.out.println(music.getTitle());
		System.out.println(music.getSinger());
	}

}
