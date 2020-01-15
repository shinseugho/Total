package 배열1;
/*
 *  정수 5개받거나 랜덤으로 받은 정수를 등수로 출력
 */

public class 배열10_어렵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//난수생성
		int[] score = new int[5];
		int[] copy = new int[5];		
		
		for(int i=0;i<5;i++)
		{
			score[i]=(int)(Math.random()*100)+1;
		}
		
		//비교		
		for(int i=0;i<5;i++)
		{
			copy[i]=1;
			for(int j=0;j<5;j++)
			{
				if(i==j) continue; 
				if(score[i]<score[j])
				{
					copy[i]++;
				}
			}
		}
		
		for (int i=0;i<5;i++)
		{
		System.out.println(score[i]+"("+copy[i]+")");
		}

	}

}
