package �����Ϳ���ó��;

public class ����������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *      �ڹٿ��� �����ϴ� Ư������
 *      1) \n ( : newLine) ������ ��� ���
 *      2) \t ( : tab )    ���� ����
 *      3) \" ( :  )       "(���ǥ) ��¸��    ex) System.out.println( "\"Hello Java!!\"")
 *      
 *      ������� 
 *        ex1)  ȫ�浿 System.out.println( "ȫ�浿");
 *              ��û�� System.out.println( "��û��");
 *              �ڹ��� System.out.println( "�ڹ���");
 *        ex2)  ȫ�浿 ��û�� �ڹ���
 *              ȫ�浿 System.out.print( "ȫ�浿\t");
 *              ��û�� System.out.print( "��û�� \t");
 *              �ڹ��� System.out.print( "�ڹ���\n");
 *       %������ �ִ� ��� (JDK 1.5�̻� ����)
 *        
 *        1)   %d => ����           System.out.printf("�������� : %5d%5d%5d",100,90,60);   5d �� �Է�ĭ�� 5ĭ ����϶�� �ǹ��̴�.   -5d�� �������� 5d�� ������ ����
 *        2)   %f => �Ǽ�           System.out.printf();
 *        3)   %c => ����           System.out.printf();
 *        4)   %s => ���ڿ�        System.out.printf();
 *          
 *              System.out.printf(); 
 *              
 *              �̸�       ����     ����     ����     ����
 *              ȫ�浿     90    90    90   270
 *              
 *              
 */ 
	
		System.out.printf("%-5d%-5d%-5d%-5d\n",100,90,60,70);
		
		System.out.printf("%-10.2f%-10.2f%-10.2f\n",99.9999,80.88,60.6666666);  // %-10.2f�� 10ĭ�� ���� �Ҽ����� 2ĭ�� ���.
		
		System.out.printf("%2c%2c%2c\n",'A','B','C');
		
		System.out.printf("%10s%10s%10s\n","Hello","Java","!!");
		
		System.out.printf("%7s%5d%5d%5d%7.2f%c\n","ȫ�浿",100,90,80,80.000,'A'); // ��� ����� �� �ִ�.
		
	}

}
