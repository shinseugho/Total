package 객체지향_05_상속02;
/*     interface도 추상메소드 중 하나다. 모든 메소드에 구현이 없다.
 *     메소드는 일반메소드 / static / abstract로 나뉜다.
 */
interface Ani{
	void working();
	void eating();
}

class Human implements Ani{

	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println("두 발로 걷는다");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("수저로 먹는다");
	}
	
}

public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ani ani = new Human();
		ani.working();
		ani.eating();
		
	}

}
