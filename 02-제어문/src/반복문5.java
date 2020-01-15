/* 작성된 문장에서 문자를 불러올 경우, charAt(0)
 */

public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "adgasdafnjkankavkavb";   // 특정문자열에서 특정 알파벳갯수 세기
	
	System.out.println("s = "+s);
			
	int i=0;
	int count=0;
	
	//System.out.println(s.length());
	while(i<=s.length()) // length를 쓰면 문자의 갯수를 가져온다. length-1 이나 <=에서 =을 빼주면 된다.
	{
		System.out.println((i+1)+"번째 문자 : " +s.charAt(i));
		char c=s.charAt(i);
		if(c=='a'||c=='A') count++;	
		i++;
	}
	
	System.out.println("A(a)의 수는 " +count+"개입니다.");
	
	}

}
