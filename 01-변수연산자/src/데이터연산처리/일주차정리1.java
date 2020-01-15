package 데이터연산처리;

public class 일주차정리1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*      변수 : 한 개의 데이터를 저장
 *           1. 선언하고 값 미설정
 *           2. 선언하고 값 설정
 *           
 *           ex1) int kor; 
 *                int eng;
 *           ex2) int kor, eng ; 
 *           ex1과 ex2는 동일하다.
 *            
 *           ex3) int kor=100; 
 *                int eng=100;
 *           ex4) int kor=100, eng=100 ; 
 *           ex3과 ex4는 동일하다.*               
 *          
 *           ex5) int kor, eng ; 
 *                kor = eng = 100 ;
 *    		
 *    변수 명에는 의미를 부여하는 것이 남이나 나중에 파악하기에 쉽다.
 *    
 *    자바개발자들의 공통 약속       1. 클래스명은 대문자 시작. 
 *                         2. 메소드명 이나 변수명은 소문자로 시작.
 *                         3. 상수는 전체 대문자로 시작.
 *                         4. 들여쓰기
 */
		
		int kor , eng , math ;
		kor = eng = math = 100 ;
		
		System.out.println("kor = " +kor);
		System.out.println("eng = " +eng);
		System.out.println("math = " +math); // 변수 설정 예시
		
		
		String first_name="홍" ; // 권장사항은 firstName 
		String last_name ="길동"; //         lastName		
		System.out.println("이름 : "+first_name+"\t"+last_name); // 문자열 결합 예시
		
		

	}

}
