package 라이브러리_java.util;
import java.util.*;

/*    Map = 키와 값이 입력된다.
 *   키 = 중복이 없다
 *   값 = 중복이 가능하다.
 *   ===저장          (put(키, 값))
 *      저장된 값   (get(키))
 *   Map(interface)
 *   ===============
 *   구현한 클래스
 *   Hashtable
 *   HashMap(: Hashtable을 보완한 클래스)   
 */

//진도 놓침 
//강사님 자료 참고

class A implements I
{
	
	System.out.println("A:display Call..."));
	
}
class B implements I
{
	
	System.out.println("B:display Call...");
	
}
class C implements I
{
	
	System.out.println("C:display Call...");
	
}

public class util2_Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기본예제
		/*
		 * Map map=new HashMap(); 
		 * map.put("ID","admin"); 
		 * map.put("pwd","1234");
		 * 
		 * System.out.println("ID: "+map.get("ID"));
		 * System.out.println("Password: "+map.get("pwd"));
		 */
		
		Map map = new HashMap();
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
		
		I i =(I)map.get("a");
		
		i.display();
		
	    i =(I)map.get("b");
		
		i.display();
		
		i =(I)map.get("b");
		
		i.display();
	}

}
