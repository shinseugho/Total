package �迭1;
/*
 *  5���ǳ����߻� ==>����
 */

public class �迭11_��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ����
		int[] arr = new int[5];

		//�ʱⰪ 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println("���� �� : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("�������� : ");
		
		for(int i=0;i<(arr.length-1);i++)            //�ڱ��ڸ��ʹ� ���� �ʿ䰡 ��� -1
		{
			for(int j=(i+1);j<arr.length;j++)        //�����ڿ� ��
				
			{
				if(arr[i]<arr[j])                    //arr[j]�� arr[i]�� ���ڸ� ����
				{                                    //���������� arr[i]>arr[j]�� �����ϸ�ȴ�
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} 
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	
		
	}

}
