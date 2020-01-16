package 문자열;
/* 프로그래머들이 선호하는 방식이다.
 * Call by Reference (주소를 넘기는 경우) => 배열, 클래스
 * 메인값도 변경이 된다. (주소로 변경하기때문이다.)
 * 
 * 
 *  class A
 *  {
 *     int a=10;
 *  }
 *  
 *  swap(A aa)
 *  { 
 *     aa.a=1000;
 *  }
 *  
 *  A aa=new A();
 *  swap(aa)
 *  
 *  aa.a ? 1000 
 */

public class 메소드23 {
	static void swap(int[] arr)
	{
		System.out.println("<변경전> swap : arr[0]= "+arr[0]+", arr[1]= "+arr[1]);
		
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		
		System.out.println("<변경후> swap : arr[0]= "+arr[0]+", arr[1]= "+arr[1]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)
		{
		   메소드23 a=new 메소드23();
		   System.out.println(a);
		}
		
		int[] arr= {100, 200};
		swap(arr);
		System.out.println("<메   인> swap : arr[0]= "+arr[0]+", arr[1]= "+arr[1]);

	}

}
