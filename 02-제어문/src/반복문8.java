// ������ => dan�� �Է¹޾Ƽ� 
/*
 * ���α׷�
 * ======
 * ����� ���� + java���̺귯�� + �ܺο��¼ҽ�(mvnrepository.com)
 * ==================================================== ����
 */
import java.util.Scanner;

public class �ݺ���8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� �Է� : ");
		int dan = scan.nextInt();
		
		int i = 1;
		while(i<=9)
		{
			System.out.printf("%2d *%2d = %2d\n",dan,i,dan*i);
			i++;
		}

	}

}
