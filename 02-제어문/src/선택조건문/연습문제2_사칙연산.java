package �������ǹ�;
//���� �ΰ��� �����ڸ� �޾Ƽ� ��Ģ����

import java.util.Scanner;

public class ��������2_��Ģ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ù��° ���� 10
		// �ι�° ���� 20
		// ������ �Է� +  ���� : String op = scan.next()
		//                  char c = op.charAt(0)
		
		//�Էº�
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ���� : ");
		int num1 = scan.nextInt();
		
		System.out.println("�ι�° ���� : ");
		int num2 = scan.nextInt();
		
		System.out.println("������ �Է� : ");
		String op = scan.next();
		
		//������ ��ȯ
		char c = op.charAt(0) ;
		
		//ó����
		if ( c =='+')
		{
			System.out.println(num1+"+"+num2+" = "+(num1+num2));
		}
		if ( c =='-')
		{
			System.out.println(num1+"-"+num2+" = "+(num1-num2));
		}
		if ( c =='*')
		{
			System.out.println(num1+"*"+num2+" = "+(num1*num2));
		}
		if ( c =='/')
		{
			
			if (num2==0)
				System.out.println("0���� ���� �� �����ϴ�");
			else 
				System.out.println(num1+"/"+num2+" = "+(num1/num2));
		}
		
		
	}

}
