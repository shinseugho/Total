package 객체지향_02_캡슐화;
/*
 *   변수 초기화 = 선언과 동시에 초기화
 *   
 *   ex)
 *   int a=10;
 *   
 *   1. 
 *   a=100; => 오류
 *   ===========
 *   2.
 *   {
 *      a=100;
 *   }
 *   ===========초기화 블록 (멤버변수 초기화)
 *   3.
 *   static()
 *   {
 *   
 *   }
 *   ===========static 초기화 블록(멤버변수(static) 초기화)
 *   4. 
 *   클래스명()
 *   {
 *      a=200;
 *   }
 */
class MyData{
	
	/* 1. {}
	 * int[] arr=new int[6];
	 * 
	 * { for(int i=0;i<6;i++) { arr[i]=(int)(Math.random()*100)+1; } }
	 * 
	 * // 결과값이 따로 돈다.
	 */
	
	/* 2. static 
	 * static int[] arr=new int[6];
	 * 
	 * static { for(int i=0;i<6;i++) { arr[i]=(int)(Math.random()*100)+1; } } //결과값이
	 * 같다
	 */
	static int[] arr=new int[6];
	
	public MyData() 
	{
		for(int i=0;i<6;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	
	/*  int a;    선언 
	 *  a=20;     구현 => 오류 : instance 변수이므로 생성자를 사용해야한다.
	 */
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1. {}
		 * MyData m1=new MyData(); for(int i=0;i<6;i++) {
		 * System.out.print(m1.arr[i]+" "); }
		 * 
		 * System.out.println("\n");
		 * 
		 * MyData m2=new MyData(); for(int i=0;i<6;i++) {
		 * System.out.print(m2.arr[i]+" "); }
		 */

		/* 2. static
		 * for(int i=0;i<6;i++) { System.out.print(MyData.arr[i]+" "); }
		 * 
		 * System.out.println("\n");
		 * 
		 * for(int i=0;i<6;i++) { System.out.print(MyData.arr[i]+" "); }
		 */
		
		MyData m1=new MyData();
		for(int i=0;i<6;i++)
		{
			System.out.print(m1.arr[i]+" ");
		}
		
		System.out.println("\n");
		
		MyData m2=new MyData();
		for(int i=0;i<6;i++)
		{
			System.out.print(m2.arr[i]+" ");
		}
		
		System.out.println("\n");
		
		MyData m3=new MyData();
		for(int i=0;i<6;i++)
		{
			System.out.print(m3.arr[i]+" ");
		}
		
		System.out.println("\n");
		
		for(int i=0;i<6;i++)
		{
			System.out.print(m1.arr[i]+" ");
		}
		// static 변수는 마지막에 저장된 변수가  저장되므로 m3와 마지막 m1이 같은 값이 출력된다. 
		
	
	}

}
