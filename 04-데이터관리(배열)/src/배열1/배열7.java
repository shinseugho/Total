package 배열1;
//5개의 정수를 입력받아서 5개정수 출력하고 합과 평균도 출력

import java.util.Scanner;

public class 배열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5]; //일괄변수 5개의 정수
		int total=0;            //총점
		double avg=0.0;         //변수
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println((i+1)+"번째정수 입력 :");
			arr[i] = scan.nextInt();
		}
		
		for(int score:arr)
		{
			System.out.println(score);
			total+=score;
		} 
		
		avg = total/(double)arr.length;
		
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %.2f\n",avg);

	}

}
