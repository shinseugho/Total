package ���ǹ�;
// �Է� (����)=> �⵵ ���⿩�� ���

/*
 *   ��������  1) 4�⸶��                            year%4==0
 *          2) 100�⸶�� ����                  year%100!=0
 *          3) 400�⸶��                        year%400==0
 */

import java.util.Scanner;

public class ���_���ǹ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in) ;
		
		System.out.println("�����Է� : ");
		int year = scan.nextInt() ; 
		
		if ((year%4==0 && year%100!=0)||year%400==0 )  //��������
		{
			System.out.println(year+"�⵵�� �����Դϴ�.");
		}
		
		if (!((year%4==0 && year%100!=0)||year%400==0 )) //���������
		{
			System.out.println(year+"�⵵�� ������ �ƴմϴ�.");
		}
		
	}

}
