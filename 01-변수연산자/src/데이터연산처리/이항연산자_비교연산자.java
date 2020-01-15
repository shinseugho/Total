package �����Ϳ���ó��;
/*
 * �� ǥ�� 
 * char    ==> '' 
 * String   => ""
 * int     ==> 10(10����), 010(8����), 0x12(16����), 0b1010101(2����)
 * long    ==> 10l, 10L
 * float   ==> 10.5f, 10.5F
 * boolean  => true, false
 * 
 * �񱳿����� => �����(boolean) : true, false
 * ==(����)         ex) 6==7(false), 6==6(true)
 * !=(�����ʴ�)      ex) 6!=7(true), 6!=6(false)
 * <(�۴�)          ex) 6<7(true)   
 * >(ũ��)          ex) 6>7(false)
 * <=(�۰ų� ����)    ex) 6<=6(true)
 * >=(ũ�ų� ����)    ex) 6>=6(true)
 * ==============================================  if, while, for ������ ���� ���ȴ�.
 * 
 *    *  if���� ���ǹ�
 *   **  while, for���� �ݺ���
 */

import java.util.Scanner;

public class ���׿�����_�񱳿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b1 = 10==11;
		System.out.println("b1="+b1);
		
		b1 = 10!=11;
		System.out.println("b1="+b1);
		
		b1 = 10<11;
		System.out.println("b1="+b1);
		
		b1 = 10>11;
		System.out.println("b1="+b1);
		
		// char�� ��翬�꿡�� ������ ����
		// A = 65, B = 66
		b1 = 65<='A';
		System.out.println("b1="+b1);
		
		b1 = 65>='B';
		System.out.println("b1="+b1);
		
		//char�� ��ȣ ( ASC )
		System.out.println((int)'A');   //65
		System.out.println((int)'0');   //48
		System.out.println((int)'a');   //97
		
		// �ΰ��� ������ �޾Ƽ� ū ���� ���
		
		Scanner scan =new Scanner(System.in); 
		
		/* 
		 * scan.nextInt()              int
		 * scan.nextDouble()           double
		 * scan.next()                 String
		 * scan.nextBoolean()          boolean
		 * scan.nextchar()�� ���������ʴ´�.
		 */
		
		//����
		
		int num1, num2 ;
		
		System.out.print("ù��° ���� �Է� :");  //����ڰ� �Է�
		num1=scan.nextInt();                //num1�� ����      
		
		System.out.print("�ι�° ���� �Է� :");
		num2=scan.nextInt();
		
		//num1,num2 �� (���׿����� ���/ ����?true:false)
		
		int result = num1<num2?num2:num1; 
		System.out.println("ū ���� "+result+" �Դϴ�.");
	}

}
