/*
 *   �ڹ� (Ŭ������ ������) => ������, ���� �����ۼ��ؼ� ���
 *   �� ���� ���Ͽ��� ���
 *   
 *   ===============
 *   class A
 *   class C
 *   class D
 *   public class B
 *   =============== B.java (public Ŭ������ �Ѱ��� ����)
 *   class A
 *   class B
 *   =============== 
 */

//News ��������
class News{
	String title;
	String content;
	String author;
	String regdate;
	
	/* static String site;
	 * class ������ ���� �����ϴ�.
	 */  
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new�� ����� ��쿡 ���ε��� �����Ǵ� ������ instance������� �Ѵ�.
		
		  News n1=new News(); 
		  n1.title="'��ġ���ʾ�' ����ȫ�����Ҷ�, 'TV ��������' �����̼� ���� ���"; 
		  n1.content="[������������ Ȳ���� ����] ��ȭ '��ġ���ʾ�'(���� �����)�� ����ȫ, ���Ҷ� SBS 'TV ��������'���� ����� �����̼����� ��û�ڵ��� ������."; 
		  n1.author="������������"; 
		  n1.regdate="19.12.27";
		  
		  News n2=new News(); 
		  n2.title="�̺��� '������ �����', ���� ½ �������� �ѡ��̡��� ��Ը� ����"; 
		  n2.content="��ȭ '������ �����'(���� ���ȣ)�� �ѱ�, �̱�, ������ 3������ ������ 1979���� ǳ���� ������ ��Ƴ� �ü��� �����´�."; 
		  n2.author="��Ÿ����"; 
		  n2.regdate="19.12.27";
		  
		  System.out.println(n1.title); 
		  System.out.println(n2.title);
		 
	}

}
