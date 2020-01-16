package 반복문_for문;
/*
 * 1~100까지의 합
 * 짝수/홀수합 출력
 * 
 * 결과
 * 1~100까지의 합 
 * 1~100까지의 짝수합
 * 1~100까지의 홀수합
 */
public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int even = 0;
		int odd = 0;
		
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			if (i%2==0)  even+=i;
			else          odd+=i;
		}
		
		System.out.println("총합 : "+sum);
		System.out.println("짝수의 합 : "+even);
		System.out.println("홀수의 합 : "+odd);
		
	}

}
