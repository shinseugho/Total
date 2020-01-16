package ���̺귯��_java.util;
import java.util.*;

/*    Map = Ű�� ���� �Էµȴ�.
 *   Ű = �ߺ��� ����
 *   �� = �ߺ��� �����ϴ�.
 *   ===����          (put(Ű, ��))
 *      ����� ��   (get(Ű))
 *   Map(interface)
 *   ===============
 *   ������ Ŭ����
 *   Hashtable
 *   HashMap(: Hashtable�� ������ Ŭ����)   
 */

//���� ��ħ 
//����� �ڷ� ����

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
		
		//�⺻����
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
