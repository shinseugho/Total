package 배열1;
//5명의 이름을 입력받아서 저장하고 출력하는 프로그램

import java.util.Scanner;

public class 배열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);		
		
		String [] names = new String[5];
		for(int i=0;i<names.length;i++)
		{
			System.out.println((i+1)+"번째이름 입력 :");
			names[i] = scan.next();
		}
		
		//출력
		for(String name:names)
		{
			System.out.println(name);
		}
		
		//for-each = 배열,집합체
		
		/*
		 * 중요한 for문 배열처럼 묶여있는 경우에만 사용이 가능하다.
		 * 
		 * int[] data={1,2,3,4,5}
		 * for(int i = 0;i<data.length;i++)
		 * {
		 *    System.out.println(data[i])
		 * }
		 * 
		 * for(int i:data)
		 * {
		 *    System.out.println(i)
		 * }
		 */

	}

}
