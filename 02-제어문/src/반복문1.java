/*
 * while           선조건식이므로 시행이 되지않을 수도 있다.
 * 형식 )
 *  초기값                          1.
 *  while (조건문)      2.
 *  {
 *     반복실행문장           3.
 *     증가식                  4.
 *  }
 *  
 *  1 - 2 - 3 - 4 - 3 - .... 2가 false면 종료 
 *  
 *  
 *  do ~ whlile   후조건식이므로 무조건 1번은 시행을 한다.
 *  형식 )     
 *         초기값
 *         do
 *         {
 *               실행문장
 *               증가식
 *         }while(조건문); 
 *         
 *  for       
 *  형식 )        1    2    4 
 *        for (초기값;조건식;증가식)
 *        {
 *            실행문장                     3
 *         }
 */

public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 10까지 출력 123 / 456 / 789 순으로 출력

		int i=1;
		while (i<=10);
		{
			System.out.print(i+"\t");
			if(i%3==0) 
			System.out.println();
			i++;
		}
		
		System.out.println("\ndo~while");
		
		i=1;
		do
		{
			System.out.print(i+"\t");
			if(i%3==0) 
			System.out.println();
			i++;
		} while(i<=10);
		
		System.out.println("\nfor");
		
		for(i=1;i<=10;i++);
		{
			System.out.print(i+"\t");
			if(i%3==0) 
			System.out.println();
		}
	}

}
