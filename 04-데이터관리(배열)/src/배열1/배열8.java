package 배열1;
/*
 *    3명의 학생  국어,영어,수학점수를 입력받아  총점, 학점, 평균출력
 *    80 80 80 240 B 80.0
 *    90 90 90 270 A 90.0
 *    70 70 70 210 C 70.0
 *    
 */

import java.util.Scanner;

public class 배열8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 5개
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		
		int[] total = new int[3];
		char[] score = new char[3];
		double[] avg = new double[3];
		
		//입력부
		Scanner scan = new Scanner(System.in);
		for (int i=0;i<3;i++)
		{
			System.out.println((i+1)+"번째 국어점수입력");
			kor[i]=scan.nextInt();
			System.out.println((i+1)+"번째 영어점수입력");
			eng[i]=scan.nextInt();
			System.out.println((i+1)+"번째 수학점수입력");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			
			switch((int)avg[i]/10) // 정수,문자,문자열,실수(X)
			{
			case 10:
			case  9:
				score[i] = 'A';
				break;
			case  8:
				score[i] = 'B';
				break;
			case  7:
				score[i] = 'C';
				break;
			case  6:
				score[i] = 'D';
				break;
			default: 
				score[i] = 'F';
			}
			
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.println( kor[i]   + " "
				              + eng[i]   + " "
				              + math[i]  + " "
				              + total[i] + " "
				              + score[i] + " "
				              + avg[i]   + " " );	
		}

	}

}
