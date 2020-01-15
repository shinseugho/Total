/*   변수
 *      = instance 변수 : 생성   (new메모리 생성시점)
 *      = static 변수     : 컴파일(메소드내 사용불가능)
 *      ==================================== 자동 초기화가 된다. 
 *      = 지역변수 (메소드호출시점)
 *      ==================================== 반드시 초기화를 한다.
 */
class Data{
	//선언만 가능 (구현=>연산처리,제어문,메소드호출) => {}
	int a;
	float f;
	double d;
	boolean boo=true;//false
	long l;
	char c='A'; //'\0'
	String s="BOOM!"; //null = 주소값이 없는 상태
	String ss="";
	static int aa; //0
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Data.aa);
		
		Data dd=new Data(); 
		System.out.println(dd.a); 
		System.out.println(dd.boo);
		System.out.println(dd.c); 
		System.out.println(dd.d); 
		System.out.println(dd.f);
		System.out.println(dd.l); 
		System.out.println(dd.s);
		System.out.println(dd.ss);
		 
	}

}
