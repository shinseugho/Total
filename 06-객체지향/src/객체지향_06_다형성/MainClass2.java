package 객체지향_06_다형성;
/* interface I
 * {
 *   int a = 10;        => 오류 => public static final int a = 10
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
