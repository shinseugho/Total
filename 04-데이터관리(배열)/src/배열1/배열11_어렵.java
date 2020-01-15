package 배열1;
/*
 *  5개의난수발생 ==>정렬
 */

public class 배열11_어렵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수 저장
		int[] arr = new int[5];

		//초기값 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println("정렬 전 : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("내림차순 : ");
		
		for(int i=0;i<(arr.length-1);i++)            //자기자리와는 비교할 필요가 없어서 -1
		{
			for(int j=(i+1);j<arr.length;j++)        //옆숫자와 비교
				
			{
				if(arr[i]<arr[j])                    //arr[j]는 arr[i]의 옆자리 숫자
				{                                    //오름차순은 arr[i]>arr[j]로 변경하면된다
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
