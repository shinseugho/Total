package �ݺ���_dowhile��;
// 1) 3���� �л� ����,����,���� ����,���, ����, ���� ��� 
//    ���� ���� ���� ���� ��� ����
//  A 
//  B
//  C
//

import java.util.Scanner;

public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int kor, eng, math, total, avg ;
		String result = "";

		int i = 1 ;
		do
		{
			System.out.println("���� ���� �Է� : ");
			kor  = scan.nextInt() ;
			System.out.println("���� ���� �Է� : ");
			eng  = scan.nextInt() ;
			System.out.println("���� ���� �Է� : ");
			math = scan.nextInt() ;
			
			total = kor + eng + math ;
			avg = total / 3 ;
			
			char c = 'A';
			switch(avg/10)
			{
			case 10:
			case 9:
				c='A';
			    break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
			}
			
			result+=kor+" "+eng+" "+math+" "+total+" "+avg+" "+c+"\n";
			i++;
			
		}while(i<=3);
		
		System.out.println("���� ���� ���� ���� ��� ����");
		System.out.println(result);
	}

}
