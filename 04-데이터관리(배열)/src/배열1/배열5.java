package 배열1;
import java.util.Scanner;

public class 배열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year,month;  // int[] data=new int[2]; 가능
		
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요 : ");
		year = scan.nextInt();

		System.out.println("월을 입력하세요 : ");
		month = scan.nextInt();
		
		int[] lastDay = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastDay[1]=29;
		else
			lastDay[1]=28;
		
		System.out.println(month+"월의 마지막 날은 "+lastDay[month-1]+"입니다.");
	}

}
