/*
 *  컴퓨터 = 1 ~ 100 사이의 임의의 수를 추출하고, 플레이어가 답을 캊추는 게임
 *  힌트 up/down뿐이다.
 */
import java.util.Scanner;

public class 업다운게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int com = (int)(Math.random()*100)+1; // 1 ~ 100까지의 난수 생성
		
		Scanner scan = new Scanner(System.in) ;
		
		while (true)  // 무한루프 (조건이 true이기 때문이다.)
		{
		  System.out.println("1 ~ 100 사이의 정수 입력 : ");
		  int user = scan.nextInt();
		  
		  if (user<1 || user>100) 
			  {
			         System.out.println("잘못된 입력입니다!!");
			         continue;   // 처음으로 되돌리고 싶다면 continue, 종료하고 싶다면 break를 설정한다. 
			                     // while 문의 조건식으로 이동한다.
			  }
		  
		  if (com>user) 
		     {
			         System.out.println("입력값보다 큰 수를 입력하세요");
			      
		     }
		  else if (com<user)
		     {
			         System.out.println("입력값보다 작은 수를 입력하세요");
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
