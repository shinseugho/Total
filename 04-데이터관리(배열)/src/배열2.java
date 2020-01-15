/*
 * 중복없는 난수생성	
 * =>배열
 * ============
 * 난수발생
 * ============
 * 
 * 비교할때 이차 for문을 쓴다.
 * 
 * =======
 * 
 * =======
 * =>제어문 
 * 1. for-for문
 *   for()
 *   {
 *     for()
 *     {
 *     }
 *   }
 * 2. for-while문
 *   for()
 *   {
 *     while()
 *     {
 *     } 
 *   }
 * 3. for-do-while문
 *   for()
 *   {
 *     do
 *     {
 *     }while()
 *   }
 * 등 많지만 무엇이 정답이다라고는 말할 수없다. 상황따라 다를수 있다.     
 */

public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] com = new int[9];
		
		// 난수발생시 저장
		int su=0; 
		
		// 중복여부를 확인
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
		
		//출력
		for(int i:com)
		{
			System.out.print(i+" ");
		}
	}

}
