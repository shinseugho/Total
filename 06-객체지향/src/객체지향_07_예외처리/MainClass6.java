package ��ü����_07_����ó��;

public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /* 1~4, 6~9 ���
	   * for (int i = 0; i < 10; i++ ) 
	   *     {
	   *           try 
	   *           { 
	   *                 ���๮�� i == 5���� �����߻� 
	   *           }catch(Exception ex) { }
	   *     }
	   */
		
		
       /* 1~4������ ���
        * try
		*	{
		*		for (int i = 0; i < 10; i++ )
		*		{
		*			���๮�� i == 5���� �����߻�
		*		}
		*		
		*	}catch(Exception ex) { }
		*/
		
		//4������ ����
		try 
		{
			for (int i =0; i<10; i++)
			{
				if(i==5)
				{
					int a=10/0;
				}
				System.out.println("i= "+i);
			}
		}catch(Exception ex)
		{
			System.out.println("�����߻�");
		}
		
		//5���� �����ϰ� ����
		
		System.out.println("\n");
		
		for (int i =0; i<10; i++)
		{
			try 
			{
				if(i==5)
				{
					int a=10/0;
				}
				System.out.println("i= "+i);
				}		
				catch(Exception ex)
				{
					System.out.println("�����߻�");
				}
	    }

		
		
	}

}
