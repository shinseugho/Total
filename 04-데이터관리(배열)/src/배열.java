/*
 *    �迭 : ���������͸� �� ���� �̸����� ����
 *         �ε���(÷��)�� �̿��Ѵ�.
 *         ** �ε����� 0���� ����
 *    1) ����
 *       1. ����
 *          ��������[] �迭�� 
 *          =============
 *           = �⺻Ÿ��          (int,long,float,double ...
 *             ex) int[] arr
 *                 long[] arr
 *           = ����� ���� Ÿ�� (Ŭ����)
 *             ex) class Movie
 *                 Movie[] arr
 *           ---------------------- java�� �ְ� c����  boolean�� ����.
 *           
 *       2. �ʱⰪ
 *          = int[] arr = {1,2,3,4,5,6}
 *          = int[] arr = new int[6]
 *          ----------------------- ��ü �ʱⰪ int:0, long:0L, String:null
 *                                  null = �޸𸮿� ����� �ּҰ��� ���������ʴ´�. 
 *                                  
 *       3. �������б�
 *          = arr[index number] 
 *               =============== ���� - 1 ���� �ؾ�� �ȵȴ�. 
 *               
 *       4. ����������
 *          = arr[1]=10 
 */
/*
 *  ���� �߱� ����
 *  ==========SB
 *  => ���� => 729 
 *  => ����ڰ� �Է� => 567 ==>0S 1B
 *                 �������ڰ� �ִ°�? - �������ڰ� ������, �ٸ��ڸ��� ��ġ�Ѵ�.   1B
 *                               - �������ڰ� �ְ�, �����ڸ��� ��ġ�Ѵ�.    1S                                             
 *                               3S �� �ƿ�  
 */

import java.util.Scanner;
/*
 * 1. �ߺ����� ���� �߻�
 * ================
 * 2. ������Է�
 * 3. ��Ʈ
 * 4. ���Ῡ�� Ȯ��
 * 5. 3S = �����Ѵ�.
 * ================ �ݺ� while��
 *
 *
 *  ���� ������ ���  ���
 *     ========== 
 *        �޼ҵ�
 *  =================
 *        Ŭ����      
 */
public class �迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] com = new int[3];
		// �����߻��� ����
		int su=0; 
		// �ߺ����θ� Ȯ�� (�ߺ��̸� true)
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
		
		int[] user = new int[3];
		
		/*
		 * for(int i=0;i<3;i++) { com[i]=(int)(Math.random()*5)+1; }
		 * 
		 * for(int i:com) { System.out.println("i="+i+"\t"); }
		 */
		
		//int[] i = {3,6,9} �� 369�� ���� �����ȴ�.
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			// ���Է�
			System.out.println("3�ڸ� ���� �Է� : "); 
			int input = scan.nextInt();          
			
			// ����ó��_1
			if( input<100 || input>999)
			{
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���");
				continue;
			}
			
			// �迭������ 
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// ����ó��_2 (�ߺ��ȼ��� �� �� ����. 0�� ����� �� ����.)
			if((user[0] == user[1]) || (user[1] == user [2]) || (user[0] == user [2]))
			{
				System.out.println("�ߺ��� ���� ����� �� �����ϴ�."); //��Ʈ�� ���̴� ��찡 �߻��Ѵ�.
				continue;
			}
			
			if((user[0] == 0) || (user[1] == 0) || (user[2] == 0))
			{
				System.out.println("0�� ����� �� �����ϴ�.");
				continue;
			}
			
			//�񱳽���
			int s=0,b=0;
			for (int i=0;i<3;i++)     //i = com
			{
				for(int j=0;j<3;j++)  //j = user
				{
					if(com[i]==user[j]) 
					{
						if(i==j) s++;
						else     b++;
					}
				}
			}
			
			//��Ʈ		
			System.out.printf("Input Number:%d, Result:%ds-%dB\n",input,s,b);
			System.out.println("=========================================");
			System.out.print("S : ");
		    for(int i=0;i<s;i++)
		    {
		    	System.out.print("��");
		    }
		    System.out.print("\nB : ");
		    for(int i=0;i<b;i++)
		    {
		    	System.out.print("��");
		    }
			System.out.println("\n=========================================");
			
			//���Ῡ�� Ȯ��
			if(s==3) 
			{
				System.out.println("Game Over!");
				break;
			}
			
		}
		
		
	}

}
