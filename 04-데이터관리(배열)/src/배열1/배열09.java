package 배열1;
/*
 *  5개의 정수를 받아 최대값,최소값
 */

import java.util.Scanner;

public class 배열09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수 ? = 3 ?
		int[] num = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		//값입력
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
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}

}
