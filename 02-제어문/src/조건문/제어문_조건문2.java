package ���ǹ�;
/*
 *  if ���๮���� ����
 *  
 *    if ( ���ǹ� )
 *        ���๮��1     ==> if �Ҽӹ���
 *        ���๮��2     ==> if �̼Ҽӹ��� / true,false�� ���� ���� ������ ����
 *    
 *    => Java���� ��� ����� {}�� ���� ��� �� ���常 �����Ѵ�.
 *    
 *    
 *    if ( ���ǹ� )
 *    {
 *         ���๮��1
 *    }
 *    ���๮�� 2 
 *    => ������, ����ȭ ( �����丵 ), ���̱׷��̼�( Spring => SpringBoot ) �� ���ؼ� ���ǹ� �ۼ��� �Ҷ� ������ �ʿ��ϴ�.
 *     
 */

import java.util.Scanner;

public class ���_���ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner (System.in) ;
		
		int num=20;		
		//�������� ����
		int b= 100;
		int a = 10;
		
		if (num%2!=0)
		{
			System.out.println("b��"+b+"�Դϴ�.");
	      	System.out.println(num+"��(��) ¦���Դϴ�.");
		    System.out.println("���α׷� ����");
		    b++; //  
		}
		System.out.println(b);
		//System.out.println(b); //b���� {}������ ��������Ƿ� {}�ۿ����� ����� �� ����. = �������� ( {}�ȿ����� ����ϴ� ���� ) 
		
		int c=10;
		
		++c;
		++c;
		++c;
		
		System.out.println("c = "+c); 
		
		int d=10;
		d+=3;
		
		System.out.println("d = "+d);
				
	}

}
