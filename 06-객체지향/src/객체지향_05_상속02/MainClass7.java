package ��ü����_05_���02;
/*     interface�� �߻�޼ҵ� �� �ϳ���. ��� �޼ҵ忡 ������ ����.
 *     �޼ҵ�� �Ϲݸ޼ҵ� / static / abstract�� ������.
 */
interface Ani{
	void working();
	void eating();
}

class Human implements Ani{

	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println("�� �߷� �ȴ´�");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("������ �Դ´�");
	}
	
}

public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ani ani = new Human();
		ani.working();
		ani.eating();
		
	}

}
