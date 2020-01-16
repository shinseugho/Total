package 문자열;


public class 메소드07 {
	static void getData2(String a)
	{
		a="Hello";
	}
	static void getData(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Java";     // string만 void값이 변경되서 출력된다. hello가 java로 변경된 후에 java가 출력된다.
		getData2(a);         // 다른 변수는 3->1이면 3이 출력된다.
		System.out.println(a);
		
		int[] arr=new int[5];
		for(int i:arr)
		{
			System.out.println(i);
		}
		getData(arr);   //콜바이래퍼런스방식? 
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
