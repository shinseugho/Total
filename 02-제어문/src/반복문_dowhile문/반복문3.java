package �ݺ���_dowhile��;
//�ݺ���2�� ������ �ٸ� ������� ó��.

import java.util.Scanner;

public class �ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int kor=0, eng=0, math=0, total=0, avg=0 ;
		char score = 'A';
		
		int kor1=0, eng1=0, math1=0, total1=0, avg1=0 ;
		char score1 = 'A';
		
		int kor2=0, eng2=0, math2=0, total2=0, avg2=0 ;
		char score2 = 'A';

		int i = 1 ;
		do
		{
			if(i==1)//1���л�
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
				score = c;
			}
			else if(i==2)//2���л�
			{
				System.out.println("���� ���� �Է� : ");
				kor1  = scan.nextInt() ;
				System.out.println("���� ���� �Է� : ");
				eng1  = scan.nextInt() ;
				System.out.println("���� ���� �Է� : ");
				math1 = scan.nextInt() ;
				
				total1 = kor1 + eng1 + math1 ;
				avg1 = total1 / 3 ;
				
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
				score1 = c;
			}
			if(i==3)//3���л�
			{
				System.out.println("���� ���� �Է� : ");
				kor2  = scan.nextInt() ;
				System.out.println("���� ���� �Է� : ");
				eng2  = scan.nextInt() ;
				System.out.println("���� ���� �Է� : ");
				math2 = scan.nextInt() ;
				
				total2 = kor2 + eng2 + math2 ;
				avg2 = total2 / 3 ;
				
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
				score2 = c;
			}
			
			i++;
			
		}while(i<=3);
		
		System.out.println("���� ���� ���� ���� ��� ����");
		System.out.println(kor+"  "+eng+"  "+math+" "+total+" "+avg+" "+score);
		System.out.println(kor1+"  "+eng1+"  "+math1+" "+total1+" "+avg1+" "+score1);
		System.out.println(kor2+"  "+eng2+"  "+math2+" "+total2+" "+avg2+" "+score);
	}

}
