package �����Ϳ���ó��;

// 1,2 �����߻� Ȧ��(1),¦��(2)�ؼ� �񱳹���

import java.util.Scanner;

public class ���׿�����_�񱳿�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int com=(int)(Math.random()*2)+1 ;
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("�Է�(Ȧ,¦) : ") ;
		String input = scan.next();
		
		String result = com%2==0?"¦":"Ȧ" ;
		
		String dap = input.equals(result)?"����":"����" ; //���ڿ�(String) �񱳴� ==�� �ƴ϶� equals�� �־��־���Ѵ�. 
		System.out.println("com="+com);
		System.out.println("dap="+dap);
		
	}

}
