package ���ڿ�;


import java.util.Scanner;

public class �޼ҵ�09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//����
		int input=0; //����� �Է°�
		System.out.println("���� �Է� : ");
		input = scan.nextInt();
		//System.out.println(Integer.toBinaryString(input));
		int[] binary=new int[16];
		//�迭�� ��ġ
		int index=15; //�迭 => �������� => ��ġ(��(length-1),��(0))
		while(true)
		{
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			
			index--;
		}
		
		//���
		for(int i=0;i<16;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
		
	}

}
