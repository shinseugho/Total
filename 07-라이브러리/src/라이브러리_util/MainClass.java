package ���̺귯��_util;
/*
 * �÷���
 * ====
 *  �����͸� �޸𸮿� �����ϴ� ���, ǥ��ȭ�� �Ǵ� ����
 *                          ====== �������̽�
 *  ������ �����͸� ���� ��� ����
 *  ���� �迭 => ������ ������ Ŭ������ ����
 *  
 *  *���� : ���� �ٸ� ������ Ÿ���� ����(���������� Ÿ���� �����ϴ� ���� �����ϱ⿡ �����ϴ�.)�� �� �ִ� => ������Ÿ�� ������ �Ѵ� = ���ʴҽ� Ÿ��(<������ Ÿ�� = Ŭ������>)�� ����Ѵ�.                
 */
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����Ʈ ����
		ArrayList list = new ArrayList();
		
		//������ �߰�/����
		list.add("ȫ�浿");
		list.add(30);
		list.add("����");
		list.add("1111-1111");
		list.add(180.5);
		list.add("A");
		
		//������ �з�/�б�
		String name = (String)list.get(0);
		int age = (int)list.get(1);
		String addr = (String)list.get(2);
		String tel = (String)list.get(3);
		double ki = (double)list.get(4);
		String aa = (String)list.get(5);
		
		//������ ���
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("�ּ�: "+addr);
		System.out.println("��ȭ: "+tel);
		System.out.println("Ű: "+ki);
		System.out.println("������: "+aa);

	}

}
