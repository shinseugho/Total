package �����Ϳ���ó��;
import java.util.*;   // Scanner ��� ( ���� scanf )
/*
 *     �ڹٿ� C����� ���� 
 *     
 *     �ڹ� �� Ŭ���� ���� ���
 *     C���� �Լ� ���� ���
 */
public class ���׿�����_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /* ���� => ���� �����ϴ� ���     1. �����Է�     int a; //���� a = 10
         *                                  int a = 10; //����� ���ÿ� ���� ���� 
		 *                       2. �Է��� ���� �޾Ƽ� ����
		 *                       3. ����(����) => ������ ���� ����  
		 */                   
/*  int a=(int)(Math.random()*100)+1; // Math.random() �� 0.0 ~ 0.99 �� ���� ���ڰ� ���� �����ȴ�. ����, ���� �ڵ��� 1 ~ 100 ������ ���ڰ� �������� �����ȴ�.
*	System.out.println("A="+a);
*		
*	Scanner scan=new Scanner(System.in); // System.in �� Ű���� �Է°��� �޴� ��Ȱ�� �Ѵ�.
*	
*	System.out.println("�����Է� :");
*	int b=scan.nextInt();
*	System.out.println("b="+b);
*/
		
		
		// ��������� 
		//����,����,���� ������ �޾Ƽ� ����, ��� => �Ҽ��� 2�ڸ�
		
		int kor, eng, math, total;
		double avg;
		
		//�Է��� �� �ִ� ����� Ŭ���� 
		Scanner scan=new Scanner(System.in);
		System.out.println("�������� : ");
		kor=scan.nextInt();
		
		System.out.println("�������� : ");
		eng=scan.nextInt();
		
		System.out.println("�������� : ");
		math=scan.nextInt();
		
		//����
		total = kor+eng+math;
		
		//���
		avg=total/3.0;
		
		//������
		System.out.println("�������� : "+kor);
		System.out.println("�������� : "+eng);
		System.out.println("�������� : "+math);
		System.out.println("���� : "+total);
		System.out.printf("��� : %.2f",avg);
		
		
		
	}

}
