package ��ü����_05_���01;
import java.io.IOException;
import java.sql.SQLException;

class MyException{
	
	//������ �����߿��� ����Ǵ� ���� O = �ý��ۿ� �˷��� �ش�(:throws)
	
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

		/* �� ����鵵 �����ϴ�
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
