
// 1~45 => �����߻� => �ߺ����� 6���߻�
/*
 *  �迭 => 6�� 
 *  
 *  for(6ȸ)
 *  {
 *      while(�ߺ�)
 *      {
 *         �����߻�
 *         �迭����� �����Ϳ� ����(����)
 *      }
 *      
 *      �迭����
 *      
 *  }
 */
public class �޼ҵ�11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����������
		int[] com=new int[6];
		//����
		int su=0;
		//��=>�ߺ�Ȯ��
		boolean bCheck=false;
		for(int i=0;i<6;i++)
		{
			bCheck = true;
			while(bCheck)
			{
			      su=(int)(Math.random()*45)+1;
			      bCheck=false;
			      for(int j=0;j<i;j++)
			      {
			    	    if(com[j]==su)
			    	    {
			    	    	bCheck=true;
			    	    	break;
			    	    }
			      }
			}
			
			/* �������
			 * 1. Math.random()
			 * 2. *45 
			 * 3. (int)
			 * 4. +1
			 */
		}
		
		//���
		for(int i:com) // ����� ������ �Ѱ��� �о�´�. (for-each)
		{
			System.out.print(i+" ");
		}
	}

}
