package ���̺귯��_util;
import java.util.*;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		
		//�̸��������
		list.add("ȫ�浿");
		list.add("��û��");
		list.add("�ڹ���");
		list.add("�念��");
		list.add("������");
		
		//���尹��
		System.out.println("����� �̸�: "+list);
		System.out.println("����� �̸��� ����: "+list.size());
		
		//���
		for (int i=0;i<list.size();i++)
		{
			String name = (String)list.get(i);
			System.out.println((i+1)+"��° �̸�: "+name);
		}
		
		System.out.println("======================");
		
		list.add("������");
		
		//���
		for (int i=0;i<list.size();i++)
		{
			String name = (String)list.get(i);
			System.out.println((i+1)+"��° �̸�: "+name);
		}
		
		System.out.println("======================");
		
		//������
		list.add(2,"�����");
		for (int i=0;i<list.size();i++)
		{
			String name = (String)list.get(i);
			System.out.println((i+1)+"��° �̸�: "+name);
		}
		
		System.out.println("======================");
		
		//����
		list.remove(2);
		for (int i=0;i<list.size();i++)
		{
			String name = (String)list.get(i);
			System.out.println((i+1)+"��° �̸�: "+name);
		}
		
		System.out.println("======================");
		
		//����
		list.set(4,"�̼���");
		for (int i=0;i<list.size();i++)
		{
			String name = (String)list.get(i);
			System.out.println((i+1)+"��° �̸�: "+name);
		}
		
		System.out.println("======================");
		
		//���� => ������ ���׸��� �ʿ�
		list.add(100);
		for (int i=0;i<list.size();i++)
		{
			String name = (String)list.get(i);
			System.out.println((i+1)+"��° �̸�: "+name);
		}
	}

}
