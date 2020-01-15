import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

class Category{
	int cateno;
	String poster;
	String title;
	String subTitle;
	String link;
}

class Food{
	int cateno;
	int no;
	String[] poster=new String[4];
	String title;
	double score;
	String address;
	String tel;
	String type;
	String price;
	String parking;
	String time;
	String menu;
	int good;
	int soso;
	int bad;
}

public class FoodMain {
	
	Category[] foodCategoryData() throws Exception
	{
		Category[] cate=new Category[12];
		Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
		Elements title=doc.select("div.info_inner_wrap span.title");
		Elements poster=doc.select("ul.list-toplist-slider img");
		Elements sub=doc.select("div.info_inner_wrap p.desc");
		Elements link=doc.select("ul.list-toplist-slider a");
		for(int i=0;i<12;i++)
		{   
			Category g=new Category();
			g.cateno=i+1;
			g.title=title.get(i).text();  //태그 태그사이 내용을 잘라올 경우에는 text를 이용하고, 태그안의 내용을 잘라올 경우에는 attr을 사용한다.
			g.subTitle=sub.get(i).text();
			g.poster=poster.get(i).attr("data-lazy");
			g.link=link.get(i).attr("href");
			cate[i]=g;
		}
		return cate;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
