package �ݺ���_for��;
import java.util.Scanner;

/*
 *    for : �ݺ��� (�ݺ�Ƚ���� ����)
 *    =============
 *    for���� ����
 *    1. �Ϲ�  for�� 
 *       ����)
 *              for (�ʱⰪ;���ǽ�;������)
 *                  ���๮��
 *              => �ʱⰪ => ���ǽ� => ���๮�� => ������ => ���ǽ� .... =>���ǽ��� false���Ǹ� ���� 
 *               
 *              =�ʱⰪ ==> 0
 *              =���๮���� ����  �ѹ���{}(O,X), ��������{}(O)
 *              =������ ==>1����
 *              =������ �Ѱ��̻�  
 *               for(int i=0,j=1;i<=1 && j>=1;....)
 *              =for(int i = 0;.......)    
 *                   
 *    2. ���� for�� : �迭, �÷��� (�����ͺ��̽�) 
 *    
 *    =============
 *    �޼ҵ�(�Ϲݸ޼ҵ�, ���ٽ�(�Լ�������):JDK1.8)
 *    
 */

//1~11 ���
public class �ݺ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan = new Scanner(System.in); 
		 * scan.nextInt(); 
		 * scan.nextDouble();
		 * scan.nextBoolean(); 
		 * scan.next(); 
		 * System.out.println("Hello Java!!") ;
		 */
		int i=1;
		for (i=1;i<=10;i++)
		{
			System.out.println("i = "+i);
		}
		System.out.println("i = "+i);

	}

}
