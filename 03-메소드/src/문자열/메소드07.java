package ���ڿ�;


public class �޼ҵ�07 {
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
		
		String a="Java";     // string�� void���� ����Ǽ� ��µȴ�. hello�� java�� ����� �Ŀ� java�� ��µȴ�.
		getData2(a);         // �ٸ� ������ 3->1�̸� 3�� ��µȴ�.
		System.out.println(a);
		
		int[] arr=new int[5];
		for(int i:arr)
		{
			System.out.println(i);
		}
		getData(arr);   //�ݹ��̷��۷������? 
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
