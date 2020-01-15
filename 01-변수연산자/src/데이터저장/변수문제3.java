package 데이터저장;

// 만개의 레시피 

public class 변수문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//쉐프이름. 레시피제목. 서브제목(코멘트). 음식양. 조리시간. 제작가능연령
		
		String cheif = "-Travel HEY";
		String title = "잡내없이삶기, 고기만 먹어도 맛있고 김치랑 먹어도 맛있는 수육";		
		String sub_title = "\"야들야들하고 잡냄새 없이 삶는 팁\""; // ""를 출력하고 싶다면 \" ~ \" 를 붙여주면 된다. 
		int people = 4;
		int time = 60;
		String who = "아무나";
		
		 System.out.println("요리사:"+cheif);
		 System.out.println("레시피명:"+title);
		 System.out.println("부제목:"+sub_title);
		 System.out.print("시식인원:"+people+"인분\t"); // \t는 같은줄에서 간격을 띄우고 싶을때 사용한다. \n은 아랫줄(다음줄)에 출력하고 싶을때 사용한다.
		 System.out.print("조리시간:"+time+"분 이내\t");
		 System.out.print("가능대상:"+who);
		 		
		 
	}

}
