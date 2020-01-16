package ��ü����_02_ĸ��ȭ;
/*
 *   ���� �ʱ�ȭ = ����� ���ÿ� �ʱ�ȭ
 *   
 *   ex)
 *   int a=10;
 *   
 *   1. 
 *   a=100; => ����
 *   ===========
 *   2.
 *   {
 *      a=100;
 *   }
 *   ===========�ʱ�ȭ ��� (������� �ʱ�ȭ)
 *   3.
 *   static()
 *   {
 *   
 *   }
 *   ===========static �ʱ�ȭ ���(�������(static) �ʱ�ȭ)
 *   4. 
 *   Ŭ������()
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
	 * // ������� ���� ����.
	 */
	
	/* 2. static 
	 * static int[] arr=new int[6];
	 * 
	 * static { for(int i=0;i<6;i++) { arr[i]=(int)(Math.random()*100)+1; } } //�������
	 * ����
	 */
	static int[] arr=new int[6];
	
	public MyData() 
	{
		for(int i=0;i<6;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	
	/*  int a;    ���� 
	 *  a=20;     ���� => ���� : instance �����̹Ƿ� �����ڸ� ����ؾ��Ѵ�.
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
		// static ������ �������� ����� ������  ����ǹǷ� m3�� ������ m1�� ���� ���� ��µȴ�. 
		
	
	}

}
