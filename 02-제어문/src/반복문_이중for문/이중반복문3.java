package �ݺ���_����for��;
/*
 *       ���������
 *       2�ܺ��� 9��
 */

public class ���߹ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%2d *%2d = %2d\n",i,j,j*i);
			}
			    System.out.println();
		}
		
		System.out.println("\nfor~while========");
		
		//int j=2;
		for(int i=1;i<=9;i++)
		{
			//j=2;
			int j=2;
			while(j<=9)
			{
				System.out.printf("%2d *%2d = %2d\n",i,j,j*i);
			    j++;
			}
				System.out.println();
		}
	}

}
