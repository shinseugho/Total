package 데이터연산처리;

// 1,2 난수발생 홀수(1),짝수(2)해서 비교문제

import java.util.Scanner;

public class 이항연산자_비교연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int com=(int)(Math.random()*2)+1 ;
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("입력(홀,짝) : ") ;
		String input = scan.next();
		
		String result = com%2==0?"짝":"홀" ;
		
		String dap = input.equals(result)?"정답":"오답" ; //문자열(String) 비교는 ==이 아니라 equals를 넣어주어야한다. 
		System.out.println("com="+com);
		System.out.println("dap="+dap);
		
	}

}
