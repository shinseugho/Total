package ��ü����_06_������;
/* interface I
 * {
 *   int a = 10;        => ���� => public static final int a = 10
 *   void display();    =>     => public abstract void display();
 * } 
 * 
 * public A implements I
 * {
 *   public void display() 
 *   {
 *   
 *   }
 * }
 */

class Super
{
	public void display() {
		System.out.println("Super:Display() Call");
	}
}

class Sub extends Super
{
	public void display() {
		System.out.println("Sub:Display() Call");
	}
}

class Sub2 
{
	Super su = new Super() {
		public void display() {
			System.out.println("Sub2:Display() Call");
		}
	};
	
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sub sub = new Sub();
		sub.display();
		
		Sub2 s = new Sub2();
		s.su.display();

	}

}
