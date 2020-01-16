package 선택조건문;
import java.util.Scanner;

public class 연습문제1_요일계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//입력부분
		Scanner scan = new Scanner(System.in) ;
		System.out.println("년도를 입력하세요.");
		int year = scan.nextInt() ; 
		
		System.out.println("달을 입력하세요.");
		int month = scan.nextInt() ; 

		System.out.println("일을 입력하세요.");
		int day = scan.nextInt() ; 

		//처리부분
		int total = (year-1) * 365
		           +(year-1) / 4
		           -(year-1) / 100
		           +(year-1) / 400 ;
		int[] lastDay = { 31,28,31,30,31,30,31,30,31,30,31,30} ;
		if ((year%4==0 && year%100!=0)||(year%400==0))
			lastDay[1]=29;
		else
		    lastDay[1]=28;
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		total += day;
		int week = total%7;
		
		char strWeek='월' ;
		if(week==0) strWeek='일';
		if(week==1) strWeek='월';
		if(week==2) strWeek='화';
		if(week==3) strWeek='수';
		if(week==4) strWeek='목';
		if(week==5) strWeek='금';
		if(week==6) strWeek='토';
		
		
		
		//결과부분
		System.out.println(year+" 년"+month+" 월"+day+" 일 은(는)"+strWeek+"요일입니다.") ;
		
		
	}

}
