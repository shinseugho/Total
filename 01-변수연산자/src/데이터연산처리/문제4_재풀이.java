package �����Ϳ���ó��;
import java.util.Scanner;

public class ����4_��Ǯ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����
		
		String name ; 
		int kor, eng, math, total ;
		double avg ;
		
		//�Էº�
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Input name : ");
		name = scan.next();
		System.out.println("Kor : ");
		kor = scan.nextInt();
		System.out.println("Eng : ");
		eng = scan.nextInt();
		System.out.println("Math : ");
		math = scan.nextInt();
		
		//�հ�����
		
		total = kor + eng + math ;
		
		//������� (�Ҽ� 1�ڸ�)
		
		avg = total / 3.0 ;
		
		// ��º�
		
		System.out.println("�̸� : "+name);
		System.out.println("�հ����� : "+total);
		System.out.printf ("������� : %.1f",avg);
	}

}
