package ���̺귯��_java.util;
import java.util.*;

public class util2_ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���׸���
		List<String> list = new ArrayList<String>();
		//List<String> list = new Vector<String>();
		//List<String> list = new LinkedList<String>();
		//interface = ���� Ŭ����
		//String[] list
		//����(add)
		list.add("ȫ�浿");//0
		list.add("��û��");//1 -> 2 -> �̼���
		list.add("�ڹ���");//2 -> 3
		
		//�߰�����
		list.add(1,"������");//1
		
		//���
		//for-each ���� �迭, �÷��ǿ����� ��밡��
		int i=0;
		for(String name:list)
		{
			System.out.println(name+":"+i);
			i++;
		}
		
		//����
		list.set(2, "�̼���");
		System.out.println("=========");
		i=0;
		for(String name:list)
		{
			System.out.println(name+":"+i);
			i++;
		}
		
		//����
		list.remove(1);
		System.out.println("=========");
		i=0;
		for(String name:list)
		{
			System.out.println(name+":"+i);
			i++;
		}
		
		//���������尹��
		System.out.println("���尹��: "+list.size());

	}

}
