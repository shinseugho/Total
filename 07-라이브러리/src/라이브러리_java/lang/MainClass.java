package ���̺귯��_java.lang;
class My
{

	public My() {
		System.out.println("My ������ �Լ� ȣ��(��ü ����)");
	}
	public void display() {
		System.out.println("My:display() Call ...");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("��ü �Ҹ�");
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����
		My m = new My();
		//Ȱ��
		m.display();
		//�Ҹ�
		m=null;
		//�޸� �Ҹ�
		System.gc();

	}

}
