package �ݺ���_�������ǹ�;
import java.util.Scanner;

/*
 *   ���ù� : �Ѱ��� ���� �޾Ƽ� ó�� ( break ������ �� ���� ���� & �������� ����) 
 *   
 *   ���� ) 
 *   switch(��) ==== ���� ����,����,���ڿ� �Է°���
 *   {
 *       case1: 
 *       ó��
 *       case2:
 *       ó��
 *       case3:
 *       ó��
 *       ========
 *       default:
 *       ó��
 *       ========default���� ���������ϴ�.
 *   }
 *   
 *   �������� ;�� �ƴ϶� :�̴�. 
 *   break ������ �ٽ��̴�.
 *   
 *   ����if <=> switch ������ �������翩���Ѵ�.
 *   
 *   
 *   
 */

import java.util.Scanner;

public class ���ù� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//�Է�
		System.out.println("ù��° ���� : ");
		int num1 = scan.nextInt();
		System.out.println("�ι�° ���� : ");
		int num2 = scan.nextInt();
		
		System.out.println("������(+,-,*,/) : ");
		String op = scan.next();
		
		//ó��
		switch(op) {
		case "+":
			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			break;
		case "-":
			System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			break;
		case "*":
			System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			break;
		case "/":
			if (num2==0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else
				System.out.printf("%d / %d = %.2f\n",num1,num2,num1/(double)num2);
			break;
		default:		
			System.out.println("�߸��� �������Դϴ�");
		}
		

	}

}
