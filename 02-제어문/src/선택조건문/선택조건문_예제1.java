package 선택조건문;

public class 선택조건문_예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 난수
		int score = (int)(Math.random()*101); //0~100
		System.out.println("score = "+score);
		
		//90 이상  A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 60이하 F
		
		if (score < 60)
		{
			System.out.println("F학점입니다.");
		}
		else
		{
			// 중첩if문 = 이중조건문
			// if문 여러개를 사용했을 경우에는 조건맞는 모든 문장을 수행할 수 있다.
			if (score >= 90 && score <= 100 ) System.out.println("A학점입니다.");
			if (score >= 80 && score < 90)    System.out.println("B학점입니다.");
			if (score >= 70 && score < 80)    System.out.println("C학점입니다.");
			if (score >= 60 && score < 70)    System.out.println("D학점입니다.");
		}
	}

}
