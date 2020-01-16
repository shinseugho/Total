package 배열1;
/*
 *     배열(Array)
 *     
 *     1) 같은 데이터를 여러개 모아서 한개의 변수명으로 제어
 *     2) 배열 선언시에 자동으로 연속적인 메모리 생성
 *                        ===========
 *                        => 시작과 끝이 정해져 있다.
 *                        => 0 ~ 배열갯수(반복문조절) 
 *     3) 단점 : 고정적
 *     4) 사용처 : 관련된 데이터가 3개이상이면 배열을 사용한다.
 *     5) 사용 
 *        1. 선언
 *           ex) 데이터형[] 배열명; // 자바권장사항        // int[] arr; , double[] arr; , char[] arr;
 *               데이터형 배열명[]; // c언어계열에 사용   // int arr[]; , double arr[];, char arr[];
 *        2. 초기값 설정
 *           * ex) int a; => a+=10 => Error 단, 전역변수는 초기값을 주지않아도 자동으로 0을 초기값으로 잡는다.
 *               int[] arr={10,20,30,40,50} => 자동으로 배열갯수는 5라고 인식한다.
 *             주소를 참조해서 데이터를 관리한다. (참조변수, 배열과 클래스가 참조변수를 이용한다.)
 *             ex) arr[0] .... arr[4]
 *             ex) arr[0] = 100;
 *                 === =
 *                배열명 첨자(인덱스)
 *               
 *           ** int[] arr=new int[5];
 *                        === ====== 정수 5개의 저장공간을 연속적으로 생성하라.
 *                      메모리 할당    
 *              new 의 초기값은 전체가 0이다.
 *              ex) double[] arr=new double[3]; 0.0
 *                  String[] arr=new String[3]; null
 *                  char[] arr  =new char[3]; '\0'
 *                  boolean[] arr=new boolena[3]; false
 *        3. 활용
 *           => 값변경
 *              첩자를 이용 = arr[1]=100
 *                        ======
 *                        저장된 메모리 위치값
 *           => 출력         = 배열의 모든 첨자는 0부터 시작
 *                        for(int i=0 .....)
 *        4. 초과하거나 줄 일 수 없다 = ArrayIndexOfBoundsException = 배열의 범위 초과라는 에러발생
 *        5. 배열의 갯수 => 배열명.length 시 늘릴수있다.                
 */

// 정수 3개 입력 => 입력받은 데이터 출력

import java.util.Scanner;

public class 배열01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		a = scan.nextInt();
		
		System.out.println("두번째 정수 입력 : ");
		b = scan.nextInt();
		
		System.out.println("세번째 정수 입력 : ");
		c = scan.nextInt();
		
		// a,b,c증에 가장 큰 수를 출력
		
		int max=0;
		if (a>max) max=a;
		if (b>max) max=b;
		if (c>max) max=c;
		
		System.out.println("가장 큰 값 : "+max );
		
	}

}
