package ��ü����_03_������;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sawon s1 = new Sawon();
		s1.setSabun(1);
		s1.setName("ȫ�浿");
		s1.setDept("���ߺ�");
		s1.setLoc("����");
		s1.setPay(3500);
		
		System.out.println("���: "+s1.getSabun());
		System.out.println("�̸�: "+s1.getName());
		System.out.println("�μ�: "+s1.getDept());
		System.out.println("����: "+s1.getLoc());
		System.out.println("����: "+s1.getPay());
		
		/*
		 * s1=null; System.gc();
		 */
		
		System.out.println("\n");
		
		Sawon s2 = new Sawon();
		s2.setSabun(2);
		s2.setName("�ɺ���");
		s2.setDept("�繫��");
		s2.setLoc("�ܾ�");
		s2.setPay(8000);
		
		System.out.println("���: "+s2.getSabun());
		System.out.println("�̸�: "+s2.getName());
		System.out.println("�μ�: "+s2.getDept());
		System.out.println("����: "+s2.getLoc());
		System.out.println("����: "+s2.getPay());
		
	}

}
