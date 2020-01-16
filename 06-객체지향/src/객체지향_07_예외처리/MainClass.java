package 객체지향_07_예외처리;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[6];
		
		try {
			for(int i = 0; i <= 6; i++)
			{
				arr[i] = (int)(Math.random()*45)+1;
			}
		} catch(Exception e) {
					
			System.out.println("오류발생");
			
		}
	
		for (int i = 0; i <= 5; i++ )
		{
			System.out.print(arr[i]+"  ");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
