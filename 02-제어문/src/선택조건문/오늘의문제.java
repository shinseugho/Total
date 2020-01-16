package 선택조건문;
/*
 *  if ~ else
 *  
 *  1. 정수를 한 개 입력받아서 짝수/홀수 출력
 *  2. 알파벳을 받아서 대소문자 (char a = 'A') 출력
 *  3. 정수 3개를 입력받아서 평균(avg)내고 90점이상 A, 80점이상 B, 70점이상 C, 60점이상이면 D, 60점 미만이면 F  출력
 *    
 */

import java.util.Scanner;

public class 오늘의문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 정수를 입력받아서 짝수홀수 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();
		
		if (num%2==0) System.out.println(num+"은(는) 짝수입니다.");
		else          System.out.println(num+"은(는) 홀수입니다.");
		
		
		// 2. 알파벳 대소문자 출력
		char alpha = 'A' ;
		if  (alpha>='A' && alpha<='Z') System.out.println(alpha+"는(은) 대문자입니다.");		
		else			               System.out.println(alpha+"는(은) 소문자입니다."); 

		
		
		// 3. 정수3개입력 후 평균 및 등급구분
		System.out.println("국어 점수 : ");
		int kor = scan.nextInt();
		
		System.out.println("영어 점수 : ");
		int eng = scan.nextInt();
		
		System.out.println("수학 점수 : ");
		int math = scan.nextInt();
		
		int avg = (int)(kor+eng+math)/3 ; 
		System.out.println("평균 점수 : "+avg);
		
		if (avg>=90 && avg <= 100) System.out.println("A 입니다.");
		if (avg>=80 && avg <   90) System.out.println("B 입니다.");
		if (avg>=70 && avg <   80) System.out.println("C 입니다.");
		if (avg>=60 && avg <   70) System.out.println("D 입니다.");
		if (           avg <   60) System.out.println("F 입니다.");
		
	}

}
