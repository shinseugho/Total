/*
 *  while(true)/for(;;) �� ���ѷ���
 *  
 *  �ݺ����� �����ϴ� ��ɾ� break, continue�� �ִ�.
 *  continue = Ư�������� �����Ѵ�.
 *  break    = �ݺ����� �����Ѵ�.
 */
import java.util.Scanner;

public class �ݺ���11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// while 1 ~ ������Է°�  ������ ¦����, Ȧ����, ������ ���
		
		int sum=0,even=0,odd=0;
		int i=1;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("���� �Է� : ");
		int user = scan.nextInt();
		
		while (i<=user)		
		{
			sum+=i;
			if (i%2==0)  even+=i;
			else          odd+=i;
			i++;
		}
		
		System.out.println("���� : "+sum);
		System.out.println("¦���� �� : "+even);
		System.out.println("Ȧ���� �� : "+odd);
	}

}
