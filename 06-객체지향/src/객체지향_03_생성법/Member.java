package 객체지향_03_생성법;

public class Member {
	
	private String id;
	private String pwd;
	
	//생성자 초기화
	public Member() {	
		id="hong";
		pwd="1234";
	}
	
	//매개변수를 가진 생성자
	public Member(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	//생성자가 2개인 오버로딩

	public void print()
	{
		System.out.println("ID: "+id);
		System.out.println("Password: "+pwd);
	}
	
	
}
