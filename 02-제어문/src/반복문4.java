// 100~999 ���� �� 7�ǹ������

public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int   i=100;
		int   a7=0,a4=0;
		while(i<=999)
		{
			if( i%7==0 )//7�� ���
			a7++;
			if( i%4!=0 )
			a4++;
	
			i++;
		}
		System.out.println("7�� ��� ���� : "+a7);
		System.out.println("4�� ������ƴ� ���� : "+a4);
	}

}
