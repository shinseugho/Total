package �迭1;
/*
 *  5���� ������ �޾� �ִ밪,�ּҰ�
 */

import java.util.Scanner;

public class �迭09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� ? = 3 ?
		int[] num = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		//���Է�
		for(int i=0;i<5;i++)
		{
			num[i]=(int)(Math.random()*100)+1;
		}
		int max=num[0];
		int min=num[0];
					
		for(int i:num) 
		{
			if(max<i) max=i;
			if(min>i) min=i;
		}
		System.out.print(" ");
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
	}

}
