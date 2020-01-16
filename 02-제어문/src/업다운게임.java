/*
 *  ÄÄÇ»ÅÍ = 1 ~ 100 »çÀÌÀÇ ÀÓÀÇÀÇ ¼ö¸¦ ÃßÃâÇÏ°í, ÇÃ·¹ÀÌ¾î°¡ ´äÀ» ¯•Ãß´Â °ÔÀÓ
 *  ÈùÆ® up/down»ÓÀÌ´Ù.
 */
import java.util.Scanner;

public class ¾÷´Ù¿î°ÔÀÓ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int com = (int)(Math.random()*100)+1; // 1 ~ 100±îÁöÀÇ ³­¼ö »ı¼º
		
		Scanner scan = new Scanner(System.in) ;
		
		while (true)  // ¹«ÇÑ·çÇÁ (Á¶°ÇÀÌ trueÀÌ±â ¶§¹®ÀÌ´Ù.)
		{
		  System.out.println("1 ~ 100 »çÀÌÀÇ Á¤¼ö ÀÔ·Â : ");
		  int user = scan.nextInt();
		  
		  if (user<1 || user>100) 
			  {
			         System.out.println("Àß¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù!!");
			         continue;   // Ã³À½À¸·Î µÇµ¹¸®°í ½Í´Ù¸é continue, Á¾·áÇÏ°í ½Í´Ù¸é break¸¦ ¼³Á¤ÇÑ´Ù. 
			                     // while ¹®ÀÇ Á¶°Ç½ÄÀ¸·Î ÀÌµ¿ÇÑ´Ù.
			  }
		  
		  if (com>user) 
		     {
			         System.out.println("ÀÔ·Â°ªº¸´Ù Å« ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
			      
		     }
		  else if (com<user)
		     {
			         System.out.println("ÀÔ·Â°ªº¸´Ù ÀÛÀº ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		     }
		  else
		     {
			       System.out.println("Game Over!!");
			    // System.exit(0);
			       break;
		     }

		}
		
	}

}
