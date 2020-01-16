package ��ü����_01_������;
 import sun.applet.Main;

/*   Ŭ������ �������
 *   ==========================================================================
 *   ����(��������, �������)
 *   => �ٸ� Ŭ�������� ��밡��
 *   => �޸𸮿��� �����Ǵ� ������ ���α׷� �������
 *      (�޸� ��������� heap���� = �ֹ߼� �޸𸮿���)
 *   ==========================================================================
 *   ������ : ��������� ���� �ʱ�ȭ ���
 *   Ư¡) 1. Ŭ������� �����ϰ� �ۼ� 
 *        2. �������� ���� (void�� �������̴�)
 *        3. �����ڴ� �������� ���� �� �ְ� ������� ���� �� �ִ�
 *        4. �����ε��� �����Ѵ�
 *           1) �Ѱ��� Ŭ���� �ȿ��� ���� �̸��� �޼ҵ带 ���� �� ���
 *           2) �Ű������� �ٸ��� (�Ű������� �������� Ȥ�� ������ �ٸ��� �ٸ� �޼ҵ�� �ν��Ѵ�.)
 *           3) �������� �������
 *              void display()
 *              int display()    
 *              ���� ���� ���� �޼ҵ��̴�.
 *           4) ����� ����
 *        5. ��� ���� �����̴�. (static�� �����ڴ� ��� ���� �����̴�.)   
 *   ������ ���α׷�, �ڵ��α��� ���� ��ɹ� �������� ���ȴ�. (������ Ȥ�� �޼ҵ�)
 *   �ָ޴� : Ŭ����
 *   �θ޴� : �޼ҵ�
 *   ���γ��� : ����
 *   ==========================================================================
 *   ==> ��ɹ��� ���� ==> ���õ� ����� ��Ƽ� ó�� (������ ���α׷�)
 *   �޼ҵ� : ��������� Ȱ�� => ���
 *          ���� ó�� + ��� ó�� => �޼ҵ�� ����� ��û�� ó���ϴ� ����� ����Ѵ�.
 *   ==========================================================================  
 *   
 */

public class MainClass {

	String name;
	String sex;
	int age;

	// �ʱ�ȭ==> MainClass mc = new MainClass()
	/*
	 * public MainClass() {
	 * 
	 * // �ʱ�ȭ ==-> ������, ��Ʈ��ũ, �����ͺ��̽� 
	 * name = "��û��"; 
	 * sex = "����"; 
	 * age = 25;
	 * 
	 * }
	 */
	
	//�Ű������� ���� ������
	public MainClass(String name, String sex, int age) {
		
		/*�������� �����Ҷ� ��������(Ȳ���)�� �켱������ �־� �������(Ŭ������ ����,�Ķ���)�� �������� ���ߴ�. 
		 *               => �տ� this.�� �ٿ��ָ� ���������� �Ű��������� �����Ҷ� ������ ���Ͽ� ����Ѵ�.
		 *               this ������ static�����̴�.
		 */
		System.out.println("this= "+this);
		this.name = name;
		this.sex = sex;
		this.age = age;
		/*  �ڽ��� ��ü�ּ� => this => �ݵ�� �޼ҵ� �ȿ����� ����� �����ϴ�.
		 *  ���⼭ this�� ����ϸ� ������ �߻��Ѵ�.
		 */ 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* MainClass mc = new MainClass(); 
		 * static�� �ƴ� ������ ��������� ������ ���� �����ؾ� �Ѵ� (new)
		 * �����ڴ� ȣ��ÿ� �տ� �ݵ�� new�� �ٿ����Ѵ�.
		 * 
		 * System.out.println(mc.name); 
		 * System.out.println(mc.sex);
		 * System.out.println(mc.age);
		 */
		
		MainClass mc1 = new MainClass("�̼���","����",30); 
		System.out.println("mc1= "+mc1);
		System.out.println(mc1.name);
		System.out.println(mc1.sex);
		System.out.println(mc1.age);
		
		System.out.println("\n");
		
		MainClass mc2 = new MainClass("��û��","����",20); 
		System.out.println("mc1= "+mc2);
		System.out.println(mc2.name);
		System.out.println(mc2.sex);
		System.out.println(mc2.age);
		
		System.out.println("\n");
		
		MainClass mc3 = new MainClass("������","����",35);
		System.out.println("mc1= "+mc3);
		System.out.println(mc3.name);
		System.out.println(mc3.sex);
		System.out.println(mc3.age);
		
		System.out.println("\n");
		
		System.out.println(new MainClass("�ڹ���", "����", 10).name);
		System.out.println(new MainClass("�ڹ���", "����", 10).sex);
		System.out.println(new MainClass("�ڹ���", "����", 10).age);
		
	}

}
