package 데이터연산처리;
import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				String name;				
				int kor, eng, math, total;
				double avg;
				
				//입력할 수 있는 기능의 클래스 
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Input name : ");		
				name=scan.next();
				
				System.out.println("kor : ");		
				kor=scan.nextInt();
				
				System.out.println("eng : ");
				eng=scan.nextInt();
				
				System.out.println("math : ");
				math=scan.nextInt();
				
				//총점
				total = kor+eng+math;
				
				//평균
				avg=total/3.0;
				
				//결과출력
				System.out.println("이름 : "+name);
				System.out.println("합계점수 : "+total);
				System.out.printf ("평균점수 : %.1f",avg);
				

	}

}
