package ��ü����_05_���01;
/*  abstract ���δٸ� Ŭ������ �����ؼ� ����� �� ���� ���δ�. (�� ���� Ŭ������ �̿��ؼ� �������� ��)
 *  �������� Ŭ������ ��� �� ���� ��ü�� �����Ѵ�. 
 */
abstract class ����{
	//abstract�� �߻�Ŭ������ ���������ʾƵ�(���� �ǽ�) �ۼ��� �����ϰ� �����.
	abstract void �ȴ´�();
	abstract void �Դ´�();
	/*
	 * void display() { System.out.println("���� ǥ�� !!!"); }
	 */
}

class ��� extends ����{

	@Override
	void �ȴ´�() {
		// TODO Auto-generated method stub
		System.out.println("���ó�� �ȴ´�.");
	}

	@Override
	void �Դ´�() {
		// TODO Auto-generated method stub
		System.out.println("���ó�� �Դ´�.");
	}
	
}

class ���� extends ����{

	@Override
	void �ȴ´�() {
		// TODO Auto-generated method stub
		System.out.println("����ó�� �ȴ´�.");
	}

	@Override
	void �Դ´�() {
		// TODO Auto-generated method stub
		System.out.println("����ó�� �Դ´�.");
	}
	
}

class �� extends ����{

	@Override
	void �ȴ´�() {
		// TODO Auto-generated method stub
		System.out.println("��ó�� �ȴ´�.");
	}

	@Override
	void �Դ´�() {
		// TODO Auto-generated method stub
		System.out.println("��ó�� �Դ´�.");
	}
	
}

public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		���� a = new ���();
		a.�ȴ´�();
		a.�Դ´�();

	    a = new ��();
	    a.�ȴ´�();
		a.�Դ´�();
		
		a = new ����();
	    a.�ȴ´�();
		a.�Դ´�();
	}

}
