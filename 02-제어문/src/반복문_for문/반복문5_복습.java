package �ݺ���_for��;

public class �ݺ���5_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int even = 0;
		int odd= 0;
		
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			if(i%2==0) even+=i;
			else       odd+=i;
		}
		
		System.out.println("��      �� : "+sum);
		System.out.println("¦���� �� : "+even);
		System.out.println("Ȧ���� �� : "+odd);

	}

}
