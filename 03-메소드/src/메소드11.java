
// 1~45 => 난수발생 => 중복없는 6개발생
/*
 *  배열 => 6개 
 *  
 *  for(6회)
 *  {
 *      while(중복)
 *      {
 *         난수발생
 *         배열저장된 데이터와 난수(같다)
 *      }
 *      
 *      배열저장
 *      
 *  }
 */
public class 메소드11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//난수저장공간
		int[] com=new int[6];
		//난수
		int su=0;
		//비교=>중복확인
		boolean bCheck=false;
		for(int i=0;i<6;i++)
		{
			bCheck = true;
			while(bCheck)
			{
			      su=(int)(Math.random()*45)+1;
			      bCheck=false;
			      for(int j=0;j<i;j++)
			      {
			    	    if(com[j]==su)
			    	    {
			    	    	bCheck=true;
			    	    	break;
			    	    }
			      }
			}
			
			/* 연산순서
			 * 1. Math.random()
			 * 2. *45 
			 * 3. (int)
			 * 4. +1
			 */
		}
		
		//출력
		for(int i:com) // 저장된 데이터 한개씩 읽어온다. (for-each)
		{
			System.out.print(i+" ");
		}
	}

}
