package 문자열;

public class 메소드12 {

	static int[] getRand()
	{
		int[] com=new int[6];
		
		int su=0;
		
		boolean bCheck = false;
		for(int i=0;i<6;i++)
		{
			bCheck = true;
			while(bCheck)
			{
			      su=(int)(Math.random()*45)+1;
			      bCheck=false;
			      for(int j=0;j<i;j++)
			      {
			    	    if(com[j]==su)
			    	    {
			    	    	bCheck=true;
			    	    	break;
			    	    }
			      }
			}
		}
		
		return com;
	}
	
	static void print(int[] com)
	{
	      for(int i:com) // 저장된 데이터 한개씩 읽어온다. (for-each)
	      {
		        System.out.println(i+" ");
	      }
	}
	
	static void process()
	{
		int[] com=getRand();
		print(com);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
