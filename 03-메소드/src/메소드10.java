
import java.util.Scanner;

public class �޼ҵ�10 {
	
	//�Է�
	static int userInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int input = scan.nextInt();
		return input;
	}
	//������ó��
	static int[] toBinary(int input)
	{
		int[] binary=new int[16];
		int index=15;
		while(true)
		{
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			
			index--;
		}
		return binary;
	}
	//���
	static void print(int[] binary)
	{
		for(int i=0;i<16;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
	}
	//����
	static void process()
	{
		int  input = userInput();
		int[] binary = toBinary(input);
		print(binary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
		
	}

}
