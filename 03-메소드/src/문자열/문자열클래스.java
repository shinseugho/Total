package ¹®ÀÚ¿­;
/* String : ¹®ÀÚ¿­ Á¦¾î
 *      java.lang : import¸¦ »ı·«ÇÒ ¼ö ÀÖ´Ù.
 *      ¹®ÀÚ¿­À» ÀúÀåÇÏ´Â ¹æ¹ı
 *        1) String º¯¼ö¸í = "Hello Java";
 *        2) String º¯¼ö¸í = new String("Hello Java"); // °°Àº ¹®ÀÚ¿­ 
 *                         ===
 *                         »õ·Î¿î ¸Ş¸ğ¸®¿¡ ÀúÀå
 *      String¿¡¼­ Á¦°øÇÏ´Â ±â´É
 *        1) equals : ÀúÀåµÈ ¹®ÀÚ¿­ °°ÀºÁö ¿©ºÎ È®ÀÎ(true/false)
 *                    ID,PWD ==> ·Î±×ÀÎ(´ë¼Ò¹®ÀÚ ±¸ºĞ)
 *                    ¹®ÀÚ¿­Àº ==¸¸ »ç¿ëÇÏÁö¸»°í =À» »ç¿ëÇÏ¸éµÈ´Ù.
 *                    
 *                    ex) String s ="Hello";
 *                        String s1 ="Hello";
 *                        String s2 = new String ("Hello");
 *                        if(s.equals(s1))
 *                         
 *                        => ¿øÇü 
 *                           boolean equals(String data) 
 *                                              
 *        2) substring : ¹®ÀÚ¿­À» ÀÚ¸¦¶§ »ç¿ë          
 *                                                   
 *                       substring(int start)
 *                      ex) String s = "0123456789";
 *                          substring(3) => "3456789"; .
 *                          
 *                       substring(int start, int end)
 *                      ex) String s="112ºĞ.15¼¼ÀÌ»ó°ü¶÷°¡"
 *                          substring(0,3) => "112";
 *                                     ===end(:ºĞ)-1°ª(:2)À» Ãâ·Â   
 *                                     
 *        3) length : ¹®ÀÚ¿­ °¹¼ö
 *        
 *        4) trim : ÁÂ¿ìÀÇ °ø¹é¹®ÀÚ Á¦°Å½Ã »ç¿ë
 *                  »ç¿ëÀÚ ½Ç¼ö        
 *                  
 *                  ex)  String s =" Hello Java "; s.length = 12°³
 *                                                 s.trim().length = 10°³        
 *        
 *        5) startWith, endsWith :        
 *                                  
 *                                  ex)  startWith("ÀÚ¹Ù")
 *                                       endsWith("ÀÚ¹Ù")
 *        
 *        6) indexOf, lastIndexOf : ¹®ÀÚÀÇ À§Ä¡¸¦ ¾Õ¿¡¼­ºÎÅÍ Ã£´ÂÁö, µÚ¿¡¼­ºÎÅÍ Ã£´ÂÁö 
 *                               
 *                                ex) String s="Hello java"; 
 *                                    s.indexOf('a')      ==> 7¹øÂ° a
 *                                    s.lastindexof('a')  ==> 9¹øÂ° a
 *        
 *        7) split : 
 *                   ex) String s = "ÀÌº¯Çå, ÇÏÁ¤¿ì, ¸¶µ¿¼®, ÀüÇıÁø, ¼öÁö";
 *                       String[] names = s.split(",") 
 *        
 *        8) toUpperCase, toLowerCase : ´ë¹®ÀÚº¯È¯, ¼Ò¹®ÀÚº¯È¯
 *                                      
 *                                      ex)  String s = "Hello";
 *                                           s.toUpperCase() = HELLO
 *                                           s.toLowerCase() = hello
 *        
 *        9) replace, replaceAll : replace´Â ÇØ´ç¹®ÀÚ º¯È¯À» ÇÏ´Âµ¥ »ç¿ë
 *                                 replaceAllÀº Á¤±Ô½Ä¿¡¼­ »ç¿ë           
 *                                 
 *                                 ex) String s = "Hello Java"
 *                                     s.replace('a','b') ==> Hello Jbvb  ¹®ÀÚ¸¦ ÀüºÎ º¯È¯
 *                                     String s = "113ºĞ"
 *                                     s.replaceAll("[^0-9]","") ==> 113 (¼ıÀÚ»©°í ´Ù Áö¿ö¶ó)
 *                                     s.replaceAll("^[0-9]","")         (¼ıÀÚ·Î ½ÃÀÛÇÑ °ÍÀ» ´Ù Ã£¾Æ¶ó)
 *                                     s.replaceAll("[^0-9]$","")        (¼ıÀÚ·Î ½ÃÀÛÇØ¼­ ¼ıÀÚ·Î ³¡³­ °ÍÀ» ´Ù Áö¿ö¶ó) 
 *                                     s.replaceAll("[^°¡-ÆR]","") ==> ºĞ   (ÇÑ±Û»©°í ´Ù Áö¿ö¶ó)
 *                                     s.replaceAll("[^A-Za-z]","") ==>  (¿µ¾î»©°í ´Ù Áö¿ö¶ó)
 *        
 *      10) contains : Æ÷ÇÔµÈ ¹®ÀÚ¸¦ Ã£´Â °æ¿ì
 */
import java.util.Scanner;

public class ¹®ÀÚ¿­Å¬·¡½º {
	
	static String[] autoCompate(String data)
	{
		String[] ss = {
				"ÀÚ¹Ù¿Í JSP","ÀÚ¹Ù ÇÁ·Î±×·¡¹Ö","½ºÇÁ¸µ 5","Ajax¿Í JSP","¸®´ö½º¿Í ¸®¾×Æ®",
				"ÀÚ¹Ù ¿À¶óÅ¬","MVC ±¸Á¶","ÄÚÆ²¸°°ú ¾Èµå·ÎÀÌµå","ÄÚÆ²¸° ÇÁ·Î±×·¥","½ºÇÁ¸µ µ¥ÀÌÅÍ",
				"È¥ÀÚ ¹è¿ì´Â ÀÚ¹Ù","Áö´ÉÇüÀ¥ ÇÁ·Î±×·¥","À¥ ÇÁ·Î±×·¥","ÀÚ¹Ù À¥ÇÁ·Î±×·¥","¿À¶óÅ¬ ÀÚ¹Ù"
		};
		String[] findData=new String[10];
		int j=0;
		for(int i=0;i<ss.length;i++)
		{
			//if(ss[i].startsWith(data))
			if(ss[i].contains(data))
			{
				findData[j]=ss[i];
				j++;
			}
		}
		return findData;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("°Ë»ö¾î ÀÔ·Â : ");
		String data = scan.next();
		
		String[] fd=autoCompate(data);
		for(int i=0;i<fd.length;i++)
		{
			if(fd[i]!=null)
			{
				System.out.println(fd[i]);
			}
		}

	}

}
