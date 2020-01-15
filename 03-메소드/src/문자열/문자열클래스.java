package ���ڿ�;
/* String : ���ڿ� ����
 *      java.lang : import�� ������ �� �ִ�.
 *      ���ڿ��� �����ϴ� ���
 *        1) String ������ = "Hello Java";
 *        2) String ������ = new String("Hello Java"); // ���� ���ڿ� 
 *                         ===
 *                         ���ο� �޸𸮿� ����
 *      String���� �����ϴ� ���
 *        1) equals : ����� ���ڿ� ������ ���� Ȯ��(true/false)
 *                    ID,PWD ==> �α���(��ҹ��� ����)
 *                    ���ڿ��� ==�� ����������� =�� ����ϸ�ȴ�.
 *                    
 *                    ex) String s ="Hello";
 *                        String s1 ="Hello";
 *                        String s2 = new String ("Hello");
 *                        if(s.equals(s1))
 *                         
 *                        => ���� 
 *                           boolean equals(String data) 
 *                                              
 *        2) substring : ���ڿ��� �ڸ��� ���          
 *                                                   
 *                       substring(int start)
 *                      ex) String s = "0123456789";
 *                          substring(3) => "3456789"; .
 *                          
 *                       substring(int start, int end)
 *                      ex) String s="112��.15���̻������"
 *                          substring(0,3) => "112";
 *                                     ===end(:��)-1��(:2)�� ���   
 *                                     
 *        3) length : ���ڿ� ����
 *        
 *        4) trim : �¿��� ���鹮�� ���Ž� ���
 *                  ����� �Ǽ�        
 *                  
 *                  ex)  String s =" Hello Java "; s.length = 12��
 *                                                 s.trim().length = 10��        
 *        
 *        5) startWith, endsWith :        
 *                                  
 *                                  ex)  startWith("�ڹ�")
 *                                       endsWith("�ڹ�")
 *        
 *        6) indexOf, lastIndexOf : ������ ��ġ�� �տ������� ã����, �ڿ������� ã���� 
 *                               
 *                                ex) String s="Hello java"; 
 *                                    s.indexOf('a')      ==> 7��° a
 *                                    s.lastindexof('a')  ==> 9��° a
 *        
 *        7) split : 
 *                   ex) String s = "�̺���, ������, ������, ������, ����";
 *                       String[] names = s.split(",") 
 *        
 *        8) toUpperCase, toLowerCase : �빮�ں�ȯ, �ҹ��ں�ȯ
 *                                      
 *                                      ex)  String s = "Hello";
 *                                           s.toUpperCase() = HELLO
 *                                           s.toLowerCase() = hello
 *        
 *        9) replace, replaceAll : replace�� �ش繮�� ��ȯ�� �ϴµ� ���
 *                                 replaceAll�� ���ԽĿ��� ���           
 *                                 
 *                                 ex) String s = "Hello Java"
 *                                     s.replace('a','b') ==> Hello Jbvb  ���ڸ� ���� ��ȯ
 *                                     String s = "113��"
 *                                     s.replaceAll("[^0-9]","") ==> 113 (���ڻ��� �� ������)
 *                                     s.replaceAll("^[0-9]","")         (���ڷ� ������ ���� �� ã�ƶ�)
 *                                     s.replaceAll("[^0-9]$","")        (���ڷ� �����ؼ� ���ڷ� ���� ���� �� ������) 
 *                                     s.replaceAll("[^��-�R]","") ==> ��   (�ѱۻ��� �� ������)
 *                                     s.replaceAll("[^A-Za-z]","") ==>  (����� �� ������)
 *        
 *      10) contains : ���Ե� ���ڸ� ã�� ���
 */
import java.util.Scanner;

public class ���ڿ�Ŭ���� {
	
	static String[] autoCompate(String data)
	{
		String[] ss = {
				"�ڹٿ� JSP","�ڹ� ���α׷���","������ 5","Ajax�� JSP","�������� ����Ʈ",
				"�ڹ� ����Ŭ","MVC ����","��Ʋ���� �ȵ���̵�","��Ʋ�� ���α׷�","������ ������",
				"ȥ�� ���� �ڹ�","�������� ���α׷�","�� ���α׷�","�ڹ� �����α׷�","����Ŭ �ڹ�"
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
		System.out.println("�˻��� �Է� : ");
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
