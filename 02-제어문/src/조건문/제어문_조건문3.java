package ���ǹ�;
// ���ĺ� => ���� => ��,�ҹ��� ����

public class ���_���ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char alpha = 'a' ;
		
		// ����, �Ⱓ �� &&���
		// char�� ��� ���� ����� ������ȯ(�ڵ�����ȯ)�� �̷������.
		
		if (alpha>='A' && alpha<='Z')
			System.out.println(alpha+"��(��) �빮���Դϴ�.");			
		
		if (alpha>='a' && alpha<='z') // if (!(alpha>='A' && alpha<='Z'))�� ������ �߻��Ѵ�. 
			System.out.println(alpha+"��(��) �ҹ����Դϴ�.");
				
		
		
	}

}
