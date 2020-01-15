/*
 *    배열 : 여러데이터를 한 개의 이름으로 제어
 *         인덱스(첨자)를 이용한다.
 *         ** 인덱스는 0부터 시작
 *    1) 형식
 *       1. 선언
 *          데이터형[] 배열명 
 *          =============
 *           = 기본타입          (int,long,float,double ...
 *             ex) int[] arr
 *                 long[] arr
 *           = 사용자 정의 타입 (클래스)
 *             ex) class Movie
 *                 Movie[] arr
 *           ---------------------- java에 있고 c언어에는  boolean이 없다.
 *           
 *       2. 초기값
 *          = int[] arr = {1,2,3,4,5,6}
 *          = int[] arr = new int[6]
 *          ----------------------- 자체 초기값 int:0, long:0L, String:null
 *                                  null = 메모리에 저장된 주소값이 존재하지않는다. 
 *                                  
 *       3. 데이터읽기
 *          = arr[index number] 
 *               =============== 갯수 - 1 임을 잊어서는 안된다. 
 *               
 *       4. 데이터저장
 *          = arr[1]=10 
 */
/*
 *  숫자 야구 게임
 *  ==========SB
 *  => 난수 => 729 
 *  => 사용자가 입력 => 567 ==>0S 1B
 *                 같은숫자가 있는가? - 같은숫자가 있지만, 다른자리에 위치한다.   1B
 *                               - 같은숫자가 있고, 같은자리에 위치한다.    1S                                             
 *                               3S 면 아웃  
 */

import java.util.Scanner;
/*
 * 1. 중복없는 난수 발생
 * ================
 * 2. 사용자입력
 * 3. 힌트
 * 4. 종료여부 확인
 * 5. 3S = 종료한다.
 * ================ 반복 while문
 *
 *
 *  변수 연산자 제어문  출력
 *     ========== 
 *        메소드
 *  =================
 *        클래스      
 */
public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] com = new int[3];
		// 난수발생시 저장
		int su=0; 
		// 중복여부를 확인 (중복이면 true)
		boolean bCheck=false;
		
		for(int i=0;i<com.length;i++)
		{
			bCheck=true;
			//===============
			while(bCheck)
			{
				//난수 발생
				su =(int)(Math.random()*9)+1;
				bCheck=false;
				//중복여부 확인
				for(int j=0;j<i;j++)// i만큼 저장되어있기때문에 i만큼만 비교를 하면된다.
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			//===============
			com[i]=su;
		}
		
		int[] user = new int[3];
		
		/*
		 * for(int i=0;i<3;i++) { com[i]=(int)(Math.random()*5)+1; }
		 * 
		 * for(int i:com) { System.out.println("i="+i+"\t"); }
		 */
		
		//int[] i = {3,6,9} 면 369로 답이 고정된다.
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			// 값입력
			System.out.println("3자리 정수 입력 : "); 
			int input = scan.nextInt();          
			
			// 오류처리_1
			if( input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
				continue;
			}
			
			// 배열값변경 
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// 오류처리_2 (중복된수를 쓸 수 없다. 0을 사용할 수 없다.)
			if((user[0] == user[1]) || (user[1] == user [2]) || (user[0] == user [2]))
			{
				System.out.println("중복된 수는 사용할 수 없습니다."); //힌트가 꼬이는 경우가 발생한다.
				continue;
			}
			
			if((user[0] == 0) || (user[1] == 0) || (user[2] == 0))
			{
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			
			//비교시작
			int s=0,b=0;
			for (int i=0;i<3;i++)     //i = com
			{
				for(int j=0;j<3;j++)  //j = user
				{
					if(com[i]==user[j]) 
					{
						if(i==j) s++;
						else     b++;
					}
				}
			}
			
			//힌트		
			System.out.printf("Input Number:%d, Result:%ds-%dB\n",input,s,b);
			System.out.println("=========================================");
			System.out.print("S : ");
		    for(int i=0;i<s;i++)
		    {
		    	System.out.print("●");
		    }
		    System.out.print("\nB : ");
		    for(int i=0;i<b;i++)
		    {
		    	System.out.print("○");
		    }
			System.out.println("\n=========================================");
			
			//종료여부 확인
			if(s==3) 
			{
				System.out.println("Game Over!");
				break;
			}
			
		}
		
		
	}

}
