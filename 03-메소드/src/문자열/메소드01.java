package 문자열;


import java.util.Scanner;

public class 메소드01 {
	//   +
	static int plus(int a,int b)
	{
		return a+b;
	}
	//   -
	static int minus(int a,int b)
	{
		return a-b;
	}
	//   *
	static int gop(int a,int b)
	{
		return a*b;
	}
	//   /
	static double div(int a,int b)
	{
		return a/(double)b;
	}
	// 계산기
	static void process()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수입력 : ");
		int a = scan.nextInt();
		
		System.out.println("두번째 정수입력 : ");
		int b = scan.nextInt();
		
		System.out.println("연산자(+,-,*,/)입력 : ");
		String op = scan.next();
		
		switch(op)
		{
		case "+":
		{
			int res = plus(a,b);
			System.out.printf("%d%s%d=%d\n",a,op,b,res);
		}
		    break;
		case "-":
		{
			int res = minus(a,b);
			System.out.printf("%d%s%d=%d\n",a,op,b,res);		
		}
	     	break; 
		case "*":
		{	
			int res = gop(a,b);
			System.out.printf("%d%s%d=%d\n",a,op,b,res);
		}
		    break;
		case "/":
		{	
			double res = div(a,b);
			System.out.printf("%d%s%d=%f\n",a,op,b,res);		//d넣으면  오류가 발생한다.
		}
		    break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true)
		{
		    process();
		    System.out.print("y|n 입력:");
		    String ex=scan.next();
		    switch(ex)
		    {
		      case "y":
		    	 System.exit(0);
		    	 break;
		    	
		      case "n":
		    	 break;
		    }
		}
	}

}
