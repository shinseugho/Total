package com.sist.manager;

import java.text.SimpleDateFormat;
import java.util.*;
import com.sist.vo.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.sist.vo.MovieVO;
import com.sist.dao.*;

public class MovieManager {
	MovieDAO dao=MovieDAO.newInstance();
//
//	public ArrayList<MovieVO> movieListData()
//	{
//		ArrayList<MovieVO> list=new ArrayList<MovieVO>();
//		//싱글턴 방식
//		MovieDAO dao=MovieDAO.newInstance();
//		try
//		{	
//			int k=1;	
//			//for(int i=1; i<=7;i++)
//			{
//				Document doc=Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get();
//				Elements link=doc.select("div.info_tit a");
//				for(int j=0;j<link.size();j++)
//				{
//					try 
//					{
//					Element elem=link.get(j);
//					String mLink="https://movie.daum.net"+elem.attr("href");
//					Document doc2=Jsoup.connect(mLink).get();
//					Element title=doc2.selectFirst("div.subject_movie strong.tit_movie");
//					System.out.println(title.text());
//					Element score=doc2.selectFirst("div.subject_movie em.emph_grade");
//					System.out.println(score.text());
//					
//					Element genre=doc2.select("dl.list_movie dd.txt_main").get(0);
//					System.out.println(genre.text());
//					Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1);
//					System.out.println(regdate.text());
//					
//					Element time=doc2.select("dl.list_movie dd").get(3);
//					
//					String temp=time.text();
//					StringTokenizer st=new StringTokenizer(temp,",");
//					String strTime=st.nextToken();
//					String strGrade=st.nextToken().trim();
//					
//					System.out.println(strTime);
//					System.out.println(strGrade);
//					
//					Element director=doc2.select("dl.list_movie dd.type_ellipsis").get(0);
//					System.out.println(director.text());
//					Element actor=doc2.select("dl.list_movie dd.type_ellipsis").get(1);
//					System.out.println(actor.text());
//					Element story=doc2.selectFirst("div.desc_movie p");
//					System.out.println(story.text());
//					Element poster=doc2.selectFirst("a.area_poster img.img_summary");
//					
//					MovieVO vo=new MovieVO();
//					vo.setTitle(title.text());
//					vo.setScore(Double.parseDouble(score.text()));
//					vo.setGenre(genre.text());
//					vo.setRegdate(regdate.text());					
//					vo.setTime(strTime);
//					vo.setGrade(strGrade);					
//					vo.setDirector(director.text());
//					vo.setActor(actor.text());		
//					vo.setStory(story.text());
//					vo.setPoster(poster.attr("src"));
//					vo.setType(5);
//					
//					dao.movieInsert(vo);
//					
//					System.out.println("k="+k);
//					k++;
//
//					}catch(Exception ex) {}
//				}
//			}
//			System.out.println("DataBase Insert End...");
//		 
//		}catch(Exception ex) {}
//		return list;
//	}
//	
	public ArrayList<NewsVO> newsAllData()
	{
		ArrayList<NewsVO> list=new ArrayList<NewsVO>();
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		String today=sdf.format(date);
		try
		{
				for(int i=1; i<=18; i++)
				{	
					Document doc=Jsoup.connect("https://movie.daum.net/magazine/new?tab=nws&regdate="+today+"&page="+i).get();
					Elements title=doc.select("ul.list_line strong.tit_line a");	
					Elements poster=doc.select("ul.list_line a.thumb_line span.thumb_img");	
					Elements link=doc.select("ul.list_line strong.tit_line a");	
					Elements temp=doc.select("span.cont_line span.state_line");	
					Elements content=doc.select("span.cont_line a.desc_line");	
					for(int j=0; j<title.size();j++)
					{
						System.out.println(title.get(j).text());
						
						String ss=poster.get(j).attr("style");
						ss=ss.substring(ss.indexOf("(")+1,ss.lastIndexOf(")"));
						System.out.println(ss);
						
						System.out.println(link.get(j).attr("href"));
						String str=temp.get(j).text();
						String author=str.substring(0,str.indexOf("・"));
						String regdate=str.substring(str.lastIndexOf("자")+1);
						System.out.println(author);
						System.out.println(regdate);
						
						System.out.println(content.get(j).text());
						System.out.println("====================================");				
						NewsVO vo=new NewsVO();
						vo.setTitle(title.get(j).text());
						vo.setLink(link.get(j).attr("href"));
						vo.setContent(content.get(j).text());
						vo.setPoster(ss);
						vo.setRegdate(regdate);
						vo.setAuthor(author);
						
						dao.newsInsert(vo);
					}
				}
				
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieManager m=new MovieManager();
//		m.movieListData();
		m.newsAllData();
	}

}
