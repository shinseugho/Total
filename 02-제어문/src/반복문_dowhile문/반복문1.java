package �ݺ���_dowhile��;
/*
 *     do ~ while  : �ѹ� �̻��� �����ϴ� �ݺ��� ( ���󵵴� �����ʴ�. if, while, for���� �߿��ϴ�.)
 *     
 *     ����) 
 *           �����ͺ��̽� : ��
 *           ��Ʈ��ũ      : ����Ʈ��
 *           
 *           �ʱⰪ
 *           do{
 *           
 *            ���๮��(�������� ��밡��)
 *            ������
 *            i++( or i+=3�̳� i--�� �� ����)      
 *           
 *           }while(���ǹ�);
 *           
 */

public class �ݺ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 10 ���� ����
		int i = 1 ;
		do {
			System.out.println("i="+i);
			i++;
		}while(i<=10);
		
		System.out.println("10~1");

		do  //�ʱ�ȭ���� 1���� ����
		{
			System.out.println("i="+(i-1));
			i--;
		}while(i>1);

	}

}
