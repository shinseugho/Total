/*
 * while           �����ǽ��̹Ƿ� ������ �������� ���� �ִ�.
 * ���� )
 *  �ʱⰪ                          1.
 *  while (���ǹ�)      2.
 *  {
 *     �ݺ����๮��           3.
 *     ������                  4.
 *  }
 *  
 *  1 - 2 - 3 - 4 - 3 - .... 2�� false�� ���� 
 *  
 *  
 *  do ~ whlile   �����ǽ��̹Ƿ� ������ 1���� ������ �Ѵ�.
 *  ���� )     
 *         �ʱⰪ
 *         do
 *         {
 *               ���๮��
 *               ������
 *         }while(���ǹ�); 
 *         
 *  for       
 *  ���� )        1    2    4 
 *        for (�ʱⰪ;���ǽ�;������)
 *        {
 *            ���๮��                     3
 *         }
 */

public class �ݺ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1���� 10���� ��� 123 / 456 / 789 ������ ���

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
