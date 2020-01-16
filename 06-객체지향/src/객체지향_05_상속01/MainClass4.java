package 객체지향_05_상속01;
class 도형 {
	public void draw() {
		System.out.println("도형을 그린다");
	}
}

class 원형 extends 도형{
	public void draw() {
		System.out.println("원형을 그린다");
	}
}

class 삼각형 extends 도형{
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
}

class 사각형 extends 도형{
	public void draw() {
		System.out.println("사각형을 그린다");
	}
}

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		도형 m = new 사각형();
		m.draw();
		
		m = new 삼각형();
		m.draw();
	}

}
