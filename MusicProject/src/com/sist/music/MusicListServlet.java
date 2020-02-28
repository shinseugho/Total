package com.sist.music;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.MusicDAO;
import com.sist.dao.MusicVO;

import java.util.*;
import com.sist.dao.*;

@WebServlet("/MusicListServlet")
public class MusicListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		//데이터 읽기
		String strPage=request.getParameter("page");
		if(strPage==null) strPage="1";
		int curpage=Integer.parseInt(strPage);
		MusicDAO dao=new MusicDAO();
		ArrayList<MusicVO> list=dao.musicListData(curpage);
		int totalpage=dao.musicTotalPage();
		
		//출력
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel=stylesheet href=\"css/table.css\">");
		out.println("<script type=text/javascript src=\"http://code.jquery.com/jquery.js\"></script>");
		out.println("<script type=text/javascript>");
		out.println("$(function(){");
		out.println("$('#keyword').keyup(function(){");
		out.println("var k=$(this).val();");
		out.println("$('.user_table > tbody > tr').hide();");
		out.println("var temp=$('.user_table>tbody>tr>td:nth-child(5n+4):contains(\'+k+\')')");
		out.println("$(temp).parent().show();");
		out.println("});");
		out.println("});");
		out.println("</script");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1 style=\"text-align:center\">뮤직 Top 200</h1>");
		out.println("<table id=table_content width=700>");
		out.println("<thead>");
		out.println("<tr>");
		out.println("<td align=left>");
		out.println("Search:<input type=text id=keyword size=20>");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<table id=table_content width=700 class=user_table>");
		out.println("<tr>");
		out.println("<th width=10%>순위</th>");
		out.println("<th width=15%>등폭</th>");
		out.println("<th width=20%></th>");
		out.println("<th width=35%>곡명</th>");
		out.println("<th width=20%>가수</th>");
		out.println("</tr>");
		out.println("</thead>");
		out.println("<tbody>");
		for(MusicVO vo:list)
		{
			String temp="";
			if(vo.getState().equals("상승"))
			{
				temp="<font color=red>▲</font>&nbsp;"+vo.getIdcrement();
			}
			else if(vo.getState().equals("하강"))
			{
				temp="<font color=blue>▼</font>&nbsp;"+vo.getIdcrement();
			}
			else
			{
				temp="<font color=gray>-</font>";
			}
			out.println("<tr>");
			out.println("<td width=10% align=center>"+vo.getRank()+"</td>");
			out.println("<td width=10% align=center>"+temp+"</td>");
			out.println("<td width=15% align=center><img src="+vo.getPoster()+" width=35 height=35></td>");
			out.println("<td width=45%>"+vo.getTitle()+"</td>");
			out.println("<td width=20%>"+vo.getSinger()+"</td>");
			out.println("</tr>");
		}
		out.println("</tbody>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
	}

}
