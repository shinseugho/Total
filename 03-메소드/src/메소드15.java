import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 메소드15 {
	
    static String[] getMusicTitle() throws Exception
    {
    	String[] list=new String[50];
    	Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
        Elements title=doc.select("td.info a.title");  // 링크태그를 a태그라 한다.
        
        for(int i=0;i<50;i++)
        {
        	list[i] = title.get(i).text();
        }
    	return list;
    }
    
    // 1|제목|가수명|앨범|100
    // 전체 데이터를 가져와서 자를지 ? 부분만 가져올것인지 ?
    static String getMuSicInfo(int no) throws Exception
    {
    	String res="";

    	Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
        Elements singer=doc.select("td.info a.artist");  // 링크태그를 a태그라 한다.
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
		System.out.println("===================지니뮤직 top50===================");
		for(String s:title)
		{
			System.out.println(s);
		}
		System.out.println("=================================================");
		
		Scanner scan=new Scanner(System.in);
		/*
		 * System.out.println("제목을 입력하세요 : "); String name=scan.next(); for(String
		 * s:title) { if(s.contains(name)) //포함된 문자검색시 반드시 써야한다. contains {
		 * System.out.println(s); } }
		 */
		
		System.out.println("상세히 볼 뮤직번호 입력(1~50) : ");
		int no = scan.nextInt();
		String detail=getMuSicInfo(no);
		// $, . , ^ , |, ? 의 경우 앞에 \\를 주어야 원하는 데이터를 추출할 수 있다.
		String[] value=detail.split("\\|");  
		// |를 주면 한글자씩만 잘린다 백지영이 아니라 백 지 만 출력되는 식이다. 
		// StringTokenizer를 써서 문자열을 추출/편집할 수 있다.
		System.out.println("가수명 : "+value[0]);
		System.out.println("앨범 : "+value[1]);

	}

}
