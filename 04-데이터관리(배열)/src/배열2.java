/*
 * �ߺ����� ��������	
 * =>�迭
 * ============
 * �����߻�
 * ============
 * 
 * ���Ҷ� ���� for���� ����.
 * 
 * =======
 * 
 * =======
 * =>��� 
 * 1. for-for��
 *   for()
 *   {
 *     for()
 *     {
 *     }
 *   }
 * 2. for-while��
 *   for()
 *   {
 *     while()
 *     {
 *     } 
 *   }
 * 3. for-do-while��
 *   for()
 *   {
 *     do
 *     {
 *     }while()
 *   }
 * �� ������ ������ �����̴ٶ��� ���� ������. ��Ȳ���� �ٸ��� �ִ�.     
 */

public class �迭2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] com = new int[9];
		
		// �����߻��� ����
		int su=0; 
		
		// �ߺ����θ� Ȯ��
		boolean bCheck=false;
		
		for(int i=0;i<com.length;i++)
		{
			bCheck=true;
			//===============
			while(bCheck)
			{
				//���� �߻�
				su =(int)(Math.random()*9)+1;
				bCheck=false;
				//�ߺ����� Ȯ��
				for(int j=0;j<i;j++)// i��ŭ ����Ǿ��ֱ⶧���� i��ŭ�� �񱳸� �ϸ�ȴ�.
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			//===============
			com[i]=su;
		}
		
		//���
		for(int i:com)
		{
			System.out.print(i+" ");
		}
	}

}
