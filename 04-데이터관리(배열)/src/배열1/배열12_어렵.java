package 배열1;
/*
 *  O,X를 입력해서 몇개를 맞췄는지 작성
 */
import java.util.Scanner;

public class 배열12_어렵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] dap = new char[10]; 
		for(int i=0;i<dap.length;i++)
		{
			int k =(int)(Math.random()*2);
			if(k==0)
				dap[i]='O';
			else
				dap[i]='X';
		}
		
		/*
		 * for(char c:dap) { System.out.print(c+" "); }
		 */
		char[] user = new char[10];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<user.length;i++)
		{
			System.out.println((i+1)+"번째 답 입력(O.X) : ");
			String s=scan.next();
			user[i]=s.charAt(0);
		}
		
		//출력
		System.out.println("정답 : ");
		for(char c:dap)
		{
			System.out.print(c+" ");
		}
		
		System.out.println("\n사용자입력값 : ");
		for(char c:user)
		{
			System.out.print(c+" ");
		}
		
		System.out.println("\n결과 : ");
		int count = 0;
		for(int i=0;i<dap.length;i++)
		{
			if(dap[i]==user[i])
				count++;
		}
		System.out.println("점수 : "+(count*10)+"점");

	}

}
