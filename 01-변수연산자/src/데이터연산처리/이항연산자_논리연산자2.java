package 데이터연산처리;
/*
 *       형변환  숫자일 경우에만 가능하다.
 *       ====
 *       Up    casting 자동형변화
 *       Down  casting 강제형변화     char,short,byte 는 연산시 결과값이 int로 계산되서 나온다.  ex) (int)10.5
 *       단, boolean은 형변환이 되지않는다. String은 메소드 이용해서 형변환가능하다.(String은 일반 형이 아니라 클래스.....)(현재에는 몰라도 된다.) 
 *       
 *       &&  || ! 의 세가지 조건문은 논리 조건문으로 true/false를 판별하는데 사용한다.        
 */

public class 이항연산자_논리연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b1 = (6<7) && (7==7) ; //true
		System.out.println("b1="+b1) ;
				
		        b1 = (6>7) && (7==7) ; //false
		System.out.println("b1="+b1) ;
		
		        b1 = (6>7) || (7==7) ; //true
		System.out.println("b1="+b1) ;
		
                b1 = (6<7) || (7==7) ; //true
        System.out.println("b1="+b1) ;
        
                b1 = (6>7) || (7!=7) ; //false
        System.out.println("b1="+b1) ;
        
	}

}
