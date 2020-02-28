package com.sist.board2;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sist.board2.*;
import com.sist.dao.*;

@WebServlet("/BoardFind")
public class BoardFind extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
				/*
				 * request  : 사용자 요청정보
				 * response : 응답(HTML=> 사용자에게 전송)
				 */
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter out=response.getWriter();
				
				//사용자요청페이지 수신
				String strPage=request.getParameter("page");
				if(strPage==null)
					strPage="1";
				int curpage=Integer.parseInt(strPage);
				
				BoardDAO dao=new BoardDAO();
				ArrayList<BoardVO> list=dao.boardListData(curpage);
				
				int totalpage=dao.boardTotalPage();
				
				out.println("<html>");
				out.println("<head>");
				out.println("<link rel=stylesheet href=\"css/table.css\">");
				out.println("</head>");
				out.println("<body>");
				out.println("<center>");
				out.println("<h1>자유게시판</h1>");
				
				out.println("<table id=\"table_content\" width=700>");
				out.println("<tr>");
				out.println("<td align=left>");
				out.println("<a href=\"BoardInsert\">새글</a>");
				out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
				
				out.println("<table id=\"table_content\" width=700>");
				out.println("<tr>");
				out.println("<th width=10%>번호</th>");
				out.println("<th width=45%>제목</th>");
				out.println("<th width=15%>이름</th>");
				out.println("<th width=20%>작성일</th>");
				out.println("<th width=10%>조회수</th>");
				out.println("</tr>");
				for(BoardVO vo:list)
				{
					out.println("<tr class=dataTr>");
					out.println("<td width=10% align=center>"+vo.getNo()+"</td>");
					out.println("<td width=45% align=left>");
					out.println("<a href=BoardDetailServlet?no="+vo.getNo()+">");
					out.print(vo.getSubject()+"</a>");
					out.println("</td>");
					out.println("<td width=15% align=center>"+vo.getName()+"</td>");
					out.println("<td width=20% align=center>"+vo.getRegdate()+"</td>");
					out.println("<td width=10% align=center>"+vo.getHit()+"</td>");
					out.println("</tr>");
				}
				out.println("</table >");
				
				out.println("<form method=post action=BoardFind>");
				out.println("<table id=\"table_content\" width=700>");
				out.println("<tr>");
				out.println("<td align=left>");
				out.println("Search:");
				out.println("<select name=fs>");
				out.println("<option value=name>이름</option>");
				out.println("<option value=subject>제목</option>");
				out.println("<option value=content>내용</option>");
				out.println("</select>");
				out.println("<input type=text size=15 name=ss>");
				out.println("<input type=submit value=찾기>");
				out.println("</td>");
				out.println("<td align=right>");
				out.println("<a href=\"BoardListServlet?page="+(curpage>1?curpage-1:curpage)+"\">&lt;이전&gt;</a>");
				/*	특수문자
				 * 		&nbsp;	공백
				 * 		&lt;	<
				 * 		&gt;    >
				 */
				out.println(curpage+" page / "+totalpage+" pages");
				out.println("<a href=\"BoardListServlet?page="+(curpage<totalpage?curpage+1:curpage)+"\">&lt;다음&gt;</a>");
				out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
				
				out.println("</center>");
				out.println("</body>");
				out.println("</html>");
	}
}
