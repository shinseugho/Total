package 배열1;
/*
 * a,b,c를 입력받아서 가장 큰수를 출력
 */
public class 복습_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// If함수 이용한 최대값 출력
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

		System.out.println("최대값 : "+max);
		
		//배열을 통한 최대값 출력
		
		int maxs=0;
		for(int i=0;i<3;i++)
		{
			int[] arr=new int[3];
			arr[i] = (int)(Math.random()*100)+1;
			if(arr[i]>maxs) maxs=arr[i];
			System.out.println((i+1)+"번째 출력값 : "+arr[i]);
			
		}
		
		System.out.println("최대값 : "+maxs);
		
	}

}
