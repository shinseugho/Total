package �������ǹ�;

public class �������ǹ�_����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ����
		int score = (int)(Math.random()*101); //0~100
		System.out.println("score = "+score);
		
		//90 �̻�  A, 80�� �̻� B, 70�� �̻� C, 60�� �̻� D, 60���� F
		
		if (score < 60)
		{
			System.out.println("F�����Դϴ�.");
		}
		else
		{
			// ��øif�� = �������ǹ�
			// if�� �������� ������� ��쿡�� ���Ǹ´� ��� ������ ������ �� �ִ�.
			if (score >= 90 && score <= 100 ) System.out.println("A�����Դϴ�.");
			if (score >= 80 && score < 90)    System.out.println("B�����Դϴ�.");
			if (score >= 70 && score < 80)    System.out.println("C�����Դϴ�.");
			if (score >= 60 && score < 70)    System.out.println("D�����Դϴ�.");
		}
	}

}
