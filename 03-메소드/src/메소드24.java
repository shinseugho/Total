/* year�� �Է��� �޾Ƽ� ���⿩�� Ȯ��
 * 
 * 1. �Էº� static int year()
 * 2. �Ǵܺ� static boolean year() 
 * 3. ��º� static void print(int year, boolean year) 
 * 4. ���պ� static void process()
 */

import java.util.Scanner;

public class �޼ҵ�24 {

	//1�����
	static void isYear(int year)
	{
		if((year%4==0 && year%100!=0) || (year%400==0))
           System.out.println(year+"�⵵�� ����Դϴ�.");
		else 
		   System.out.println(year+"�⵵�� ������ �ƴմϴ�.");
	}
	
	//2�����
	static boolean isYear2(int year)
	{
		if((year%4==0 && year%100!=0) || (year%400==0))
           return true;
		else 
		   return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=2019;
		
		//1�����
		isYear(year);
		
		//2�����
		boolean bCheck=isYear2(year);
		if(bCheck) System.out.println(year+"�⵵�� �����Դϴ�.");
		else       System.out.println(year+"�⵵�� ������ �ƴմϴ�.");
		
	}

}
