package �迭1;
//5���� ������ �Է¹޾Ƽ� 5������ ����ϰ� �հ� ��յ� ���

import java.util.Scanner;

public class �迭7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5]; //�ϰ����� 5���� ����
		int total=0;            //����
		double avg=0.0;         //����
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println((i+1)+"��°���� �Է� :");
			arr[i] = scan.nextInt();
		}
		
		for(int score:arr)
		{
			System.out.println(score);
			total+=score;
		} 
		
		avg = total/(double)arr.length;
		
		System.out.println("���� : "+total);
		System.out.printf("��� : %.2f\n",avg);

	}

}
