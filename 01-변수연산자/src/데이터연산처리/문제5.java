package �����Ϳ���ó��;
import java.util.Scanner ;

public class ����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in) ;
		
		//���� ����
		int year ;
		
		//�Էº�
		System.out.println("�⵵ �Է� : ");
		year = scan.nextInt();
		
		//���Ǻ�
		String jud=(year%4==0 && (year%100!=0||year%400==0))?"����":"���";
		
		//��º�
		System.out.println(jud);
		
		
	}

}
