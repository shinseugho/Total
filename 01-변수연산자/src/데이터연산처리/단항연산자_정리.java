package �����Ϳ���ó��;
/*
 * 
 */

public class ���׿�����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10 ;
		int b = a++ ; // a = 11 , b = 10
		int c = ++a ; // a = 12 , c = 12
		              // a = 12, b =10, c = 12 
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		
		char ch = 'A' ;
		System.out.println(++ch) ; // �ڿ� ������ ����ϰ� �����϶� �� �ǹ� (�տ� ������ �����ϰ� ����϶�� �ǹ�)
		
		int i = 10 ;
		int j = i++ + i++ + ++i + ++i + i++ + i++ + i-- + --i;
		//       10    11   13    14     14    15    16   14       		
		System.out.println(i);
		System.out.println(j);
		
		int x = 10 ; 
		int y = 9  ;		
		boolean bCheck=(x<y)&&(++y==x);		
		System.out.println(bCheck);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		// ����������       �ݺ������� ���
		// ����������(!) ���ǹ��� ���鶧 ����Ѵ�
		
	}

}
