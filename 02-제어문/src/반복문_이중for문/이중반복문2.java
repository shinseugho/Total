package 반복문_이중for문;
/*
 * break, continue 사용
 * 
 * break    반복을 중단할 때
 * ex) 
 * for(int i=1;i<=10;i++)
 * {
 *     if (i==5) 
 *     break;
 *     System.out.println(i);
 * }
 * ===> 1~4까지만 출력한다.
 * 
 * continue 특정 부분을 제외할 때
 * for(int i=1;i<=10;i++)
 * {
 *     if (i==5) 
 *     continue;
 *     System.out.println(i);
 * }
 * ===>5를제외한 나머지를 출력한다.
 */

public class 이중반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5와 7을 제외하고 출력
		  for(int i=1;i<=10;i++)
		 {
			  if (i==5 || i==7) 
			  continue;
			  System.out.println(i);
		 }
		  
		  System.out.println("====");
		  
	    //짝수출력
		  for(int i=1;i<=10;i++)
		 {
			  if (i%2!=0) 
			  continue;
			  System.out.println(i);
		 }
		  
		  System.out.println("====");
		  
		 //홀수출력
		  for(int i=1;i<=10;i++)
		 {
			  if (i%2==0) 
			  continue;
			  System.out.println(i);
		 }
		  
		  System.out.println("====");
		  
	}

}
