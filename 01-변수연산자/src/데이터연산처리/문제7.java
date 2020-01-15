package 데이터연산처리;

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'A';
		
		char lowerCase = (char) ((ch >= 'A' && ch <= 'Z')?ch+32:ch);
		
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
		

	}

}
