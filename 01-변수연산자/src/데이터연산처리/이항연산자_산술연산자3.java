package 데이터연산처리;
// %의 나머지 값을 가져오는 연산자
/*
 *  연산자는 형변환 공부가 필요하다. 
 *  산술연산자에서는 /(나누기) 와 %(나머지값) 에 주의가 필요하다.    
 *     1. /에서 0으로 나눌 수 없다.
 *     2. 정수/정수의 경우 정수값으로 나타난다. (정수/정수 = 정수, 정수/실수 = 실수)
 *     3. % 의 경우, 나머지 값이 왼쪽의 부호를 따라간다.
 *        ex) 양수 % 양수(or 음수) = 나머지값 :양수
 *            음수 % 양수(or 음수) = 나머지값 :음수       
 */
public class 이항연산자_산술연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a = 30;
        int b = 4;
        int c = a/b;
        System.out.println("c = "+c);
        
        // 나머지
        int d1 = 5%2;     //1
        int d2 = -5%2;    //-1
        int d3 = -5%-2;   //-1
        int d4 = 5%-2;    //1
        
        System.out.println("d1 = "+d1);
        System.out.println("d2 = "+d2);
        System.out.println("d3 = "+d3);
        System.out.println("d4 = "+d4);
        
        // 345678
        
        int e = 369;
        
        int h100 = e/100;
        int h10 = (e%100)/10;
        int h1 = e%10;
        
        System.out.println("100단위 = "+h100);
        System.out.println("10단위 = "+h10);
        System.out.println("1단위 = "+h1);
        
        //String 계산
        
        String s = 100 + 10.5 + "" + 'a' + 10f + 100L; // "110.5" + 'A' + 10 +100 = "110.5a10.0100"
        System.out.println("합 = "+s);
        
        

        
	}

}
