package 데이터저장;
/*
 *    이름, 성별, 나이, 주소, 전화, 이메일(존재:true,비존재:false)
 */
public class 변수문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String name= "신승호";
		 char sex='남';
		 // string sex ="남자" 도 가능하다.
		 int  age= 30 ;
		 String add = "서울";
		 String tel = "010-1234-5678";
		 boolean email = true;
		 
		 System.out.println("이름:"+name);
		 System.out.println("성별:"+sex);
		 System.out.println("나이:"+age);
		 System.out.println("주소:"+add);
		 System.out.println("전화:"+tel);
		 System.out.println("이메일:"+email);
	
	}

}
