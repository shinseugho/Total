package ��ü����_02_ĸ��ȭ;
class Data{
	String title;
	static String poster;
	
	//������ �ʱ�ȭ 
	/*
	 * public Data() { title="ȫ�浿��"; poster="hong.png"; }
	 */
	
	{
		title="aaa";
	}
	
	static
	{
		poster="1.png";
	}
	
	/* public Data() 
	 * { 
	 *      title ="bbb"; 
	 *      poster="2.png"; 
	 * }
	 * �����ڰ� �ִٸ� �����ڰ� ���� �������� ����Ǿ� �ҷ�������.
	 */
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Data d1 = new Data();
        System.out.println(d1.title);
        System.out.println(d1.poster);
        
        Data d2 = new Data();
        System.out.println(d2.title);
        System.out.println(d2.poster);
        
        //�������� ��� ���� �����Ͱ� ���� ��� �ε��ð��̳� �ڵ��ð��� ��ٴ� ������ �����. �׷��⿡ ��뷮�� ��� ���(DB)�� ���ϰ� ���ݽ��̶� ���Ѵٸ� ������(�ڵ��ν�)�� ���ϴ�.
	}

}
