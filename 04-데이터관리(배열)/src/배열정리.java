/*  1. ��� ���(������)
 *     �迭 ==> Ŭ���� ==> ��Ű�� ==> ���̺귯��
 *     ===
 *     
 *     ���α׷�
 *      ������ + ��ɹ�(�޼ҵ�) => Ŭ����
 *      ==================
 *      Ŭ���� ������========>����(=�ڹ�CBD) 
 *      
 *  2. �ڹ� ===> ����Ŭ ===> HTML(CSS,JavaScript) ==> JSP ==> MVC ==> Spring ==> kotlin
 *                       ===============================================��       =======�����
 *                       =============================    ==============
 *                               ����Ʈ�ص尳����                                ��ص尳����    
 *                                                         
 *  3. �迭           : �������� �޸𸮰����̴�.  
 *     �迭�� ���� : ���� ������(�����Ұ�) ==> �������� ���� ���  ==> �������������� ��Ƽ� ���                                      
 *               ����� �޸� ũ�⸦ ����
 *               ==================
 *               1) ����
 *                  int[] arr;
 *                  ===   ===
 *                 �������� �迭��(���� ����� �������� �ּ�)
 *                 
 *               2) �ʱ�ȭ
 *                  arr={1,2,3,4,5}
 *                  arr=new[5]          : �޸𸮰��� �Ҵ���(���� ������ ����)
 *               
 *               3)���� �б�,���� ==> �ε���
 *               
 *                 int[] arr={10,20,30,40,50}
 *                 
 *                 arr          arr[0] arr[1] arr[2] arr[3] arr[4]   =>������ = for�� 
 *                =====        |=================================| 
 *                 100           10  |  20  |  30  |  40  |  50  
 *                =====        |=================================|
 *                            100
 */

// �޷����
import java.util.*;
import java.text.*;
import java.time.Year;
import java.util.Scanner;
/*  �޷�
 *  ===============================
 *   1) ������ ���� �Է¹޾ƾ��Ѵ�.
 *   2) �ش� ���� 1������ ������ �ľ��Ѵ�.
 *   3) ���������� �ľ��Ѵ�.
 *   4) ��Ŀ� ���� ����Ѵ�.
 *  ===============================
 */
public class �迭���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �⵵, �� �Է�
	    char[] strWeek= {'��','��','ȭ','��','��','��','��'};
	    //month�� 0���� ����  ==> month + 1�� �ؾ� 12������ ���´�. 
	    //week�� 1���� ����   ==> week - 1�� �ؾ��Ѵ�.
		Calendar cal = Calendar.getInstance();
	    int y =cal.get(cal.YEAR);
	    int m =cal.get(cal.MONTH)+1;
	    int d =cal.get(cal.DATE);
	    int w =cal.get(cal.DAY_OF_WEEK);
	    System.out.println("============"+y+"�⵵"+m+"��"+d+"��"+strWeek[w-1]+"����============");
	    
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�⵵ �Է� : ");
		int year = scan.nextInt();
		
		System.out.println("�� �Է� : ");
		int month = scan.nextInt();

	    System.out.println(year+"�⵵ "+month+"��");
	    System.out.println("\n");
	    
		/*
		 * System.out.print("��\t"); 
		 * System.out.print("��\t"); 
		 * System.out.print("ȭ\t");
		 * System.out.print("��\t"); 
		 * System.out.print("��\t"); 
		 * System.out.print("��\t");
		 * System.out.print("��\t");
		 */


	    for(int i=0;i<7;i++)
	    {
	    	System.out.print(strWeek[i]+"\t");
	    }
	    
	    // �ش���� 1���� ����
	    // ���⵵ 12��31�ϱ����� ���� ���Ѵ�.
	    int total = (year-1)*365 
	    		    +(year-1)/4
	    		    -(year-1)/100
	    		    +(year-1)/400;
	    // ����
	    int[] lastday={31,28,31,30,31,30,31,31,30,31,30,31};
	    if((year%4==0 && year%100!=0)||(year%400==0)) //2����
	    	lastday[1]=29;
	    else lastday[1]=28;
	    
	    for(int i=0;i<month-1;i++)
	    {
	    	total+=lastday[i];
	    }
	    // +1 ==> %7 ==> ������ ���Ѵ�.
	    total++; //������ 1����
	    int week=total%7;
	    
	    System.out.println();
	    for(int i=1;i<=lastday[month-1];i++)
	    {
	    	if(i==1)
	    	{
	    		for(int j=0;j<week;j++)
	    		{
	    			System.out.print("\t");
	    		}
	    	}
	    	System.out.printf("%2d\t",i);
	    	week++;
	    	if(week>6)
	    	{
	    		week=0;
	    		System.out.println();
	    	}
	    }
	    
	    
	    
	}

}
