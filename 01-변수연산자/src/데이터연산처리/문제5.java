package 데이터연산처리;
import java.util.Scanner ;

public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in) ;
		
		//변수 설정
		int year ;
		
		//입력부
		System.out.println("년도 입력 : ");
		year = scan.nextInt();
		
		//조건부
		String jud=(year%4==0 && (year%100!=0||year%400==0))?"윤년":"평년";
		
		//출력부
		System.out.println(jud);
		
		
	}

}
