package ���ڿ�;
// equals => return (boolean)
// ����� ���ڿ��� ������ Ȯ��
 
import java.util.Scanner;

public class ���ڿ�Ŭ����2 {
    
	static boolean isLogin(String id,String pwd)
    {
    	boolean bCheck=false;
    	final String ID="admin";
    	final String PWD="1234";
    	
   /* equals : ��ҹ��� ���к�
    * equalsIgnoreCase : ��ҹ��� ���о��� ��
    * startsWith : ���۹��ڰ� ������� true
    * endsWith   : ������ ���ڿ��� ������� true
    * contains   : ���忡 ���ڿ��� ���Ե� ��� true */
    	
    	if(id.equalsIgnoreCase(ID) && pwd.equals(PWD)) //��ҹ��� ���о��� �α���
      //if(id.equals(ID) && pwd.equals(PWD))           //��ҹ��� �����ִ� �α���
    	{
    		bCheck=true;
    	}
    	
    	return bCheck;
    	 
    }
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("ID�Է� : ");
			String id = scan.next();
			System.out.print("��й�ȣ�Է� : ");
			String pwd = scan.next();
			
			boolean bCheck=isLogin(id, pwd);
			
			if(bCheck==true)
			{
				System.out.println(id+"�� �α��εǾ����ϴ�!!");
				break;
			}
			else
			{
				System.out.println("ID�� ��й�ȣ�� Ʋ���ϴ�!!\n�ٽ��Է��ϼ���");
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
	}

}
