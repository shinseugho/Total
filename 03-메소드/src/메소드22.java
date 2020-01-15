/*     �޼ҵ�
 *     1) ����
 *        ������ �޼ҵ��(�Ű�����) =>�����
 *        {
 *             ��ɱ���
 *             return �����  (������� �������� ���������� ���ƾ��Ѵ�.) 
 *        }
 *        => �������� ���� ��� => return�� ������ �� �ִ�.
 *        => ��� �޼ҵ�� �����ϱ� ���ؼ� �ݵ�� �������� return�� ����Ѵ�.
 *           ����) ���ǹ��� ����ؼ� return�� ����� �� �ִ�.
 *                return�� �ؿ��� � ���嵵 ����� �Ұ����ϴ�.
 *                                
 *                display(10);
 *                static void display(int a)
 *                {
 *                      System.out.println(a);
 *                      return;
 *                      System.out.println(a+1);  // �̹����� ������ �߻��Ѵ�. �� ������ return���Ŀ� �ֱ⶧���̴�.
 *                }
 *                
 *                display(10);
 *                static void display(int a)
 *                {
 *                      System.out.println(a);
 *                      if(a==10) return;
 *                      System.out.println(a+1);  // �̹����� ������ �¾� ��������ʴ´�. 
 *                }
 *                
 *     2) ������
 *        �⺻�� : int method()
 *        Ŭ���� : Movie method()
 *        �迭    : int[] method()
 *        void : ������� ���� ���
 *     
 *     3) �Ű�����
 *        ����� ��û��
 *        3�� �̻��̸� �迭/Ŭ������ ����ϴ� ��찡 ����.
 *     
 *     4) �Ű����� ���۹�
 *        call by value : �⺻��, String
 *        ============================== �޸𸮸� ���� ����(������)
 *        call by reference : �迭, Ŭ����     
 *        ============================== ���� �ּҸ� �̿��ؼ� ������
 *     
 *     5) ȣ��
 *        �޼ҵ��()
 *        �޼ҵ��(10,20)              
 *        =======================   return���� ���� ���
 *        �������� ����=�޼ҵ�()
 *        �������� ����=�޼ҵ�(10,20)
 *     
 *     *  ��� �޼ҵ�� ������ ������ ������ �ٽ� ȣ���� ��ġ�� ���ư���.
 *     ** �޼ҵ带 ������ ȣ�� �� �� ���� �޼ҵ尡 ������ �����ؾ� ���� �޼ҵ带 ȣ��
 *        a()
 *        b()
 *        c()
 *        ========
 *          c()
 *        ========  
 *          b()
 *        ========
 *          a() ========> ����   
 *        ======== 
 *        
 *        �Ű����� ���� : call by value ���ΰ��� ������ �����ʴ´�.(�ּҰ� ��������)
 */
/* ���α׷��ӵ��� ��ȣ�ϴ� ����̴�.
 * Call by Reference (�ּҸ� �ѱ�� ���) => �迭, Ŭ����
 * ���ΰ��� ������ �ȴ�. (�ּҷ� �����ϱ⶧���̴�.)
 * 
 * 
 *  class A
 *  {
 *     int a=10;
 *  }
 *  
 *  swap(A aa)
 *  { 
 *     aa.a=1000;
 *  }
 *  
 *  A aa=new A();
 *  swap(aa)
 *  
 *  aa.a ? 1000 
 */

public class �޼ҵ�22 {
	
	static void swap(String a, String b)
	{
		//������
		System.out.println("<������> swap: a= "+a+",b= "+b);
		
		//������
		String temp=a;
		a=b;
		b=temp;
		
		//������
		System.out.println("<������> swap: a= "+a+",b= "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		String b="Java";
		swap(a,b);
		System.out.println("<����>  main: a= "+a+",b= "+b);
	}

}
