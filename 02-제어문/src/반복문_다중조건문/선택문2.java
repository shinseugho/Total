package 반복문_다중조건문;

public class 선택문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 90 ;
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;	
		case 7:
			System.out.println("C");
			break;	
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
	}

}
