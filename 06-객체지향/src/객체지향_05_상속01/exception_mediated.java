package 객체지향_05_상속01;
import java.io.IOException;
import java.sql.SQLException;

class MyException{
	
	//구현된 내용중에서 예상되는 에러 O = 시스템에 알려만 준다(:throws)
	
	public void display() throws NumberFormatException,NullPointerException,ArithmeticException
	{
	     System.out.println("MyException:display call ...");	
	}
	
	public void display1() throws IOException,SQLException
	{
		System.out.println("MyException:display1 call ...");
	}
	
}
public class exception_mediated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyException m = new MyException();
		m.display();
		
		try 
		{
			m.display1();
		}catch(IOException e) { }
		catch(SQLException e) { }

		/* 이 방법들도 가능하다
		 * try 
		 * { 
		 *   m.display1(); 
		 * }catch(Exception e) { }
		 * 
		 * try 
		 * { 
		 *   m.display1(); 
		 * }catch(Throwable e) { }
		 * 
		 */
		
	}

}
