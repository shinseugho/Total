// ���������� ==>5��==>1�� 1�� 3��
import java.util.Scanner;
public class �ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1 ;
		int win=0, lose=0, same=0; 
		
		Scanner scan = new Scanner(System.in) ;
		
		while(i<=5)
		{
			int com = (int) (Math.random()*3);         //��ǻ�� ����������
			System.out.println("����(0) ����(1) ��(2)");  //����ڰ� �Է�
			int user = scan.nextInt();
			
			int res = com-user;
/*			if(res==-1||res==2)
*			{
*				win++;
*			}
*			else if(res==1||res==-2)
*			{
*				lose++;
*			}
*			else
*			{
*				same++;
*			}
*/			
			switch(res)
			{
			case -1 :
			case 2 :	
			     win++;
			     break;
			case 1 :
			case -2 :	
			     lose++;
			     break;
			default: same++;
			}
			i++;
		}
		System.out.println("����� ���� : "+win+"��"+same+"��"+lose+"��");
	}

}
