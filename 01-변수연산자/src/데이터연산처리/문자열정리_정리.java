package 데이터연산처리;
/*
 *  String : 문자열 저장 , 무조건 4byte 크기이다.(주소만 저장되기때문이다.)  
 *  ======
 *  기능 
 *   1) 문자열을 분리                                    substring()
 *   2) 문자 찾기                                         indexOf(), lastIndexOf()
 *   3) 문자 비교                                         equals() : 대소문자구분함 , equalsIgnoreCase() : 대소문자구분안함
 *   4) 공백문자 제거                                    trim() 
 *   5) 대소문자 변경                                    toUpperCase(), toLowerCase() 
 *   6) 모든 데이터형을 문자형으로 변경              valueOf()
 *   7) 문자의 갯수                                      length()    
 *   8) 변경                                               replace(),replaceAll()
 */
public class 문자열정리_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=" Hello Java!! " ; 
		System.out.println("글자수 : "+s.length());
		System.out.println(s.substring(0,5)); //5번 (원하는 문자의 다음 자리) 를 입력해야 5(원하는 문자 다음)를 제외하고 4( 5 - 1 = 4, 원하는 문자까지) 번까지를 불러온다.
		System.out.println(s.replace("l","k"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println(s.trim());
		
		System.out.println(s.indexOf("l"));
		System.out.println(s.lastIndexOf("l"));
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		String res = s1.equals(s2)?"같다":"다르다" ;
		System.out.println(res);
		
	}

}
