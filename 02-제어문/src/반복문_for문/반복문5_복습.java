package 반복문_for문;

public class 반복문5_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int even = 0;
		int odd= 0;
		
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			if(i%2==0) even+=i;
			else       odd+=i;
		}
		
		System.out.println("총      합 : "+sum);
		System.out.println("짝수의 합 : "+even);
		System.out.println("홀수의 합 : "+odd);

	}

}
