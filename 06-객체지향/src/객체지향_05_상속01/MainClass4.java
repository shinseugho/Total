package ��ü����_05_���01;
class ���� {
	public void draw() {
		System.out.println("������ �׸���");
	}
}

class ���� extends ����{
	public void draw() {
		System.out.println("������ �׸���");
	}
}

class �ﰢ�� extends ����{
	public void draw() {
		System.out.println("�ﰢ���� �׸���");
	}
}

class �簢�� extends ����{
	public void draw() {
		System.out.println("�簢���� �׸���");
	}
}

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���� m = new �簢��();
		m.draw();
		
		m = new �ﰢ��();
		m.draw();
	}

}
