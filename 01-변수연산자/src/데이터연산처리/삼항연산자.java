package �����Ϳ���ó��;
/*
 * ? : ����
 * (���ǹ�?��1:��2) = ��(react)���� ���� ���
 * ������  true �� ��1 ����ϰ�, false �� ��2 ��� 
 */

import java.util.Scanner;

public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// ����, ����, ���� ������ �޾Ƽ� ��� = ����� 60�� �̻��̸� pass		
		
		Scanner scan = new Scanner (System.in) ; 
		/*
		 * System.out.print("�������� : "); int kor = scan.nextInt() ;
		 * 
		 * System.out.print("�������� : "); int eng = scan.nextInt() ;
		 * 
		 * System.out.print("�������� : "); int math = scan.nextInt() ;
		 * 
		 * 
		 * int avg = (kor + eng + math)/3 ;
		 * 
		 * String result = avg>=60? "Pass" : "Nonpass" ;
		 * 
		 * System.out.println("��� : " + result);
		 */

//���̸� �Է� = 15�� �̻��̸� (��ȭ��������)/ ���ϸ� (��ȭ�����Ұ�)
		
		/*
		 * System.out.println(" ���� : "); int age = scan.nextInt() ;
		 * 
		 * String result = age>=15 ? "��ȭ��������" : "��ȭ�����Ұ�" ;
		 * 
		 * System.out.println("��� : "+ result) ;
		 */

//�¼��� 1 2 3 4 5 => 1, 2, 4 �¼��� ���źҰ��� 3, 5�� ���Ű���
		
		System.out.println("�¼� ��ȣ (1~5) : ");
		int seat = scan.nextInt() ;
		
		String result = (seat == 3 || seat == 5) ? " ���Ű���" : "���źҰ���" ;
		System.out.println("���Ű��ɿ��� : " + result);
		
	}

}
