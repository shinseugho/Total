package com.sist.view;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.MovieDAO;
import com.sist.vo.MovieVO;

@WebServlet("/ScheduleServlet")
public class ScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		String strPage=request.getParameter("page");
		if(strPage==null) strPage="1";
		
		int curpage=Integer.parseInt(strPage);
		
		//dao연결
		
		MovieDAO dao=MovieDAO.newInstance();
		ArrayList<MovieVO> list=dao.movieListData(curpage, 2);

		out.println("<html>");
		out.println("<head>");
		out.println("<style type=text/css>");
		out.println(".row {");
		out.println("margin: 0px auto;");
		out.println("width: 1200px;");
		out.println("}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class=row>");

		for(MovieVO vo:list)
		{
			String title=vo.getTitle();
			String title2="";
			if(title.length()>20)
			{
				title2=title.substring(0,20)+"...";
			}
			else
			{
				title2=title;
			}
			out.println("<div class=\"col-md-3\">");
			out.println("<div class=\"thumbnail\">");
			out.println("<a href=\"#\">");
			out.println("<img src=\""+vo.getPoster()+"\" alt=\"Lights\" style=\"width:100%\">");
			out.println("<div class=\"caption\">");
			out.println("<p>"+title2+"</p>");
			out.println("</div>");
			out.println("</a>");
			out.println("</div>");
			out.println("</div>");
		}
		out.println("</div>");
		out.println("<div class=\"row text-center\">");
		/*
		 * <ul class="pagination pagination-lg">
  			<li><a href="#">1</a></li>
  			<li><a href="#">2</a></li>
		   </ul>

		 */
		out.println("<ul class=\"pagination pagination-lg\">");
		for(int i=1;i<=7;i++)
		{
			out.println("<li><a href=\"MainServlet?mode=2&page="+i+"\">"+i+"</a></li>");
		}
		out.println("</ul>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
