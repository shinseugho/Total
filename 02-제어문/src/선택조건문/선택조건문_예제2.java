package �������ǹ�;
// ��ǻ�� ����, ����� �Է�  ===> ����, ����, ��

import java.util.Random;
import java.util.Scanner;

public class �������ǹ�_����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 = ����, 1 = ����, 2 = ��
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println(" ����(0) ����(1) ��(2) : ");
		
		int user = scan.nextInt();
		
		if (user == 0 )
			System.out.println(" �÷��̾� : ���� ");
		if (user == 1 )
			System.out.println(" �÷��̾� : ���� ");
		if (user == 2 )
			System.out.println(" �÷��̾� : �� ");		
		
		int com = (int)(Math.random()*3) ; 
		
		if (com == 0 )
			System.out.println(" ��ǻ�� : ���� ");
		if (com == 1 )
			System.out.println(" ��ǻ�� : ���� ");
		if (com == 2 )
			System.out.println(" ��ǻ�� : �� ");
		
		/*
		 * if ( com == 0) //���� { if( user == 0 ) { System.out.println("����"); } if( user
		 * == 1 ) { System.out.println("�÷��̾� Win!!"); } if( user == 2 ) {
		 * System.out.println("��ǻ�� Win!!"); } } if ( com == 1) //���� { if( user == 0 ) {
		 * System.out.println("��ǻ�� Win!!"); } if( user == 1 ) {
		 * System.out.println("����"); } if( user == 2 ) {
		 * System.out.println("�÷��̾� Win!!"); } } if ( com == 2) //�� { if( user == 0 ) {
		 * System.out.println("�÷��̾� Win!!"); } if( user == 1 ) {
		 * System.out.println("��ǻ�� Win"); } if( user == 2 ) {
		 * System.out.println("����!!"); }
		 * 
		 * }
		 */
		
		// �÷��̾� = -1,2 
		// ��ǻ��   = 1,-2
		
		
		int result = com - user ;
		if (result == -1 || result == 2 )
			System.out.println("�÷��̾� Win!!");
		if (result == 1 || result == -2 )
			System.out.println("��ǻ�� Win!!");
		if (result == 0 )
			System.out.println("���º�");
	}
	
}

