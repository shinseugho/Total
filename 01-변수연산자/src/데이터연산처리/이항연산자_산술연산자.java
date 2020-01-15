package 데이터연산처리;
/*
 *        산술연산자 (+,-,*,/,%)
 *        
 *        다른 데이터형을 사용했을 경우 1) int 이하 데이터형(byte, short, char) => 연산처리 => int
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
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//byte b = 127;
		//byte c = 10;
		//int d = b+c; // byte로 데이터형을 입력할 경우 오류가 발생한다. 
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
