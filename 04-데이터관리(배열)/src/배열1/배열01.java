package �迭1;
/*
 *     �迭(Array)
 *     
 *     1) ���� �����͸� ������ ��Ƽ� �Ѱ��� ���������� ����
 *     2) �迭 ����ÿ� �ڵ����� �������� �޸� ����
 *                        ===========
 *                        => ���۰� ���� ������ �ִ�.
 *                        => 0 ~ �迭����(�ݺ�������) 
 *     3) ���� : ������
 *     4) ���ó : ���õ� �����Ͱ� 3���̻��̸� �迭�� ����Ѵ�.
 *     5) ��� 
 *        1. ����
 *           ex) ��������[] �迭��; // �ڹٱ������        // int[] arr; , double[] arr; , char[] arr;
 *               �������� �迭��[]; // c���迭�� ���   // int arr[]; , double arr[];, char arr[];
 *        2. �ʱⰪ ����
 *           * ex) int a; => a+=10 => Error ��, ���������� �ʱⰪ�� �����ʾƵ� �ڵ����� 0�� �ʱⰪ���� ��´�.
 *               int[] arr={10,20,30,40,50} => �ڵ����� �迭������ 5��� �ν��Ѵ�.
 *             �ּҸ� �����ؼ� �����͸� �����Ѵ�. (��������, �迭�� Ŭ������ ���������� �̿��Ѵ�.)
 *             ex) arr[0] .... arr[4]
 *             ex) arr[0] = 100;
 *                 === =
 *                �迭�� ÷��(�ε���)
 *               
 *           ** int[] arr=new int[5];
 *                        === ====== ���� 5���� ��������� ���������� �����϶�.
 *                      �޸� �Ҵ�    
 *              new �� �ʱⰪ�� ��ü�� 0�̴�.
 *              ex) double[] arr=new double[3]; 0.0
 *                  String[] arr=new String[3]; null
 *                  char[] arr  =new char[3]; '\0'
 *                  boolean[] arr=new boolena[3]; false
 *        3. Ȱ��
 *           => ������
 *              ø�ڸ� �̿� = arr[1]=100
 *                        ======
 *                        ����� �޸� ��ġ��
 *           => ���         = �迭�� ��� ÷�ڴ� 0���� ����
 *                        for(int i=0 .....)
 *        4. �ʰ��ϰų� �� �� �� ���� = ArrayIndexOfBoundsException = �迭�� ���� �ʰ���� �����߻�
 *        5. �迭�� ���� => �迭��.length �� �ø����ִ�.                
 */

// ���� 3�� �Է� => �Է¹��� ������ ���

import java.util.Scanner;

public class �迭01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���� �Է� : ");
		a = scan.nextInt();
		
		System.out.println("�ι�° ���� �Է� : ");
		b = scan.nextInt();
		
		System.out.println("����° ���� �Է� : ");
		c = scan.nextInt();
		
		// a,b,c���� ���� ū ���� ���
		
		int max=0;
		if (a>max) max=a;
		if (b>max) max=b;
		if (c>max) max=c;
		
		System.out.println("���� ū �� : "+max );
		
	}

}
