package 객체지향_06_다형성;
// 메모리에 저장(할당) 조건 => 모든 메소드가 구현
abstract class Ani
{
	public abstract void walking();
	public abstract void eating();
	public void display()
	{
		System.out.println("Ani:display() Call ...");
	}
}

class Human extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("사람이 걷는다");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("사람이 먹는다");
	}
	
	
	
}

class Dog extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("개가 걷는다");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("개가 먹는다");
	}
	
}

class Pig extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("돼지같이 걷는다");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("돼지같이 먹는다");
	}
	
}

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Ani ani = new Human();
	   ani.walking();
	   ani.eating();
	   //ani.setName();
	   
	   ani = new Dog();
	   ani.walking();
	   ani.eating();
       //ani.setName();
	   
	   ani = new Pig();
	   ani.walking();
	   ani.eating();
	   //ani.setName();
	}

}
