/*
 *  ��ǻ�� = 1 ~ 100 ������ ������ ���� �����ϰ�, �÷��̾ ���� ���ߴ� ����
 *  ��Ʈ up/down���̴�.
 */
import java.util.Scanner;

public class ���ٿ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int com = (int)(Math.random()*100)+1; // 1 ~ 100������ ���� ����
		
		Scanner scan = new Scanner(System.in) ;
		
		while (true)  // ���ѷ��� (������ true�̱� �����̴�.)
		{
		  System.out.println("1 ~ 100 ������ ���� �Է� : ");
		  int user = scan.nextInt();
		  
		  if (user<1 || user>100) 
			  {
			         System.out.println("�߸��� �Է��Դϴ�!!");
			         continue;   // ó������ �ǵ����� �ʹٸ� continue, �����ϰ� �ʹٸ� break�� �����Ѵ�. 
			                     // while ���� ���ǽ����� �̵��Ѵ�.
			  }
		  
		  if (com>user) 
		     {
			         System.out.println("�Է°����� ū ���� �Է��ϼ���");
			      
		     }
		  else if (com<user)
		     {
			         System.out.println("�Է°����� ���� ���� �Է��ϼ���");
		     }
		  else
		     {
			       System.out.println("Game Over!!");
			    // System.exit(0);
			       break;
		     }

		}
		
	}

}
