package �����Ϳ���ó��;
import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				String name;				
				int kor, eng, math, total;
				double avg;
				
				//�Է��� �� �ִ� ����� Ŭ���� 
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Input name : ");		
				name=scan.next();
				
				System.out.println("kor : ");		
				kor=scan.nextInt();
				
				System.out.println("eng : ");
				eng=scan.nextInt();
				
				System.out.println("math : ");
				math=scan.nextInt();
				
				//����
				total = kor+eng+math;
				
				//���
				avg=total/3.0;
				
				//������
				System.out.println("�̸� : "+name);
				System.out.println("�հ����� : "+total);
				System.out.printf ("������� : %.1f",avg);
				

	}

}
