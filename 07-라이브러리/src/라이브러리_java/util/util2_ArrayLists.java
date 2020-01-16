package 라이브러리_java.util;
import java.util.*;

public class util2_ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//제네릭스
		List<String> list = new ArrayList<String>();
		//List<String> list = new Vector<String>();
		//List<String> list = new LinkedList<String>();
		//interface = 구현 클래스
		//String[] list
		//저장(add)
		list.add("홍길동");//0
		list.add("심청이");//1 -> 2 -> 이순신
		list.add("박문수");//2 -> 3
		
		//중간저장
		list.add(1,"춘향이");//1
		
		//출력
		//for-each 문은 배열, 컬렉션에서만 사용가능
		int i=0;
		for(String name:list)
		{
			System.out.println(name+":"+i);
			i++;
		}
		
		//수정
		list.set(2, "이순신");
		System.out.println("=========");
		i=0;
		for(String name:list)
		{
			System.out.println(name+":"+i);
			i++;
		}
		
		//삭제
		list.remove(1);
		System.out.println("=========");
		i=0;
		for(String name:list)
		{
			System.out.println(name+":"+i);
			i++;
		}
		
		//데이터저장갯수
		System.out.println("저장갯수: "+list.size());

	}

}
