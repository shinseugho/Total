package 데이터저장;
/*
 *       프로그램 (언어) : java, c/c++, c#, kotlin
 *                     ====             ======   
 *       =>  데이터 저장  => 데이터 처리 => 데이터 출력 ( DOS/WINDOW (Application), 브라우저(Web Application), 스마트폰(모바일) )         
 *          =========        
 *          1) 변수 : 한 개의 데이터 저장공간 (필요한 데이터 저장을 위해 변수(=데이터의 저장주소)가 필요하다.)
 *          2) 배열 : 같은 유형의 데이터를 여러개 저장하는 공간 
 *          3) Class : 다른 유형의 데이터를 여러개 저장하는 공간 
 *          --------- 메모리에 저장
 *          4) 파일
 *          5) RDBMS(오라클)      
 *          
 *          변수 생성에 필요한 요인 
 *          
 *          1. 저장공간의 크기 = 자료형 (데이터형) 
 *              정수저장  byte = 1 byte = -128 ~ 127 저장가능
 *                     short = 2 byte = -32768 ~ 32767 저장가능 (c/c++ 호환을 위하여 존재, java에서는 그닥 사용x)
 *                     int = 4 byte = -21억 4천 ~ 21억 4천 - 1    
 *                     long = 8 byte
 *                     ============= ex) byte b = 10;    (메모리크기 변수명(=별칭) = 값;)
 *                                       int kor = 90;  
 *                     * int / long 구분 - int   = 10, 20, 30 .....
 *                                       long  = 10L, 20L, 30L ..... 
 *                                       EX) long a = 10L
 *                                           long b = 10      (int=>long, int 가 long 으로 자동 변환)
 *                                           int c = 'A'      (CHAR => INT)
 *                                           ==== 65
 *              실수저장  float  = 4byte                소수점 6자리
 *                     double = 8 byte => default => 소수점 15자리
 *                     ex) float f = 10.5F (10.5f) 
 *                         double d = 10.5 (10.5d, 10.5D) 
 *                         실수형을 정수로 변환시 소수점 이하는 제외된다.  (int) 10.55 => 10 
 *                     ex) (int)10.5 + (int)20.5 = 30
 *                         (int)(10.5+20.5)      = 31     
 *              문자저장  char = 2byte (0~65535 각국의 모든 국어 저장)
 *                     ex) 'A' '한' ....
 *                         홍길동 저장 시, char[] or string = ""
 *              논리(true/false)저장  boolean 
 *                                 ex) boolean b = true
 *                                     boolean b = false
 *              * 참조형 String = 문자열 ( 문자 여러개 저장하는 경우) 
 *                     ex) String name = "홍길동"               
 *                            
 *          2. 메모리에 이름 부여 = 문법 ( 식별자 ) / 글자수는 제한이 없다 (3~7글자)
 *             1'.  알파벳, 한글로 시작 (단, 알파벳은 대소문자 구분)
 *                 ex) 영어 점수 표기 명령시, engScroe, eng_score 등으로 표기
 *             2'.  숫자사용이 가능하다 (단, 앞에 사용은 불가능하다)
 *                 ex) kor2, eng6 .....
 *             3'.  특수문자( _ , $ ) 사용이 가능하다.
 *                 _ 는 단어가 여러개 일 경우에 많이 사용한다. 특히, 임시파일의 경우 _파일명 으로 많이 만든다. 
 *             4'. 예약어 ( 자바에서 사용하는 단어 (byte, short, int, long .....) )
 *        중요 : byte , int , long , double, boolean , String         
 */
public class 자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
       
        
	}

}
