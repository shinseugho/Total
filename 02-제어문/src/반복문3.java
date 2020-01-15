// 가위바위보 ==>5번==>1승 1무 3패
import java.util.Scanner;
public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1 ;
		int win=0, lose=0, same=0; 
		
		Scanner scan = new Scanner(System.in) ;
		
		while(i<=5)
		{
			int com = (int) (Math.random()*3);         //컴퓨터 가위바위보
			System.out.println("가위(0) 바위(1) 보(2)");  //사용자가 입력
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
		System.out.println("사용자 전적 : "+win+"승"+same+"무"+lose+"패");
	}

}
