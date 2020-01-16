package 객체지향_07_예외처리;

public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /* 1~4, 6~9 출력
	   * for (int i = 0; i < 10; i++ ) 
	   *     {
	   *           try 
	   *           { 
	   *                 실행문장 i == 5에서 오류발생 
	   *           }catch(Exception ex) { }
	   *     }
	   */
		
		
       /* 1~4까지만 출력
        * try
		*	{
		*		for (int i = 0; i < 10; i++ )
		*		{
		*			실행문장 i == 5에서 오류발생
		*		}
		*		
		*	}catch(Exception ex) { }
		*/
		
		//4번까지 실행
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
			System.out.println("오류발생");
		}
		
		//5번만 제외하고 시행
		
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
					System.out.println("오류발생");
				}
	    }

		
		
	}

}
