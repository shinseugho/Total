package �����Ϳ���ó��;
/*
 *  String : ���ڿ� ���� , ������ 4byte ũ���̴�.(�ּҸ� ����Ǳ⶧���̴�.)  
 *  ======
 *  ��� 
 *   1) ���ڿ��� �и�                                    substring()
 *   2) ���� ã��                                         indexOf(), lastIndexOf()
 *   3) ���� ��                                         equals() : ��ҹ��ڱ����� , equalsIgnoreCase() : ��ҹ��ڱ��о���
 *   4) ���鹮�� ����                                    trim() 
 *   5) ��ҹ��� ����                                    toUpperCase(), toLowerCase() 
 *   6) ��� ���������� ���������� ����              valueOf()
 *   7) ������ ����                                      length()    
 *   8) ����                                               replace(),replaceAll()
 */
public class ���ڿ�����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=" Hello Java!! " ; 
		System.out.println("���ڼ� : "+s.length());
		System.out.println(s.substring(0,5)); //5�� (���ϴ� ������ ���� �ڸ�) �� �Է��ؾ� 5(���ϴ� ���� ����)�� �����ϰ� 4( 5 - 1 = 4, ���ϴ� ���ڱ���) �������� �ҷ��´�.
		System.out.println(s.replace("l","k"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println(s.trim());
		
		System.out.println(s.indexOf("l"));
		System.out.println(s.lastIndexOf("l"));
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		String res = s1.equals(s2)?"����":"�ٸ���" ;
		System.out.println(res);
		
	}

}
