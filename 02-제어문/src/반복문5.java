/* �ۼ��� ���忡�� ���ڸ� �ҷ��� ���, charAt(0)
 */

public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "adgasdafnjkankavkavb";   // Ư�����ڿ����� Ư�� ���ĺ����� ����
	
	System.out.println("s = "+s);
			
	int i=0;
	int count=0;
	
	//System.out.println(s.length());
	while(i<=s.length()) // length�� ���� ������ ������ �����´�. length-1 �̳� <=���� =�� ���ָ� �ȴ�.
	{
		System.out.println((i+1)+"��° ���� : " +s.charAt(i));
		char c=s.charAt(i);
		if(c=='a'||c=='A') count++;	
		i++;
	}
	
	System.out.println("A(a)�� ���� " +count+"���Դϴ�.");
	
	}

}
