package �����Ϳ���ó��;
/*
 *        ��������� (+,-,*,/,%)
 *        
 *        �ٸ� ���������� ������� ��� 1) int ���� ��������(byte, short, char) => ����ó�� => int
 *                                byte + byte = int
 *                                char + byte = int   
 *                                short + btye + char = int
 *                               
 *                                byte + int = int
 *                                short + char + int = int 
 *                                
 *                                short + char + int + double = double < string ex) ""+77 = "77" , ""+0.5 = "0.5"
 * 
 */
public class ���׿�����_��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//byte b = 127;
		//byte c = 10;
		//int d = b+c; // byte�� ���������� �Է��� ��� ������ �߻��Ѵ�. 
		               // byte d = (byte)(b+c);
		//System.out.println("d="+d);
		
		byte b = (byte)300;
		System.out.println("b="+b);
		System.out.println(Integer.toBinaryString(300));
		
		/*
		 * 300 1 00101100
		 *       ========
		 *       44 
		 */
		
		int a = 10 + 20 * 3;
		System.out.println("A="+a);
		
	}

}
