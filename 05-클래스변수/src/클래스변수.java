/*               
 *               * ����=>��������=>Ŭ����(����,����+�޼ҵ�,�޼ҵ�)
 *                              =====
 *                              ~VO, ~DTO
 *                              ~Manager, ~Service, ~DAO
 *                              
 *                 ����=>�迭=>����ü=>Ŭ����=>����=>RDBMS(����Ŭ)
 *                 ======================================== �� ��ΰ� �����ͺ��̽��̴�.
 *                 
 * �ڹ�Ŭ���� ���� => ������Ʈ ���̽� 
 *               ��) ��ǻ�ͱ��� : CPU, �޸�, �ϵ��ũ, ����ī�� ... : ��ɺ��� �з��� ������ ������Ʈ ���̽���� �Ѵ�. 
 *               ������� = ���� + �޼ҵ� + ������
 *                       ������ ����� ������ �� = ���Ϻ���((ex)int year), Ŭ����((ex)String name), �迭((ex)int[] year)
 * class ClassName
 * {
 *  ======= Ŭ������ ������ �ִ� ���� ======= �������� (�ٸ� Ŭ�������� ����� ����)
 *     => �޸𸮿� ���� ����Ǵ� ���� (Instance ����) 
 *     => �����ϴ� ����                     (Static ����)   = �޸� ������ �Ѱ� (�� �� ����� ���� ����)
 *  ==================================
 *  ������ �Լ� : ���������� �ʱ�ȭ=>�ѹ��� ȣ��, ��ü�����ɶ� ó������ ȣ��
 *            Ŭ������� ����
 *            ������X
 *            ������, ��Ʈ��ũ, �����ͺ��̽� ...
 *            => ���� �����ڰ� ���� ��쿡�� JVM�� �ڵ����� ����� �ش� (default������)
 *               * void ���� / import / ������ �� ��� JVM�� �ڵ����� �������ش�.
 *  ==================================
 *  �޼ҵ� : ��ɼ���  
 *  ==================================
 * }
 * 
 *  Ŭ������ => MovieVo (��ȭ �����͸� ���� Ŭ����)
 *           MusivVo (���� �����͸� ���� Ŭ����)
 *           
 *           class FoodHouseVO{
 *                 String[] poster;
 *                 String addr,tel ...;
 *                 String[] menu; 
 *                 String[] reply;
 *           �迭�� ������ �� �� �ִٴ� ���� �� �����ؾ��Ѵ�.    
 *           
 *   ��λ� (2019)
 *   ����6.9/10
 *   ���/�׼�
 *   �ѱ�
 *   2019.12.19 ����
 *   128��, 12���̻������
 *   (����) ������, �躴��
 *   (�ֿ�) �̺���, ������, ������, ������, ����
 *   
 *   class MovieVO = ����ڰ� ���� ��������
 *                   int a / double d = �ڹٿ��� �⺻�����Ǵ� ������ũ�Ⱑ �ֱ⿡ new�� �ۼ������ʾƵ� ������ũ�Ⱑ �ڵ������� �Ҵ�ȴ�.  
 *                   MovieVO vo       = �ڹٿ��� �⺻���������ʴ� ������ ũ�Ⱑ ���⿡ new�� �ۼ��ؼ� ������ũ�⸦ �Ҵ�������Ѵ�.
 */

class MovieVO{
	//instance����=> �޸� ������� : new ���� ����(���� �޸� ����)
      String title;
      String score;
      String genre;
      String regdate;
      int time;
      String grade;
      String director;
      String actor;
}

public class Ŭ�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �ҷ����̴� ���
		 * 1. �޸� ���� �� ȣ�� 
		 */
		
		//new�� �ȵ��� null => �޸𸮰��� �Ҵ�, new�� ���ϰ��� int�̴�.
		MovieVO m1=new MovieVO(); 
		m1.title="��λ�(2019)";  // . = �޸��ּ����ٿ�����
	    m1.score="����6.9/10";
	    m1.genre="���/�׼�";
	    m1.regdate="�ѱ�";
		MovieVO m2=new MovieVO();
		m2.title="õ��:�ϴÿ� ���´�(2019)";
		MovieVO m3=new MovieVO();
		m3.title="Ĺ��(2019)";
		
		MovieVO m4=m3;
		m4.title="�õ�(2019)";
		
		System.out.println("m1 : "+m1);
		System.out.println("m2 : "+m2);
		System.out.println("m3 : "+m3);
		System.out.println("m4 : "+m4);
		
		System.out.println("����� ��ȭ ����\n");
		System.out.println(m1.title);
		System.out.println(m1.score);
		System.out.println(m1.genre);
		System.out.println(m1.regdate);
		System.out.println(m2.title);
	//======================================
		System.out.println(m3.title);
		System.out.println(m4.title);
		
		System.out.println("====================================");
		
		MovieVO[] vo={m1,m2,m3,m4};
		for(int i=0;i<vo.length;i++)
		{
			System.out.println(vo[i].title);
			System.out.println(vo[i].score);
			System.out.println(vo[i].genre);
			System.out.println(vo[i].regdate);
		}

	}

}
