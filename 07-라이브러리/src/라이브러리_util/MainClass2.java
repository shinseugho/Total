package 라이브러리_util;
import java.util.*;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		
		//이름목록저장
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		list.add("장영실");
		list.add("성춘향");
		
		//저장갯수
		System.out.println("저장된 이름: "+list);
		System.out.println("저장된 이름의 갯수: "+list.size());
		
		//출력
		for (int i=0;i<list.size();i++)
		{
			String name = (String)list.get(i);
			System.out.println((i+1)+"번째 이름: "+name);
		}
		
		System.out.println("======================");
		
		list.add("강감찬");
		
		//출력
		for (int i=0;i<list.size();i++)
		{
			String name = (String)list.get(i);
			System.out.println((i+1)+"번째 이름: "+name);
		}
		
		System.out.println("======================");
		
		//끼어들기
		list.add(2,"김두한");
		for (int i=0;i<list.size();i++)
		{
			String name = (String)list.get(i);
			System.out.println((i+1)+"번째 이름: "+name);
		}
		
		System.out.println("======================");
		
		//삭제
		list.remove(2);
		for (int i=0;i<list.size();i++)
		{
			String name = (String)list.get(i);
			System.out.println((i+1)+"번째 이름: "+name);
		}
		
		System.out.println("======================");
		
		//수정
		list.set(4,"이순신");
		for (int i=0;i<list.size();i++)
		{
			String name = (String)list.get(i);
			System.out.println((i+1)+"번째 이름: "+name);
		}
		
		System.out.println("======================");
		
		//오류 => 수정시 제네릭스 필요
		list.add(100);
		for (int i=0;i<list.size();i++)
		{
			String name = (String)list.get(i);
			System.out.println((i+1)+"번째 이름: "+name);
		}
	}

}
