// 100~999 까지 중 7의배수숫자

public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int   i=100;
		int   a7=0,a4=0;
		while(i<=999)
		{
			if( i%7==0 )//7의 배수
			a7++;
			if( i%4!=0 )
			a4++;
	
			i++;
		}
		System.out.println("7의 배수 갯수 : "+a7);
		System.out.println("4의 배수가아닌 갯수 : "+a4);
	}

}
