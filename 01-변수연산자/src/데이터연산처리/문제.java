package 데이터연산처리;
import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//문제1 화폐갯수
		
		int won = 65430; 
		
		int w10000 = won/10000;
		System.out.println("만원 = "+w10000);
		
		int w1000 = (won%10000)/1000;
		System.out.println("천원 = "+w1000);
		
		int w100 = (won%1000)/100;
		System.out.println("백원 = "+w100);
		
		int w10 = (won%100)/10;
		System.out.println("십원 = "+w10);
	
	}

}
