package ��ü����_03_������;

public class Member {
	
	private String id;
	private String pwd;
	
	//������ �ʱ�ȭ
	public Member() {	
		id="hong";
		pwd="1234";
	}
	
	//�Ű������� ���� ������
	public Member(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	//�����ڰ� 2���� �����ε�

	public void print()
	{
		System.out.println("ID: "+id);
		System.out.println("Password: "+pwd);
	}
	
	
}
