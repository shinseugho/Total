
class Sawon{
	int sabun;
	String name;
	String dept;
	String loc;
	long pay;
	static String company; //공통이면 static을 붙여주는 것이 수정.출력이 편하다
	/* 지역변수와 전역변수명이 같아도 되고, 지역변수가 우선순위가 있다. (전역변수에 우선순위를 주고 싶다면  this.를 앞에 붙여준다)
	 * 변수는 우선순위가 지역변수(지역변수, 매개변수) {}이 종료하면 사라지는 변수 
 	 */
}

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sawon s1=new Sawon();
		s1.sabun=1;
		s1.name="홍길동";
		s1.dept="개발부";
		s1.loc="서울";
		s1.pay=3500;
		s1.company="SIST";
		
		Sawon s2=new Sawon();
		s2.sabun=2;
		s2.name="이순신";
		s2.dept="영업부";
		s2.loc="서울";
		s2.pay=5000;
		s2.company="SIST2";
		
		Sawon.company="SIST3";
		
		System.out.println("s1사번 : "+s1.sabun);
		System.out.println("s2사번 : "+s2.sabun);
		System.out.println(s1.company);
		System.out.println(s2.company);
		System.out.println(Sawon.company);

	}

}
