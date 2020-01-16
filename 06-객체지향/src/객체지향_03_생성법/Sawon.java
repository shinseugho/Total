package 객체지향_03_생성법;

public class Sawon {
/* 캡슐화 : 데이터는 감추고 메소드(외부장치)를 통해서 접근이 가능하게 만드는 방법
 * 데이터형 클래스 : 사용자 정의 데이터형
 * 
 */
	//상태
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private long pay;
	
	//동작
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
	
}
