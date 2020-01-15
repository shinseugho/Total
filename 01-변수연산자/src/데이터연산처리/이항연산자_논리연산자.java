package 데이터연산처리;
/*
 *    && and연산자 (직렬처리) 
 *    || or연산자   (병렬처리) 
 *    
 *    문법형식     
 *            (조건)&&(조건)   범위안에 있는 경우                                      ex) score>=90 && score<=100
 *            (조건)||(조건)   범위밖에 있는 경우 (오류처리에 많이 사용)     ex) score<0   || score>100
 *            
 *    실행과정   
 *            ================================
 *                             &&       ||
 *            ================================
 *            true  true      true     true 
 *            ================================
 *            true  false     false    true 
 *            ================================
 *            false true      false    true
 *            ================================
 *            false false     false    false
 *            ================================
 *            
 *            * 효율적 연산 
 *              &&연산자는 왼쪽 연산자가 false라면 오른쪽 연산은 하지 않는다.
 *              ||연산자는 왼쪽 연산자가 true 라면 오른쪽 연산은 하지 않는다.
 *              
 */

public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * //알파벳 저장한 후에 소문자, 대문자 판별
		 * 
		 * char c = 'A' ;
		 * 
		 * String result = (c>='A' && c<='Z')?"대문자":"소문자" ;     //String을 사용하는 이유는 결과값이 여러개로 구성 되기때문이다. 
		 * 
		 * System.out.println(c+" 는(은) "+result);
		 */
		
		//알파벳 저장한 후에 소문자, 대문자 판별
		
		//변수 설정
		char c = 'A' ;
				
		//기능추가 : 대문자면 소문자 / 소문자면 대문자로 변경 
		//char A = 65 char a = 87 대소문자 차이가 32발생한다.		
	    char result = (c>='A' && c<='Z')?(char)(c+32):(char)(c-32) ; //char 을 사용하는 이유는 결과값이 한 개로 출력되기 때문이다. 
				
		System.out.println(c+" 는(은) "+result);
		
	}

}
