package 라이브러리_java.lang;
class Box implements Cloneable {
	
	int a = 10;
	int b = 20;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
		
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b1 = new Box();
		Box b2 = b1;
		
		b2.a = 100;
		b2.b = 200;
		
		System.out.println("b1.a = "+b1.a);
		System.out.println("b1.b = "+b1.b);
		
		try {
			 //리턴값이 Object이므로 Box로 형변환해줘야한다. 그렇지않으면 오류가 발생한다.
			 Box b3 = (Box)b1.clone(); 
			 // b1의 주소값과 b3의 주소값이 다르다
			 
			 System.out.println("b3.a = "+b3.a);
			 System.out.println("b3.b = "+b3.b);
			 
			 b3.a = 1000;
			 b3.b = 2000;
			 
			 System.out.println("b1.a = "+b1.a);
			 System.out.println("b1.b = "+b1.b);
			 System.out.println("b3.a = "+b3.a);
			 System.out.println("b3.b = "+b3.b);
	
		}catch(Exception ex ) { }
	  
	}

}
