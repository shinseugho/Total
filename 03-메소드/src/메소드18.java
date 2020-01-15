import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 메소드18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data="버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기 ";
		//문자갯수 => 공백도 포함
		System.out.println("문자의 갯수 : "+data.length());
		/*
		 * System.out.println("버섯 단어의 갯수 : "); int count=0; Pattern p =
		 * Pattern.compile("버섯"); Matcher m=p.matcher(data); while(m.find()) { count++;
		 * } System.out.println(count);
		 */
		// 문장 잘라내기 => subString(0), subString(2,3)
		int n =data.indexOf("!");
		System.out.println(n);
		String fData=data.substring(0,data.indexOf("!"));
		System.out.println(fData);
		String lData=data.substring(data.indexOf("!")+1);
		System.out.println(lData.trim());//trim은 좌우공백문자 제거
		
		//102010.5 출력 = 번호출력시 많이 사용하는 방법 ex)201912231,201912232,201912233 ...
		int a=10;
		int b=20;
		double d=10.5;		
		String sss =a+""+b+""+d;
		System.out.println(sss);
		sss=String.valueOf(a)+String.valueOf(b)+String.valueOf(d); 
		//valueof는 모든 데이터형을 문자로 변경할때 사용한다. 
		//valueof는 스태틱메소드이다. 클래식으로 접근하면 스테틱메소드이다. 변수를 이용하면 인스턴트이다.
		System.out.println(sss);
		
	}

}
