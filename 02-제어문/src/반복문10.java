/*
 *      �ݺ���
 *      =========== ������
 *      
 *      for    �ݺ�Ƚ�� ������ �ִ� ���
 *      while  �ݺ�Ƚ�� ������ ���� ���
 *      
 *      ex) �ʱⰪ
 *          while ( ���ǹ� )
 *          {
 *                ���๮��
 *                ������
 *          } 
 *      =========== ������
 *      
 *      do ~ while �ѹ� �̻��� �ݵ�� ����
 *      
 *      ex) �ʱⰪ
 *          do
 *          {
 *               ���๮��
 *               ������
 *          }while ( ���ǹ� )     
 */

public class �ݺ���10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1���� 10���� ����
		 * 
		 * int i=1;
		 * 
		 * while (i<=10) { System.out.println("i="+i); i++; }
		 */

		/*
		 * 
		 * 
		 * String[] s = {"a","b","c","d","e","f","g","h","i","k"} ; int []ss =
		 * {3,4,6,7,8,9,10,11,4,5} ; int i = 0; while (i<=10) {
		 * System.out.println(s[i]+"-"+ss[i]) ; i++; }
		 */
		
		//1-2-3-4-2-3-4-...�ϴٰ� 2�� false�Ǹ� ����
		/*
		 * int i=1 ; //1 int sum3 = 0, sum5 = 0, sum7 = 0 ; while (i<=100) //2 {
		 * if(i%3==0) sum3+=i ; if(i%5==0) sum5+=i ; if(i%7==0) sum7+=i ; i++; }
		 * 
		 * System.out.println("3�ǹ�� �� : "+sum3); System.out.println("5�ǹ�� �� : "+sum5);
		 * System.out.println("7�ǹ�� �� : "+sum7); //1~100 (����) 3,5,7�� ������� ��
		 */		
		//'A~Z'���� ���
		
		char c = 'A' ;
		while (c<='Z') 			
		{
			System.out.print(c+" ");
			c++;
		}
		
	}

}
