package 라이브러리_util;
/*
 * 컬렉션
 * ====
 *  데이터를 메모리에 저장하는 방법, 표준화가 되는 상태
 *                          ====== 인터페이스
 *  여러개 데이터를 쉽게 제어가 가능
 *  가변 배열 => 데이터 갯수를 클래스에 제어
 *  
 *  *단점 : 서로 다른 데이터 타입을 저장(같은데이터 타입을 저장하는 것이 제어하기에 용이하다.)할 수 있다 => 데이터타입 통일을 한다 = 제너닐스 타입(<데이터 타입 = 클래스명>)을 사용한다.                
 */
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//리스트 제작
		ArrayList list = new ArrayList();
		
		//데이터 추가/저장
		list.add("홍길동");
		list.add(30);
		list.add("서울");
		list.add("1111-1111");
		list.add(180.5);
		list.add("A");
		
		//데이터 분류/읽기
		String name = (String)list.get(0);
		int age = (int)list.get(1);
		String addr = (String)list.get(2);
		String tel = (String)list.get(3);
		double ki = (double)list.get(4);
		String aa = (String)list.get(5);
		
		//데이터 출력
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("주소: "+addr);
		System.out.println("전화: "+tel);
		System.out.println("키: "+ki);
		System.out.println("혈액형: "+aa);

	}

}
