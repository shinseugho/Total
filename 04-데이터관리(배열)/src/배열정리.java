/*  1. 묶어서 사용(데이터)
 *     배열 ==> 클래스 ==> 패키지 ==> 라이브러리
 *     ===
 *     
 *     프로그램
 *      데이터 + 명령문(메소드) => 클래스
 *      ==================
 *      클래스 여러개========>조립(=자바CBD) 
 *      
 *  2. 자바 ===> 오라클 ===> HTML(CSS,JavaScript) ==> JSP ==> MVC ==> Spring ==> kotlin
 *                       ===============================================웹       =======모바일
 *                       =============================    ==============
 *                               프론트앤드개발자                                백앤드개발자    
 *                                                         
 *  3. 배열           : 연속적인 메모리공간이다.  
 *     배열의 단점 : 값이 고정적(수정불가) ==> 가변형에 대한 고민  ==> 같은데이터형만 모아서 사용                                      
 *               선언시 메모리 크기를 결정
 *               ==================
 *               1) 선언
 *                  int[] arr;
 *                  ===   ===
 *                 데이터형 배열명(실제 저장된 데이터의 주소)
 *                 
 *               2) 초기화
 *                  arr={1,2,3,4,5}
 *                  arr=new[5]          : 메모리공간 할당방식(추후 데이터 대입)
 *               
 *               3)값을 읽기,쓰기 ==> 인덱스
 *               
 *                 int[] arr={10,20,30,40,50}
 *                 
 *                 arr          arr[0] arr[1] arr[2] arr[3] arr[4]   =>연속적 = for문 
 *                =====        |=================================| 
 *                 100           10  |  20  |  30  |  40  |  50  
 *                =====        |=================================|
 *                            100
 */

// 달력출력
import java.util.*;
import java.text.*;
import java.time.Year;
import java.util.Scanner;
/*  달력
 *  ===============================
 *   1) 연도와 월을 입력받아야한다.
 *   2) 해당 월의 1일자의 요일을 파악한다.
 *   3) 마지막날을 파악한다.
 *   4) 양식에 맞춰 출력한다.
 *  ===============================
 */
public class 배열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 년도, 월 입력
	    char[] strWeek= {'일','월','화','수','목','금','토'};
	    //month가 0부터 시작  ==> month + 1을 해야 12월까지 나온다. 
	    //week는 1부터 시작   ==> week - 1을 해야한다.
		Calendar cal = Calendar.getInstance();
	    int y =cal.get(cal.YEAR);
	    int m =cal.get(cal.MONTH)+1;
	    int d =cal.get(cal.DATE);
	    int w =cal.get(cal.DAY_OF_WEEK);
	    System.out.println("============"+y+"년도"+m+"월"+d+"일"+strWeek[w-1]+"요일============");
	    
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도 입력 : ");
		int year = scan.nextInt();
		
		System.out.println("월 입력 : ");
		int month = scan.nextInt();

	    System.out.println(year+"년도 "+month+"월");
	    System.out.println("\n");
	    
		/*
		 * System.out.print("일\t"); 
		 * System.out.print("월\t"); 
		 * System.out.print("화\t");
		 * System.out.print("수\t"); 
		 * System.out.print("목\t"); 
		 * System.out.print("금\t");
		 * System.out.print("토\t");
		 */


	    for(int i=0;i<7;i++)
	    {
	    	System.out.print(strWeek[i]+"\t");
	    }
	    
	    // 해당월의 1일자 요일
	    // 전년도 12월31일까지의 합을 구한다.
	    int total = (year-1)*365 
	    		    +(year-1)/4
	    		    -(year-1)/100
	    		    +(year-1)/400;
	    // 전달
	    int[] lastday={31,28,31,30,31,30,31,31,30,31,30,31};
	    if((year%4==0 && year%100!=0)||(year%400==0)) //2월달
	    	lastday[1]=29;
	    else lastday[1]=28;
	    
	    for(int i=0;i<month-1;i++)
	    {
	    	total+=lastday[i];
	    }
	    // +1 ==> %7 ==> 요일을 구한다.
	    total++; //각달의 1일자
	    int week=total%7;
	    
	    System.out.println();
	    for(int i=1;i<=lastday[month-1];i++)
	    {
	    	if(i==1)
	    	{
	    		for(int j=0;j<week;j++)
	    		{
	    			System.out.print("\t");
	    		}
	    	}
	    	System.out.printf("%2d\t",i);
	    	week++;
	    	if(week>6)
	    	{
	    		week=0;
	    		System.out.println();
	    	}
	    }
	    
	    
	    
	}

}
