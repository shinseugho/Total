package ����������;
// ���� = ���α׷��� �ʿ��� �� ���� �����͸� �����ϴ� �޸� �̸�
//                   ==========
/*
 *      ���� �����ϰ� ������ �Է��Ѵ�. 
 *      1) ���� 
 *      ----
 *      10����      int a=10
 *      2����        int b=0b1010
 *      8����        int c=012
 *      16����      int d = 0xFF
 *      ----
 *         byte b=10
 *         short s=100
 *         int i=100
 *         long l=100L
 *      2) �Ǽ�  
 *         float f=10.5F
 *         double d=10.5
 *      3) ���� 
 *         char c='A'
 *      4) ���� 
 *         boolean b=true
 *      5) ���ڿ� 
 *         String s="Hello Java" 
 */
public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 4 byte ũ���� �޸� ����
		// �� �޸��� �̸� = a, a ��� �޸𸮿� 10�� �����ض�.
		int a=10;     //10����
		int b=012;    //8����
		int c=0xA;    //16���� 
		int d=0b1010; //������
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		float f=10.5F;
		System.out.println("f="+f);

		double d2=10.5D;
		System.out.println("d2="+d2);
		
		// + ���������
		// + ���ڿ� ����
		// 7+""+7  => 77
		// 7+7     => 14
		// 77+""+77+""+(7+1) = ? (77778) 
		
		boolean bcheck=true;
		System.out.println("bcheck="+bcheck);
		
		char ch='k';
		System.out.println("ch="+ch);
		
		String name = "ȫ�浿";
		System.out.println(name);
		
		/*
		 * ���� �԰谪
		 * ii = 2147483647
		 * ss = 127
		 * ll = 9223372036854775807
		 * ss = 32767
		 */
		byte bb=Byte.MAX_VALUE;
		short ss=Short.MAX_VALUE;
		int ii=Integer.MAX_VALUE;
		long ll=Long.MAX_VALUE;
		System.out.println("ii="+ii);
		System.out.println("bb="+bb);
		System.out.println("ll="+ll);
		System.out.println("ss="+ss);
	}

}
