package 데이터연산처리;
import java.util.Scanner;

public class 문제4_재풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수
		
		String name ; 
		int kor, eng, math, total ;
		double avg ;
		
		//입력부
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Input name : ");
		name = scan.next();
		System.out.println("Kor : ");
		kor = scan.nextInt();
		System.out.println("Eng : ");
		eng = scan.nextInt();
		System.out.println("Math : ");
		math = scan.nextInt();
		
		//합계점수
		
		total = kor + eng + math ;
		
		//평균점수 (소수 1자리)
		
		avg = total / 3.0 ;
		
		// 출력부
		
		System.out.println("이름 : "+name);
		System.out.println("합계점수 : "+total);
		System.out.printf ("평균점수 : %.1f",avg);
	}

}
