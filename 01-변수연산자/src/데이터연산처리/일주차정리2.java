package 데이터연산처리;

public class 일주차정리2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *      자바에서 제공하는 특수문자
 *      1) \n ( : newLine) 다음줄 출력 명령
 *      2) \t ( : tab )    일정 간격
 *      3) \" ( :  )       "(띠옴표) 출력명령    ex) System.out.println( "\"Hello Java!!\"")
 *      
 *      출력형식 
 *        ex1)  홍길동 System.out.println( "홍길동");
 *              심청이 System.out.println( "심청이");
 *              박문수 System.out.println( "박문수");
 *        ex2)  홍길동 심청이 박문수
 *              홍길동 System.out.print( "홍길동\t");
 *              심청이 System.out.print( "심청이 \t");
 *              박문수 System.out.print( "박문수\n");
 *       %서식이 있는 출력 (JDK 1.5이상 가능)
 *        
 *        1)   %d => 정수           System.out.printf("국어점수 : %5d%5d%5d",100,90,60);   5d 는 입력칸을 5칸 사용하라는 의미이다.   -5d는 왼쪽정렬 5d는 오른쪽 정렬
 *        2)   %f => 실수           System.out.printf();
 *        3)   %c => 문자           System.out.printf();
 *        4)   %s => 문자열        System.out.printf();
 *          
 *              System.out.printf(); 
 *              
 *              이름       국어     영어     수학     총점
 *              홍길동     90    90    90   270
 *              
 *              
 */ 
	
		System.out.printf("%-5d%-5d%-5d%-5d\n",100,90,60,70);
		
		System.out.printf("%-10.2f%-10.2f%-10.2f\n",99.9999,80.88,60.6666666);  // %-10.2f는 10칸을 쓰되 소수점은 2칸을 써라.
		
		System.out.printf("%2c%2c%2c\n",'A','B','C');
		
		System.out.printf("%10s%10s%10s\n","Hello","Java","!!");
		
		System.out.printf("%7s%5d%5d%5d%7.2f%c\n","홍길동",100,90,80,80.000,'A'); // 섞어서 사용할 수 있다.
		
	}

}
