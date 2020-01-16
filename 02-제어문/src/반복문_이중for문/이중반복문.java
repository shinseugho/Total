package 반복문_이중for문;
/*
 *    형식 - 순서 )
 *    
 *         1    2 ↑ = false
 *    for(초기값;조건식;증가식(8))     ===1차
 *    {          ↓ = true  
 *             1  2 ↑ = false  ===> 1차 for문의 증가식으로 올라간다.
 *      for(초기값;조건식;증가식(4))   ===2차
 *      {          ↓ = true
 *           3
 *         2차 실행문장
 *      }
 *           5
 *      1차 실행문장  
 *    }
 * 
 * 
 *  1차 for문이 false일 시에 종료
 */

public class 이중반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//별표출력
		for (int i=1; i<=5; i++)   //몇줄을 만들것인가
		{
			/*
			 * System.out.print("★"); 
			 * System.out.print("★");
             * System.out.print("★");
			 * System.out.print("★"); 
			 * System.out.print("★");
			 */
			
			for (int j=1;j<=5;j++)  // 어떤 것을 출력할 것인가
			{
			    System.out.print("★");
			}
			
			System.out.println();
		}
		
		
		//#과 숫자 출력
		for (int k=1 ; k<=5; k++)
		{
			for (int m=1; m<=5; m++)
			{
				if(k==m) System.out.print(k);
				else     System.out.print("#");
			}
			System.out.println();
		}
		
		//         i   k
		//*       줄수   별표
		//**       1   1       i=k 
		//***      2   2
		//****     3   3
		//*****    4   4
		//         5   5
		
		for (int a=1;a<=5;a++)
		{
			for (int b=1;b<=a;b++)
			{
			    System.out.print("*");
			}
			System.out.println();
		}
		
		//              i   j       
		//*****        줄수  별표           i+j=6   ->   j=6-i
		//****          1   5
		//***           2   4
		//**            3   3
		//*             4   2
		//              5   1 
		
		for (int c=1;c<=5;c++)
		{
			for (int d=1;d<=6-c;d++)
			{
			    System.out.print("*");
			}
			System.out.println();
		}
		
		//*출력의 우측정렬
		//                i    j   k        i+j = 5     -> j=5-i
		//    *          줄수   공백   별표            i = k
		//   **           1    4   1
		//  ***           2    3   2
		// ****           3    2   3  
		//*****           4    1   4
		//                5    0   5

		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5-i;j++)
			{
			    System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
			    System.out.print("*");
			}
			System.out.println();
		}

		
		
		//                i    j     k      i=j+1     -> j=i-1     
		//*****          줄수    공백     별표          i+k=6    ->  k=6-i
		// ****           1    0     5
		//  ***           2    1     4
		//   **           3    2     3
		//    *           4    3     2
		//                5    4     1
		
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i-1;j++)
			{
			    System.out.print(" ");
			}
			for (int k=1;k<=6-i;k++)
			{
			    System.out.print("*");
			}
			System.out.println();
		}
		

		

	}

}
