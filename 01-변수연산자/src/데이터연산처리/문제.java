package �����Ϳ���ó��;
import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//����1 ȭ�󰹼�
		
		int won = 65430; 
		
		int w10000 = won/10000;
		System.out.println("���� = "+w10000);
		
		int w1000 = (won%10000)/1000;
		System.out.println("õ�� = "+w1000);
		
		int w100 = (won%1000)/100;
		System.out.println("��� = "+w100);
		
		int w10 = (won%100)/10;
		System.out.println("�ʿ� = "+w10);
	
	}

}
