// �����Է� => 
/* �Է� static int[] input()
 * ��� static void(int[]) 
 * ===
 * ���� static void
 */

import java.util.Scanner;

public class ����4 {
	
	static int print()
	{
		int a=10;
		return a;
	}
	
	static void process(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = print();
		process(a);

	}

}
