package 데이터연산처리;
/*
 *       비트연산자
 *       
 *        
 *       ===================================
 *                    &(and) |(or) ^(xor)
 *                     *       +
 *       ===================================
 *       0   0         0      0      0
 *       ===================================
 *       0   1         0      1      1
 *       ===================================
 *       1   0         0      1      1
 *       ===================================
 *       1   1         1      1      0
 *       ===================================
 *       
 *        ex ) 10 & 6 = 1010 * 0110 = 0010 = 2
 *             10 | 6 = 1010 + 0110 = 1110 = 14
 *             10 ^ 6 = 1010   0110 = 1100 = 12
 *       
 */
public class 이항연산자_비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   // System.out.println(~10);
	   // System.out.println(Integer.toBinaryString(-11));
		
		int a = 56 & 17; 
		int b = 56 | 17; 
		int c = 56 ^ 17;
		
		System.out.println(" a = "+a);
		System.out.println(" b = "+b);
		System.out.println(" c = "+c);
		/* 
		 *      56 = 2진법 ( 32 + 16 + 8 ) = 111000
		 *      17 = 2진법 ( 16 +1 )       = 10001
		 *      
		 *      111000             111000              111000
		 *      010001             010001              010001
		 *      ====== &           ====== |            ====== ^
		 *      010000 = 16        111001 = 57         101001 = 41
	 	 */
		
	}

}
