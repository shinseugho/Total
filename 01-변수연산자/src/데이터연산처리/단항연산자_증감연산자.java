package �����Ϳ���ó��;
/*
 * �ڹ��� ������
 *    ================
 *    Method ���� (static)
 *    ================
 *    Stack     �޸𸮰���({})�� ������ �������� ȸ��                  = ��������
 *    ================
 *    Heap      �����(���α׷���)�� ����(�������÷������� ȸ��)  = �������(��������)
 *    ================
 */

public class ���׿�����_���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���������� -- , --
		int a = 10;
		//��ġ����
		a--; 	
		a--;
		a--;
		
		System.out.println("a="+a);
		
		
		int b = 10;
		//��ġ����
		--b;
		--b;
		--b;
		
		System.out.println("b="+b);
		
		
		int c = 10;
		int d = c--; // C���� ���� �����ϰ�, +1�� �϶�
		
		System.out.println("C="+c);
		System.out.println("D="+d);
		
		
		int e = 10;
		int g = --e; // E���� ���� �����ϰ�, �������� �����϶�
		
		System.out.println("E="+e);
		System.out.println("G="+g);
		

	}

}
