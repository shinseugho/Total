package �������ǹ�;
/*
 *  if ~ else
 *  
 *  1. ������ �� �� �Է¹޾Ƽ� ¦��/Ȧ�� ���
 *  2. ���ĺ��� �޾Ƽ� ��ҹ��� (char a = 'A') ���
 *  3. ���� 3���� �Է¹޾Ƽ� ���(avg)���� 90���̻� A, 80���̻� B, 70���̻� C, 60���̻��̸� D, 60�� �̸��̸� F  ���
 *    
 */

import java.util.Scanner;

public class �����ǹ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. ������ �Է¹޾Ƽ� ¦��Ȧ�� ���
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int num = scan.nextInt();
		
		if (num%2==0) System.out.println(num+"��(��) ¦���Դϴ�.");
		else          System.out.println(num+"��(��) Ȧ���Դϴ�.");
		
		
		// 2. ���ĺ� ��ҹ��� ���
		char alpha = 'A' ;
		if  (alpha>='A' && alpha<='Z') System.out.println(alpha+"��(��) �빮���Դϴ�.");		
		else			               System.out.println(alpha+"��(��) �ҹ����Դϴ�."); 

		
		
		// 3. ����3���Է� �� ��� �� ��ޱ���
		System.out.println("���� ���� : ");
		int kor = scan.nextInt();
		
		System.out.println("���� ���� : ");
		int eng = scan.nextInt();
		
		System.out.println("���� ���� : ");
		int math = scan.nextInt();
		
		int avg = (int)(kor+eng+math)/3 ; 
		System.out.println("��� ���� : "+avg);
		
		if (avg>=90 && avg <= 100) System.out.println("A �Դϴ�.");
		if (avg>=80 && avg <   90) System.out.println("B �Դϴ�.");
		if (avg>=70 && avg <   80) System.out.println("C �Դϴ�.");
		if (avg>=60 && avg <   70) System.out.println("D �Դϴ�.");
		if (           avg <   60) System.out.println("F �Դϴ�.");
		
	}

}
