package �迭1;
/*
 * a,b,c�� �Է¹޾Ƽ� ���� ū���� ���
 */
public class ����_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// If�Լ� �̿��� �ִ밪 ���
		int a = (int)(Math.random()*100)+1;
		int b = (int)(Math.random()*100)+1;
		int c = (int)(Math.random()*100)+1;
		
		int max=0;
		
		if(a>max) 
		{
			max=a;
		}
		if(b>max)
		{
			max=b;
		}
		if(c>max)
		{
			max=c;
		}

		System.out.println("�ִ밪 : "+max);
		
		//�迭�� ���� �ִ밪 ���
		
		int maxs=0;
		for(int i=0;i<3;i++)
		{
			int[] arr=new int[3];
			arr[i] = (int)(Math.random()*100)+1;
			if(arr[i]>maxs) maxs=arr[i];
			System.out.println((i+1)+"��° ��°� : "+arr[i]);
			
		}
		
		System.out.println("�ִ밪 : "+maxs);
		
	}

}
