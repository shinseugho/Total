package ����������;
/*
 * �̸�, ����, ����, ���� ������ ������ ��
 * �̸�, ����, ����, ����, ����, ��� �� ����϶�. 
 */
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*
  *  �̸� = name
  *  ���� = kor
  *  ���� = eng
  *  ���� = math       
  */
		
	String name = "ȫ�浿";   	
	int kor = 83;
	int eng = 83;
	int math = 83;
			
	
	
	System.out.println("�̸�:"+name);
	System.out.println("����:"+kor);
	System.out.println("����:"+eng);
	System.out.println("����:"+math);
	System.out.println("����:"+(kor+eng+math));
	System.out.printf("���:%.2f",(kor+eng+math)/3.0);
	
	
	// ���������� 3.0(�Ǽ�) �� 3 (����) ���� �Է��ϸ� ������� ������ ǥ�õȴ�.
	// System.out.printf("���:%.2f",(kor+eng+math)/3.0); %.2f �� �Ҽ��������ڸ���(2�ڸ�)�� ��Ÿ����. 
	// System.out.print �� ���� ������ �ٿ��� ����Ѵ�.(�������)
	// System.out.prinln �� ���� �Ʒ��� ���ٿ��� ����Ѵ�.(�������)
	
	}

}
