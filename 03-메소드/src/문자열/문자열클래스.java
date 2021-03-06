package 문자열;
/* String : 문자열 제어
 *      java.lang : import를 생략할 수 있다.
 *      문자열을 저장하는 방법
 *        1) String 변수명 = "Hello Java";
 *        2) String 변수명 = new String("Hello Java"); // 같은 문자열 
 *                         ===
 *                         새로운 메모리에 저장
 *      String에서 제공하는 기능
 *        1) equals : 저장된 문자열 같은지 여부 확인(true/false)
 *                    ID,PWD ==> 로그인(대소문자 구분)
 *                    문자열은 ==만 사용하지말고 =을 사용하면된다.
 *                    
 *                    ex) String s ="Hello";
 *                        String s1 ="Hello";
 *                        String s2 = new String ("Hello");
 *                        if(s.equals(s1))
 *                         
 *                        => 원형 
 *                           boolean equals(String data) 
 *                                              
 *        2) substring : 문자열을 자를때 사용          
 *                                                   
 *                       substring(int start)
 *                      ex) String s = "0123456789";
 *                          substring(3) => "3456789"; .
 *                          
 *                       substring(int start, int end)
 *                      ex) String s="112분.15세이상관람가"
 *                          substring(0,3) => "112";
 *                                     ===end(:분)-1값(:2)을 출력   
 *                                     
 *        3) length : 문자열 갯수
 *        
 *        4) trim : 좌우의 공백문자 제거시 사용
 *                  사용자 실수        
 *                  
 *                  ex)  String s =" Hello Java "; s.length = 12개
 *                                                 s.trim().length = 10개        
 *        
 *        5) startWith, endsWith :        
 *                                  
 *                                  ex)  startWith("자바")
 *                                       endsWith("자바")
 *        
 *        6) indexOf, lastIndexOf : 문자의 위치를 앞에서부터 찾는지, 뒤에서부터 찾는지 
 *                               
 *                                ex) String s="Hello java"; 
 *                                    s.indexOf('a')      ==> 7번째 a
 *                                    s.lastindexof('a')  ==> 9번째 a
 *        
 *        7) split : 
 *                   ex) String s = "이변헌, 하정우, 마동석, 전혜진, 수지";
 *                       String[] names = s.split(",") 
 *        
 *        8) toUpperCase, toLowerCase : 대문자변환, 소문자변환
 *                                      
 *                                      ex)  String s = "Hello";
 *                                           s.toUpperCase() = HELLO
 *                                           s.toLowerCase() = hello
 *        
 *        9) replace, replaceAll : replace는 해당문자 변환을 하는데 사용
 *                                 replaceAll은 정규식에서 사용           
 *                                 
 *                                 ex) String s = "Hello Java"
 *                                     s.replace('a','b') ==> Hello Jbvb  문자를 전부 변환
 *                                     String s = "113분"
 *                                     s.replaceAll("[^0-9]","") ==> 113 (숫자빼고 다 지워라)
 *                                     s.replaceAll("^[0-9]","")         (숫자로 시작한 것을 다 찾아라)
 *                                     s.replaceAll("[^0-9]$","")        (숫자로 시작해서 숫자로 끝난 것을 다 지워라) 
 *                                     s.replaceAll("[^가-힣]","") ==> 분   (한글빼고 다 지워라)
 *                                     s.replaceAll("[^A-Za-z]","") ==>  (영어빼고 다 지워라)
 *        
 *      10) contains : 포함된 문자를 찾는 경우
 */
import java.util.Scanner;

public class 문자열클래스 {
	
	static String[] autoCompate(String data)
	{
		String[] ss = {
				"자바와 JSP","자바 프로그래밍","스프링 5","Ajax와 JSP","리덕스와 리액트",
				"자바 오라클","MVC 구조","코틀린과 안드로이드","코틀린 프로그램","스프링 데이터",
				"혼자 배우는 자바","지능형웹 프로그램","웹 프로그램","자바 웹프로그램","오라클 자바"
		};
		String[] findData=new String[10];
		int j=0;
		for(int i=0;i<ss.length;i++)
		{
			//if(ss[i].startsWith(data))
			if(ss[i].contains(data))
			{
				findData[j]=ss[i];
				j++;
			}
		}
		return findData;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어 입력 : ");
		String data = scan.next();
		
		String[] fd=autoCompate(data);
		for(int i=0;i<fd.length;i++)
		{
			if(fd[i]!=null)
			{
				System.out.println(fd[i]);
			}
		}

	}

}
