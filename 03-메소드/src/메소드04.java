
/* ==========================
 *  1. �޼ҵ� ȣ��
 *  2. �޼ҵ� ������� ����
 *  3. ��� �ȿ� �ִ� ��� ���� ����
 *  4. �޼ҵ� ȣ�� ��ġ�� ����
 * ==========================
 *  
 *   �Խ��� ���
 *    1. ������
 *    2. ���뺸��
 *    3. �۾���
 *    4. �����ϱ�
 *    5. �亯�ϱ�
 *    6. �����ϱ�
 *    7. �˻�
 *   
 *   �޼ҵ忡 is boolean
 *         set void    �� ���� ������. 
 */
import java.util.Scanner;

public class �޼ҵ�04 {
	
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
	static String gugudan2(int dan) //�Ű������� �ٸ��� ������ �����ʴ´�. 
	{
		String result="";
		for(int i=1;i<=9;i++)
		{
			result+=dan+"*"+i+"="+(dan*i)+"\n";
		}
		return result;
	}
	static void process()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int dan=scan.nextInt();
		//������
		String res=gugudan2(dan);
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
