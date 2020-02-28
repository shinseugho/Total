package com.sist.survlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.student.dao.StudentDAO;
import com.sist.student.dao.StudentVO;

import java.util.*;
/*
 *  http:// localhost/list.jsp?no=10
 *  ========================== URL
 *                    ======== URI: 물음표앞 까지가 URI
 */
@WebServlet("/list.do")
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String strPage=request.getParameter("page");
		if(strPage==null) strPage="1";
		int curpage=Integer.parseInt(strPage);
		StudentDAO dao=new StudentDAO();
		ArrayList<StudentVO> list=dao.stdAllData(curpage);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>성적관리</h1>");
		
		out.println("<table border=1 width=500>");
		out.println("<tr>");
		out.println("<th>번호</th>");
		out.println("<th>이름</th>");
		out.println("<th>국어</th>");
		out.println("<th>영어</th>");
		out.println("<th>수학</th>");
		out.println("<th></th>");
		out.println("</tr>");
		
		int count=dao.stdRowCount();
		//순차적으로 처리
		count=count-((curpage*10)-10); 
		//총페이지 처리
		int totalpage=(int)Math.ceil(count/10.0);
		for(StudentVO vo:list)
		{
			out.println("<tr>");
			out.println("<td>"+(count--)+"</td>");
			out.println("<td>"+vo.getName()+"</td>");
			out.println("<td>"+vo.getKor()+"</td>");
			out.println("<td>"+vo.getEng()+"</td>");
			out.println("<td>"+vo.getMath()+"</td>");
			out.println("<td><a href=delete.do?hakbun="+vo.getHakbun()+">삭제</a></td>");
			/*	  html의 화면이동
			 * 		1. a			  get방식만 사용가능
			 * 		2. form 		  get, post 둘다 가능
			 * 	  Java의 화면이동
			 * 		3. snedRedirect() get만 가능
			 * 	  JavaScript의 화면이동
			 * 		4. location.href  get만 가능
			 */
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("<table width=500>");
		out.println("<tr>");
		out.println("<td align=center>");
		out.println("<a href=list.do?page="+(curpage>1?curpage-1:curpage)+">이전</a>");
		out.println(curpage+" page /"+totalpage+" pages");
		out.println("<a href=list.do?page="+(curpage<totalpage?curpage+1:curpage)+">다음</a>");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
	}

}
