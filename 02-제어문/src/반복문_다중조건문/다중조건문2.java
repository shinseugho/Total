package �ݺ���_�������ǹ�;
// ���� �Է� => ������ ���� �������� Ȯ��
/*
 * 31 28(29) 31 30 31 30
 * 31 31     30 31 30 31
 * 
 * 1�� 3�� 5�� 7�� 8�� 10�� 12��  : 31�� : else ó��
 * 4�� 6�� 9��            11��        : 30�� : Default ó��
 * 2��
 */
import java.util.Scanner;

public class �������ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("�⵵ �Է� : ");
		int year  = scan.nextInt();
		System.out.print("�� �Է� : ");
		int month = scan.nextInt();
		
		int lastDay = 0 ;
		
		if(month==4||month==6||month==9||month==11)
		{
			lastDay = 30 ;
		}
		else if (month==2) 
		{
			if((year%4==0 && year%100!=0)||(year%400==0))
                 lastDay = 29 ;
            else lastDay = 28 ;     
		}
		else
		{
			lastDay = 31 ;
		}
		
		System.out.println(year+"�� "+month+"���� "+lastDay+"�ϱ��� �Դϴ�.");
	}

}
