package �迭1;
/*
 *  ���� 5���ްų� �������� ���� ������ ����� ���
 */

public class �迭10_��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��������
		int[] score = new int[5];
		int[] copy = new int[5];		
		
		for(int i=0;i<5;i++)
		{
			score[i]=(int)(Math.random()*100)+1;
		}
		
		//��		
		for(int i=0;i<5;i++)
		{
			copy[i]=1;
			for(int j=0;j<5;j++)
			{
				if(i==j) continue; 
				if(score[i]<score[j])
				{
					copy[i]++;
				}
			}
		}
		
		for (int i=0;i<5;i++)
		{
		System.out.println(score[i]+"("+copy[i]+")");
		}

	}

}
