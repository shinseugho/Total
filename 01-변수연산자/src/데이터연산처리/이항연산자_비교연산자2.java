package �����Ϳ���ó��;


//������� �Է°��� �޾Ƽ� (¦��, Ȧ��) �Ǵ�

import java.util.Scanner ;

public class ���׿�����_�񱳿�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner(System.in) ;
	
	//���� 
	int num ;
	
	//�Էº�
	System.out.println("���� �Է� : ");
	num = scan.nextInt();
	
	//���ǹ�
	String result = num%2==0?"¦��":"Ȧ��" ;
	
	//��¹�
	System.out.println(num+"��(��)"+result+"�Դϴ�");
		
	}

}
