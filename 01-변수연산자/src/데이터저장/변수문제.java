package 데이터저장;
/*
 * 이름, 국어, 영어, 수학 점수를 저장한 후
 * 이름, 국어, 영어, 수학, 총점, 평균 을 출력하라. 
 */
public class 변수문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*
  *  이름 = name
  *  국어 = kor
  *  영어 = eng
  *  수학 = math       
  */
		
	String name = "홍길동";   	
	int kor = 83;
	int eng = 83;
	int math = 83;
			
	
	
	System.out.println("이름:"+name);
	System.out.println("국어:"+kor);
	System.out.println("영어:"+eng);
	System.out.println("수학:"+math);
	System.out.println("총점:"+(kor+eng+math));
	System.out.printf("평균:%.2f",(kor+eng+math)/3.0);
	
	
	// 나누기이후 3.0(실수) 을 3 (정수) 으로 입력하면 결과값이 정수만 표시된다.
	// System.out.printf("평균:%.2f",(kor+eng+math)/3.0); %.2f 는 소수점이하자리수(2자리)를 나타낸다. 
	// System.out.print 의 경우는 옆으로 붙여서 출력한다.(가로출력)
	// System.out.prinln 의 경우는 아래로 새줄에서 출력한다.(세로출력)
	
	}

}
