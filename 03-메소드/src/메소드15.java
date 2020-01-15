import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class �޼ҵ�15 {
	
    static String[] getMusicTitle() throws Exception
    {
    	String[] list=new String[50];
    	Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
        Elements title=doc.select("td.info a.title");  // ��ũ�±׸� a�±׶� �Ѵ�.
        
        for(int i=0;i<50;i++)
        {
        	list[i] = title.get(i).text();
        }
    	return list;
    }
    
    // 1|����|������|�ٹ�|100
    // ��ü �����͸� �����ͼ� �ڸ��� ? �κи� �����ð����� ?
    static String getMuSicInfo(int no) throws Exception
    {
    	String res="";

    	Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
        Elements singer=doc.select("td.info a.artist");  // ��ũ�±׸� a�±׶� �Ѵ�.
        Elements album=doc.select("td.info a.albumtitle");
        
        for(int i=0;i<50;i++)
        {
        	if(i==(no-1))
        	{
        		res=singer.get(i).text()+" | "+album.get(i).text();
        		break;
        	}
        }
        
    	return res;
    }
    
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String[] title=getMusicTitle();
		System.out.println("===================���Ϲ��� top50===================");
		for(String s:title)
		{
			System.out.println(s);
		}
		System.out.println("=================================================");
		
		Scanner scan=new Scanner(System.in);
		/*
		 * System.out.println("������ �Է��ϼ��� : "); String name=scan.next(); for(String
		 * s:title) { if(s.contains(name)) //���Ե� ���ڰ˻��� �ݵ�� ����Ѵ�. contains {
		 * System.out.println(s); } }
		 */
		
		System.out.println("���� �� ������ȣ �Է�(1~50) : ");
		int no = scan.nextInt();
		String detail=getMuSicInfo(no);
		// $, . , ^ , |, ? �� ��� �տ� \\�� �־�� ���ϴ� �����͸� ������ �� �ִ�.
		String[] value=detail.split("\\|");  
		// |�� �ָ� �ѱ��ھ��� �߸��� �������� �ƴ϶� �� �� �� ��µǴ� ���̴�. 
		// StringTokenizer�� �Ἥ ���ڿ��� ����/������ �� �ִ�.
		System.out.println("������ : "+value[0]);
		System.out.println("�ٹ� : "+value[1]);

	}

}
