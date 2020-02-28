package com.sist.board2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.BoardDAO;
import com.sist.dao.BoardVO;


@WebServlet("/BoardInsert")
public class BoardInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel=stylesheet href=\"css/table.css\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>글쓰기</h1>");
		out.println("<table id=\"table_content\" width=600>");
		
		out.println("<form method=post action=BoardInsert>");
		out.println("<tr>");
		out.println("<th width=15% align=right>이름</th>");
		out.println("<td width=85%>");
		out.println("<input type=text name=name size=15 required>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th width=15% align=right>제목</th>");
		out.println("<td width=85%>");
		out.println("<input type=text name=subject size=50 required>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th width=15% align=right>내용</th>");
		out.println("<td width=85%>");
		out.println("<textarea rows=8 cols=55 name=content required></textarea>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th width=15% align=right>비밀번호</th>");
		out.println("<td width=85%>");
		out.println("<input type=password name=pwd size=15 required>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th colspan=2 align=center>");
		out.println("<input type=submit value=글쓰기>");
		out.println("<input type=button value=취소 onclick=\"javascipt:history.back()\">");
		out.println("<td>");
		out.println("</tr>");
		
		out.println("</table>");
		out.println("</form>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
			request.setCharacterEncoding("UTF-8");//한글 변환(3BYTE화)
		}catch(Exception ex) {}
		
		//사용자 입력 데이터 송신
		String name=request.getParameter("name");
		String subject=request.getParameter("subject");
		String content=request.getParameter("content");
		String pwd=request.getParameter("pwd");
		
//		System.out.println("name: "+name);
//		System.out.println("subject: "+subject);
//		System.out.println("content: "+content);
//		System.out.println("pwd: "+pwd);
		
		BoardVO vo=new BoardVO();
		vo.setName(name);
		vo.setSubject(subject);
		vo.setContent(content);
		vo.setPwd(pwd);
		
		//오라클연동: DAO호출 
		BoardDAO dao=new BoardDAO();
		dao.boardInsert(vo);
		
		//이동
		response.sendRedirect("BoardListServlet");
		
	}

}
