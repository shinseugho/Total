package �����Ϳ���ó��;
// %�� ������ ���� �������� ������
/*
 *  �����ڴ� ����ȯ ���ΰ� �ʿ��ϴ�. 
 *  ��������ڿ����� /(������) �� %(��������) �� ���ǰ� �ʿ��ϴ�.    
 *     1. /���� 0���� ���� �� ����.
 *     2. ����/������ ��� ���������� ��Ÿ����. (����/���� = ����, ����/�Ǽ� = �Ǽ�)
 *     3. % �� ���, ������ ���� ������ ��ȣ�� ���󰣴�.
 *        ex) ��� % ���(or ����) = �������� :���
 *            ���� % ���(or ����) = �������� :����       
 */
public class ���׿�����_���������3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a = 30;
        int b = 4;
        int c = a/b;
        System.out.println("c = "+c);
        
        // ������
        int d1 = 5%2;     //1
        int d2 = -5%2;    //-1
        int d3 = -5%-2;   //-1
        int d4 = 5%-2;    //1
        
        System.out.println("d1 = "+d1);
        System.out.println("d2 = "+d2);
        System.out.println("d3 = "+d3);
        System.out.println("d4 = "+d4);
        
        // 345678
        
        int e = 369;
        
        int h100 = e/100;
        int h10 = (e%100)/10;
        int h1 = e%10;
        
        System.out.println("100���� = "+h100);
        System.out.println("10���� = "+h10);
        System.out.println("1���� = "+h1);
        
        //String ���
        
        String s = 100 + 10.5 + "" + 'a' + 10f + 100L; // "110.5" + 'A' + 10 +100 = "110.5a10.0100"
        System.out.println("�� = "+s);
        
        

        
	}

}
