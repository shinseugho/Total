package 문자열;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 메소드06 {
	static void siteData(String url) throws Exception
	{
		Document doc = Jsoup.connect(url).get();
		Elements link = doc.select("div.info_tit a.name_movie");
		int k=1;
		for(int i=0;i<link.size();i++)
		{
		 try{
			//System.out.println(link.get(i).attr("href"));
			String link_data = "https://movie.daum.net"+link.get(i).attr("href"); // //는 https생략이 가능하지만, /는 https생략이 불가능하다.
			System.out.println(link_data);
			
			Document doc2 = Jsoup.connect(link_data).get();
			/*<div class="subject_movie">
			 *		<strong class="tit_movie">겨울왕국 2 (2019)</strong>
			 *		<span class="txt_origin">Frozen II</span>
			 *<a href="/moviedb/grade?movieId=93004" class="raking_grade">
			 *		<span class="bg_star star_grade"><span class="bg_star inner_star" style="width:74.15000081062317%">평점</span></span> <!-- 116px이 100%, % 계산에서 width값에 적용-->
			 *		<em class="emph_grade">7.4</em><span class="txt_grade">/10</span>
			 *<dl class="list_movie list_main">
			 *		<dt class="screen_out">장르|나라</dt>																			
		     *		<dd class="txt_main">애니메이션/어드벤처/코미디/판타지/뮤지컬</dd>
			 */
			Element	title_kr = doc2.selectFirst("div.subject_movie strong.tit_movie");
			Element	title_en = doc2.selectFirst("div.subject_movie span.txt_origin");
			//Element score = doc2.selectFirst("a.ranking_grade em.emph_grade");
			Element	genre = doc2.select("dl.list_movie dd.txt_main").get(0);
			Element	regdata = doc2.select("dl.list_movie dd.txt_main").get(1);
			Element	grade = doc2.select("dl.list_movie dd").get(3);
			Element	director = doc2.select("dl.list_movie dd").get(4);
			Element	actor = doc2.select("dl.list_movie dd").get(5);
			
			System.out.println(title_kr.text());
			System.out.println(title_en.text());
			//System.out.printf(score.text());
			System.out.println(genre.text());
			System.out.println(regdata.text());
			System.out.println(grade.text());
			System.out.println(director.text());
			System.out.println(actor.text());
			// <>텍스트<> => text
			// <       > => attr
			System.out.println("=====================================================");

		 }catch(Exception ex) {}
	 }
	}
	
	static void process() throws Exception
	{
		Scanner scan = new Scanner(System.in);
		String[] url= {
				"https://movie.daum.net/premovie/released",
				"https://movie.daum.net/premovie/scheduled",
				"https://movie.daum.net/boxoffice/weekly",
				"https://movie.daum.net/boxoffice/monthly",
				"https://movie.daum.net/boxoffice/yearly"
		};
		
		while(true)
		{
			System.out.println("================");
			System.out.println("1.현재상영영화");
			System.out.println("2.개봉예정영화");
			System.out.println("3.박스오피스(주간)");
			System.out.println("4.박스오피스(월간)");
			System.out.println("5.박스오피스(연간)");
			System.out.println("6.종료");
			System.out.println("================");
			System.out.println("선택> ");
			int no=scan.nextInt();
			if(no==6)
			{
				System.out.println("프로그램 종료");
				break;
			}
			siteData(url[no-1]);
		}
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		process();
	}

}
