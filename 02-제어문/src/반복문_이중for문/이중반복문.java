package �ݺ���_����for��;
/*
 *    ���� - ���� )
 *    
 *         1    2 �� = false
 *    for(�ʱⰪ;���ǽ�;������(8))     ===1��
 *    {          �� = true  
 *             1  2 �� = false  ===> 1�� for���� ���������� �ö󰣴�.
 *      for(�ʱⰪ;���ǽ�;������(4))   ===2��
 *      {          �� = true
 *           3
 *         2�� ���๮��
 *      }
 *           5
 *      1�� ���๮��  
 *    }
 * 
 * 
 *  1�� for���� false�� �ÿ� ����
 */

public class ���߹ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ǥ���
		for (int i=1; i<=5; i++)   //������ ������ΰ�
		{
			/*
			 * System.out.print("��"); 
			 * System.out.print("��");
             * System.out.print("��");
			 * System.out.print("��"); 
			 * System.out.print("��");
			 */
			
			for (int j=1;j<=5;j++)  // � ���� ����� ���ΰ�
			{
			    System.out.print("��");
			}
			
			System.out.println();
		}
		
		
		//#�� ���� ���
		for (int k=1 ; k<=5; k++)
		{
			for (int m=1; m<=5; m++)
			{
				if(k==m) System.out.print(k);
				else     System.out.print("#");
			}
			System.out.println();
		}
		
		//         i   k
		//*       �ټ�   ��ǥ
		//**       1   1       i=k 
		//***      2   2
		//****     3   3
		//*****    4   4
		//         5   5
		
		for (int a=1;a<=5;a++)
		{
			for (int b=1;b<=a;b++)
			{
			    System.out.print("*");
			}
			System.out.println();
		}
		
		//              i   j       
		//*****        �ټ�  ��ǥ           i+j=6   ->   j=6-i
		//****          1   5
		//***           2   4
		//**            3   3
		//*             4   2
		//              5   1 
		
		for (int c=1;c<=5;c++)
		{
			for (int d=1;d<=6-c;d++)
			{
			    System.out.print("*");
			}
			System.out.println();
		}
		
		//*����� ��������
		//                i    j   k        i+j = 5     -> j=5-i
		//    *          �ټ�   ����   ��ǥ            i = k
		//   **           1    4   1
		//  ***           2    3   2
		// ****           3    2   3  
		//*****           4    1   4
		//                5    0   5

		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5-i;j++)
			{
			    System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
			    System.out.print("*");
			}
			System.out.println();
		}

		
		
		//                i    j     k      i=j+1     -> j=i-1     
		//*****          �ټ�    ����     ��ǥ          i+k=6    ->  k=6-i
		// ****           1    0     5
		//  ***           2    1     4
		//   **           3    2     3
		//    *           4    3     2
		//                5    4     1
		
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i-1;j++)
			{
			    System.out.print(" ");
			}
			for (int k=1;k<=6-i;k++)
			{
			    System.out.print("*");
			}
			System.out.println();
		}
		

		

	}

}
