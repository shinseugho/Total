/* year를 입력을 받아서 윤년여부 확인
 * 
 * 1. 입력부 static int year()
 * 2. 판단부 static boolean year() 
 * 3. 출력부 static void print(int year, boolean year) 
 * 4. 조합부 static void process()
 */

import java.util.Scanner;

public class 메소드24 {

	//1번양식
	static void isYear(int year)
	{
		if((year%4==0 && year%100!=0) || (year%400==0))
           System.out.println(year+"년도는 운년입니다.");
		else 
		   System.out.println(year+"년도는 윤년이 아닙니다.");
	}
	
	//2번양식
	static boolean isYear2(int year)
	{
		if((year%4==0 && year%100!=0) || (year%400==0))
           return true;
		else 
		   return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=2019;
		
		//1번출력
		isYear(year);
		
		//2번출력
		boolean bCheck=isYear2(year);
		if(bCheck) System.out.println(year+"년도는 윤년입니다.");
		else       System.out.println(year+"년도는 윤년이 아닙니다.");
		
	}

}
