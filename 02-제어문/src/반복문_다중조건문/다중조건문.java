package �ݺ���_�������ǹ�;
/*
 *     �������ǹ� : �������� ������ �����ϰ� �ش� ���� 1���� ������ �ǵ��� �����.
 *     
 *     1) ���� 
 *        if ( ���ǹ� )
 *            ���๮��1         true �� ���, ���๮��1�� �����ϰ� ����
 *                           false �� ���, �ٷ� �� ���ǹ����� �̵�
 *        else if ( ���ǹ� )
 *                 ���๮��2
 *        else if ( ���ǹ� )
 *                 ���๮��3
 *        ================         
 *        else 
 *                 ���๮��4
 *        ================  �ش� ������ ���� ��쿡 ó�� (������ �����ϴ�.)         
 */

//����ó�� 3���� ������ �޾Ƽ� ����,����, ������ ���

import java.util.Scanner;

public class �������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor,eng,math,total,temp ; 
		double avg ; 
		char score ; 
		
		Scanner scan = new Scanner(System.in) ;
		
		/* new �� �޸��Ҵ� ��Ȱ
		 * Scanner(Sytem.in) �� ������ ���� �ʱ�ȭ ( ������ )
		 * Ŭ������ ����� ���� �������� (����+�޼ҵ�)�̴�.
		 */
				
		System.out.println("���� ���� : ");
	    kor = scan.nextInt();
		
		System.out.println("���� ���� : ");
	    eng = scan.nextInt();
	    
		System.out.println("���� ���� : ");
	    math = scan.nextInt();
	    
	    total = kor + eng + math ;
	    
	    avg = total/3.0 ;
	    
	    temp = (int)avg;  // total/3 �� �����ϴ�. 
	    
	    if (temp >= 90)       score = 'A';
	    else if ( temp >=80 ) score = 'B';
	    else if ( temp >=70 ) score = 'C';
	    else if ( temp >=60 ) score = 'D';
	    else                  score = 'F';
	    
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n",avg);
		System.out.println("����:"+score);
		
	}

}
