/*     �޼ҵ�
 *         =�Ű����� (����ڿ�û��) => ���� => ����������
 *         =������    (��û���뿡 ���� ����� ���� = �Ѱ�(��������� ��� ����))
 *                ===========================
 *                      �⺻��, �迭, Ŭ����
 *         ====================================================
 *         ����
 *            ������ �޼ҵ��(�Ű����� ...) ==> �����
 *            {
 *                   ==> ������
 *                   return �����     =====> (������ = �����)
 *                          =====                 ===== ���� ���������� ����� �� �ִ�
 *            }
 *            
 *            return������ ������ ��� : void�� �� ������ �����ϴ�
 *            
 *            ex)  int aaa()
 *                 {
 *                          return(int,char,byte,short) => �ڹٿ����� ���� ������������ �޴� ���� �����Ѵ�
 *                 }
 *            
 *            ********* ȣ��  int a = aaa()
 *             
 *            �迭
 *            int[] aaa()
 *            {
 *                return �迭��
 *            }
 *            
 *            int[] arr = aaa()
 *            
 *            Ŭ����
 *            String aaa()
 *            {
 *                return ""(���ڿ�)
 *            }
 *            
 *            String s = aaa()
 *            
 *            ������� ���� ���
 *            void aaa()
 *            {
 *                return;
 *            }
 *            
 *            aaa()
 *            
 *            =========================
 *            
 *            �Ű������� �ִ� ���
 *            int plus(int a,int b)
 *            {
 *                       a=10,b=30
 *                return a+b;
 *            }
 *            
 *            int a = plus(10,30) 
 *            
 *            void aaa()
 *            {
 *                 === 1
 *                 === 2
 *                 === 3
 *                 === 4
 *                 === 5
 *                 === 6
 *                 === 7
 *           }
 *           
 *           aaa() => 1234567
 *           aaa() => 1234567 =>�ݺ��� ���õ� �κ� 
 *           
 *           ����� �ݵ�� ������ �����ؾ� ����� �� �ִ�.
 *           
 *           ������ ������ �迭�� ��� ����� ���� �ִ�.
 *           int[] arr = {1 5 7 4 3 2 1 2 8 9}
 *           String s="Hello Java";
 *           
 *           1 232 43434 434 343 4 34 34 343434  => int[] �迭�� ���´�.
 *           113 "aaa" "aadad" 0.9 10.2F 10L 'A' => Ŭ������  ������Ѵ�. �� ������ ���������� ������(3���̻�)�̱⶧���̴�.
 */

public class �޼ҵ�14 {
	static String name;
	
	static void message()
	{
		System.out.println("Hello Java!!!");
		//return; �������� ������ JVM�� �ڵ����� �ڵ��� ���ش�.
	}
	
	static int aaa()
	{
		return 10;
	}
	
	static double bbb()
	{
		return 10.5;
	}
	
	static String ccc()
	{
		return "Hello";
	}
	
	static int[] ddd()
	{
		int[] arr = {1,2,3,4,5};
		return arr;
	}
	
	static int eee(int a)
	{
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		message();
		
//		�޼ҵ�1 a = new �޼ҵ�1();
//		a. name="ȫ�浿1";
//		�޼ҵ�1 b = new �޼ҵ�1();
//		b. name="ȫ�浿2";
//		�޼ҵ�1 c = new �޼ҵ�1();
//		c. name="ȫ�浿3";
//		�޼ҵ�1 d = new �޼ҵ�1();
//		d. name="ȫ�浿4";
//		�޼ҵ�1 e = new �޼ҵ�1();
//		e. name="ȫ�浿5";
		       // System.out.println(a.name); �� ����ϸ� ? ȫ�浿5 �������� ? static�� �� �ڸ��� �������Ƿ� ������ ������ �Էµȴ�.  
		
		
		int a = aaa();
		double b = bbb();
		String s = ccc();
		int[] arr = ddd();
		int aa = eee(10);
	}

}
