/*   ����
 *      = instance ���� : ����   (new�޸� ��������)
 *      = static ����     : ������(�޼ҵ峻 ���Ұ���)
 *      ==================================== �ڵ� �ʱ�ȭ�� �ȴ�. 
 *      = �������� (�޼ҵ�ȣ�����)
 *      ==================================== �ݵ�� �ʱ�ȭ�� �Ѵ�.
 */
class Data{
	//���� ���� (����=>����ó��,���,�޼ҵ�ȣ��) => {}
	int a;
	float f;
	double d;
	boolean boo=true;//false
	long l;
	char c='A'; //'\0'
	String s="BOOM!"; //null = �ּҰ��� ���� ����
	String ss="";
	static int aa; //0
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Data.aa);
		
		Data dd=new Data(); 
		System.out.println(dd.a); 
		System.out.println(dd.boo);
		System.out.println(dd.c); 
		System.out.println(dd.d); 
		System.out.println(dd.f);
		System.out.println(dd.l); 
		System.out.println(dd.s);
		System.out.println(dd.ss);
		 
	}

}
