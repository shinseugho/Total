package 데이터연산처리;
/*
 * 단항 : 피연산자(연산대상) 1개일 경우
 * 부정연산자 : ! 
 * ===========================
 *  = boolean 을 사용한다
 *  = true->false. false->true => 오라클
 */


public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bcheck=false;
		
		System.out.println("bcheck 변경전 : "+bcheck);
		
		bcheck=!bcheck;
		
		System.out.println("bcheck 변경후 : "+bcheck);
		
		
	}

}
