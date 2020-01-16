package 라이브러리_java.lang;
class My
{

	public My() {
		System.out.println("My 생성자 함수 호출(객체 생성)");
	}
	public void display() {
		System.out.println("My:display() Call ...");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("객체 소멸");
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//생성
		My m = new My();
		//활용
		m.display();
		//소멸
		m=null;
		//메모리 소멸
		System.gc();

	}

}
