package �ݺ���_for��;
import java.util.Scanner;

public class �ݺ���6_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("3�ڸ� �빮�� �Է� : ");
		String alpha = scan.next();
		
		for(int i=0;i<alpha.length();i++)
		{
			char c = alpha.charAt(i);
			System.out.print((char)(c-3));
		}

	}

}
