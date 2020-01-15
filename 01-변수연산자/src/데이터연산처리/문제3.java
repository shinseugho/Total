package 데이터연산처리;
import java.util.*;
	
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 정수입력: ");
		int num1 = scan.nextInt();
		System.out.println("2번째 정수입력: ");
		int num2 = scan.nextInt();
		
		System.out.println("두 정수의 합은 "+(num1+num2)+"입니다.");
		

		String name = "이효리";  
	    String department = "개발부"; 
		String position="대리";
		int sal=1500000;
			
		System.out.println("이름 : "+name);
		System.out.printf ("부서 : "+department+"\t");
		System.out.print ("직위 : "+position + "\t 급여 : " + sal);
		
		
	}

}
