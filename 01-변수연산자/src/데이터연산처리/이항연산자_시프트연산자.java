package �����Ϳ���ó��;
/*
 *  ����Ʈ������ (��Ʈ�̵�������)
 *   <<   �����̵�
 *   >>   �������̵�
 *   
 *     10<<2 = 40
 *      1010 
 *    101000
 *    
 *     10>>2 = 2 
 *     1010
 *       10(10)
 *     
 *     14<<3 = 112 (14*2^3)
 *     1110
 *  1110000
 *  
 *     14>>3 = 1 (14/2^3)
 *     1110
 *        1(110)
 */
public class ���׿�����_����Ʈ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 14<<3;
		int b = 14>>3;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
