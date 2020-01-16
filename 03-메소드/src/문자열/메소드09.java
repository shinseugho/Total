package 문자열;


import java.util.Scanner;

public class 메소드09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//변수
		int input=0; //사용자 입력값
		System.out.println("정수 입력 : ");
		input = scan.nextInt();
		//System.out.println(Integer.toBinaryString(input));
		int[] binary=new int[16];
		//배열의 위치
		int index=15; //배열 => 값을변경 => 위치(뒤(length-1),앞(0))
		while(true)
		{
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			
			index--;
		}
		
		//출력
		for(int i=0;i<16;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
		
	}

}
