package 데이터연산처리;
/*
 *  시프트연산자 (비트이동연산자)
 *   <<   왼쪽이동
 *   >>   오른쪽이동
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
public class 이항연산자_시프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 14<<3;
		int b = 14>>3;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
