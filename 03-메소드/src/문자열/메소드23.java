package ���ڿ�;
/* ���α׷��ӵ��� ��ȣ�ϴ� ����̴�.
 * Call by Reference (�ּҸ� �ѱ�� ���) => �迭, Ŭ����
 * ���ΰ��� ������ �ȴ�. (�ּҷ� �����ϱ⶧���̴�.)
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

public class �޼ҵ�23 {
	static void swap(int[] arr)
	{
		System.out.println("<������> swap : arr[0]= "+arr[0]+", arr[1]= "+arr[1]);
		
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		
		System.out.println("<������> swap : arr[0]= "+arr[0]+", arr[1]= "+arr[1]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)
		{
		   �޼ҵ�23 a=new �޼ҵ�23();
		   System.out.println(a);
		}
		
		int[] arr= {100, 200};
		swap(arr);
		System.out.println("<��   ��> swap : arr[0]= "+arr[0]+", arr[1]= "+arr[1]);

	}

}
