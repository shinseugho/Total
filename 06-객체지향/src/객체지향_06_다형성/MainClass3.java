package ��ü����_06_������;
// �޸𸮿� ����(�Ҵ�) ���� => ��� �޼ҵ尡 ����
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
		System.out.println("����� �ȴ´�");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("����� �Դ´�");
	}
	
	
	
}

class Dog extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("���� �ȴ´�");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("���� �Դ´�");
	}
	
}

class Pig extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("�������� �ȴ´�");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("�������� �Դ´�");
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
