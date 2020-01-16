package 조건문;
// 알파벳 => 저장 => 대,소문자 구별

public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char alpha = 'a' ;
		
		// 사이, 기간 은 &&사용
		// char은 모든 연산 시행시 정수변환(자동형변환)이 이루어진다.
		
		if (alpha>='A' && alpha<='Z')
			System.out.println(alpha+"는(은) 대문자입니다.");			
		
		if (alpha>='a' && alpha<='z') // if (!(alpha>='A' && alpha<='Z'))는 오류가 발생한다. 
			System.out.println(alpha+"는(은) 소문자입니다.");
				
		
		
	}

}
