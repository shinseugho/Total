package �ݺ���_����for��;
/*
 * break, continue ���
 * 
 * break    �ݺ��� �ߴ��� ��
 * ex) 
 * for(int i=1;i<=10;i++)
 * {
 *     if (i==5) 
 *     break;
 *     System.out.println(i);
 * }
 * ===> 1~4������ ����Ѵ�.
 * 
 * continue Ư�� �κ��� ������ ��
 * for(int i=1;i<=10;i++)
 * {
 *     if (i==5) 
 *     continue;
 *     System.out.println(i);
 * }
 * ===>5�������� �������� ����Ѵ�.
 */

public class ���߹ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5�� 7�� �����ϰ� ���
		  for(int i=1;i<=10;i++)
		 {
			  if (i==5 || i==7) 
			  continue;
			  System.out.println(i);
		 }
		  
		  System.out.println("====");
		  
	    //¦�����
		  for(int i=1;i<=10;i++)
		 {
			  if (i%2!=0) 
			  continue;
			  System.out.println(i);
		 }
		  
		  System.out.println("====");
		  
		 //Ȧ�����
		  for(int i=1;i<=10;i++)
		 {
			  if (i%2==0) 
			  continue;
			  System.out.println(i);
		 }
		  
		  System.out.println("====");
		  
	}

}
