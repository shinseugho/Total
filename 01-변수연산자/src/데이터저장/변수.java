package 데이터저장;
// 변수 = 프로그램에 필요한 한 개의 데이터를 저장하는 메모리 이름
//                   ==========
/*
 *      값을 설정하고 형식을 입력한다. 
 *      1) 정수 
 *      ----
 *      10진법      int a=10
 *      2진법        int b=0b1010
 *      8진법        int c=012
 *      16진법      int d = 0xFF
 *      ----
 *         byte b=10
 *         short s=100
 *         int i=100
 *         long l=100L
 *      2) 실수  
 *         float f=10.5F
 *         double d=10.5
 *      3) 문자 
 *         char c='A'
 *      4) 논리형 
 *         boolean b=true
 *      5) 문자열 
 *         String s="Hello Java" 
 */
public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 4 byte 크기의 메모리 제작
		// 이 메모리의 이름 = a, a 라는 메모리에 10을 저장해라.
		int a=10;     //10진법
		int b=012;    //8진법
		int c=0xA;    //16진법 
		int d=0b1010; //이진법
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		float f=10.5F;
		System.out.println("f="+f);

		double d2=10.5D;
		System.out.println("d2="+d2);
		
		// + 산술연산자
		// + 문자열 결합
		// 7+""+7  => 77
		// 7+7     => 14
		// 77+""+77+""+(7+1) = ? (77778) 
		
		boolean bcheck=true;
		System.out.println("bcheck="+bcheck);
		
		char ch='k';
		System.out.println("ch="+ch);
		
		String name = "홍길동";
		System.out.println(name);
		
		/*
		 * 정수 함계값
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
