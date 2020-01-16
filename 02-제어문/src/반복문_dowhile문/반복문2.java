package 반복문_dowhile문;
// 1) 3명의 학생 국어,영어,수학 점수,평균, 총점, 학점 출력 
//    국어 영어 수학 총점 평균 학점
//  A 
//  B
//  C
//

import java.util.Scanner;

public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int kor, eng, math, total, avg ;
		String result = "";

		int i = 1 ;
		do
		{
			System.out.println("국어 점수 입력 : ");
			kor  = scan.nextInt() ;
			System.out.println("영어 점수 입력 : ");
			eng  = scan.nextInt() ;
			System.out.println("수학 점수 입력 : ");
			math = scan.nextInt() ;
			
			total = kor + eng + math ;
			avg = total / 3 ;
			
			char c = 'A';
			switch(avg/10)
			{
			case 10:
			case 9:
				c='A';
			    break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
			}
			
			result+=kor+" "+eng+" "+math+" "+total+" "+avg+" "+c+"\n";
			i++;
			
		}while(i<=3);
		
		System.out.println("국어 영어 수학 총점 평균 학점");
		System.out.println(result);
	}

}
