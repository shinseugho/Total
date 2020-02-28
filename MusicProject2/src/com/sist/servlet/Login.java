package com.sist.servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.StringTokenizer;
import com.sist.dao.*;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel=stylesheet href=\"css/bootstrap.min.css\">");
		out.println("<style type=text/css>");
		out.println(".row {");
		out.println("margin: 0px auto;"); //가운데 정렬
		out.println("width: 350px");
		out.println("}");
		out.println("h1 {");
		out.println("text-align:center");
		out.println("}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class=container>");// container: 테두리 여백 o, container-fluid: 테두리 여백x, 전체화면
		out.println("<h1>Login</h1>");
		out.println("<div class=row>");
		out.println("<form method=post action=Login>");
		out.println("<table class=\"table table-hover\">");
		out.println("<tr>");
		out.println("<td width=20% class=text-right>ID</td>");
		out.println("<td width=20% class=text-left><input type=text name=id size=15></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td width=20% class=text-right>Password</td>");
		out.println("<td width=20% class=text-left><input type=password name=pwd size=15></td>");
		out.println("</tr>");
		out.println("<tr>");
		/*
		 * 버튼 크기
		 * xs
		 * md
		 * sm
		 * lg
		 */
		out.println("<td colspan=2 class=text-center><input type=submit class=\"btn btn-md btn-Danger\" value=Login></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;cahrset=UTF-8");
		PrintWriter out=response.getWriter();
		
		MusicDAO dao=new MusicDAO();
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		String result=dao.isLogin(id, pwd);
		
		if(result.equals("NOID"))
		{
			out.println("<script>");
			out.println("alter(\"ID가 존재하지 않습니다.\");");
			out.println("history.back();");
			out.println("</script>");
		}
		else if(result.equals("NOPWD"))
		{
			out.println("<script>");
			out.println("alter(\"비밀번호가 틀립니다.\");");
			out.println("history.back();");
			out.println("</script>");
		}
		else
		{
			//로그인정보 저장
			HttpSession session=request.getSession();
			session.setAttribute("id", id);
			StringTokenizer st=new StringTokenizer(result,"|"); 
			session.setAttribute("name", st.nextToken());
			session.setAttribute("sex", st.nextToken());
			//파일이동
			response.sendRedirect("MusicList");
			
		}
	}

}
