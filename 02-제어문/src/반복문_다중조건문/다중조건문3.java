package �ݺ���_�������ǹ�;
//���� 2���Է¹޾Ƽ� ������ 1�� ��Ģ����ó��
//String �� ==�� ��������  equals�� ����Ѵ�.

import java.util.Scanner;

public class �������ǹ�3 {

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
	
	
	//���
	if(op.equals("+"))
	{
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
	}
	else if(op.equals("-"))
	{
		System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
	}
	else if(op.equals("*"))
	{
		System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
	}
	else if(op.equals("/"))
	{
		if (num2==0)
			System.out.println("0���� ���� �� �����ϴ�.");
		else
			System.out.printf("%d / %d = %.2f\n",num1,num2,num1/(double)num2);
	}	
	else
	{
		System.out.println("�߸��� �������Դϴ�");
	}
	
	}

}

