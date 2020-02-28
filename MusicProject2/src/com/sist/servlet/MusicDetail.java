package com.sist.servlet;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.sist.dao.*;
import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;

@WebServlet("/MusicDetail")
public class MusicDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		String mno=request.getParameter("mno");
		
		//DAO연동
		MusicDAO dao=new MusicDAO();
		MusicVO vo=dao.musicDetailData(Integer.parseInt(mno));
		ArrayList<MusicReplyVO> list=dao.replyListData(Integer.parseInt(mno));
		ArrayList<MusicVO> toplist=dao.musicTop5();
		//html출력
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel=stylesheet href=\"css/bootstrap.min.css\">");
		out.println("<style type=text/css>");
		out.println(".col-sm-9{");
		out.println("margin: 0px auto;");
		out.println("width: 900px");
		out.println("}");
		out.println("h1{");
		out.println("text-align:center;");
		out.println("}");
		out.println("</style>");
		out.println("<script type=text/javascript src=\"http://code.jquery.com/jquery.js\"></script>");
		out.println("<script>");
		out.println("var i=0;");
		
		out.println("$(function(){");
		out.println("$('#ubtn').click(function(){");
		out.println("if(i==0){");
		out.println("$('#ubtn').val('취소');");
		out.println("i=1;");
		out.println("}");
		out.println("else {");
		out.println("$('#ubtn').val('수정');");
		out.println("i=0;");
		out.println("}");
		out.println("})");
		out.println("});");
		
		out.println("</script>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class=container-fluid>");
		out.println("<h1>&lt;"+vo.getTitle()+"&gt;상세보기</h1>");
		out.println("<div class=col-md-9>");
		out.println("<table class=\"table table-bordered\">");
		out.println("<tr>");
		out.println("<td colspan=2 class=text-center>");
		out.println("<embed src=\"http://youtube.com/embed/"+vo.getKey()+"\" width=100% height=350>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td width=10% class=text-right>");
		out.println("노래명");
		out.println("</td>");
		out.println("<td width=90% class=text-left>");
		out.println(vo.getTitle());
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td width=10% class=text-right>");
		out.println("가수명");
		out.println("</td>");
		out.println("<td width=90% class=text-left>");
		out.println(vo.getSinger());
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td width=10% class=text-right>");
		out.println("앨범");
		out.println("</td>");
		out.println("<td width=90% class=text-left>");
		out.println(vo.getAlbum());
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td colspan=2 class=text-right>");
		out.println("<a href=\"MusicList\" class=\"btn btn-lg btn-success\">목록</a>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("</table>");
		
		out.println("<div style=\"height=20px\"><div>");
		//댓글출력
		//댓글입력창
		HttpSession session=request.getSession();
		String id=(String)session.getAttribute("id");
			
		if(list.size()<1)
		{
			out.println("<table class=\"table table-striped\">");
			out.println("<tr>");
			out.println("<td class=text-center>");
			out.println("<h3>댓글이 존재하지 않습니다</h3>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		else
		{
			out.println("<table class=\"table table-striped\">");
			out.println("<thead>");
			out.println("<tr>");
			out.println("<th>댓글보기</th>");
			out.println("</tr>");
			out.println("</thead>");
			out.println("<tbody>");
			for(MusicReplyVO rvo:list)
			{
				out.println("<tr>");
				out.println("<td class=text-left>");
				String temp="";
				if(rvo.getSex().equals("남자"))
					temp="m1.png";
				else
					temp="w1.png";
				out.println("<img src=\"image/"+temp+"\" width=25 height=25>");
				out.println("&nbsp;"+rvo.getName()+"("+rvo.getDbDay()+")");
				out.println("</td>");
				out.println("<td class=text-right>");
				if(rvo.getId().equals(id))
				{
					//id가 일치하면 댓글수정/삭제가 가능
					out.println("<input type=button class=\"btn btn-xs btn-primary\" value=수정 id=ubtn data="+rvo.getNo()+">");
					out.println("<a href=\"ReplyDelete?no="+rvo.getNo()+"&mno="+mno+"\" class=\"btn btn-xs btn-danger\">삭제</a>");
				}
				out.println("</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td colspan=2 class=text-left><pre style=\"white-space:pre-wrap; border:none; background:white\">"+rvo.getMsg()+"</pre></td>");
				out.println("</tr>");
				
				out.println("<tr id=\"m"+rvo.getNo()+"\" style=\"display:none\">");
				out.println("<td colspan=2>");
				out.println("<textarea rows=3 cols=80 style=\"float:left\" required name=msg>"+rvo.getMsg()+"</textarea>");
				out.println("<input type=hidden value="+mno+" name=mno>");
				out.println("<input type=submit value=댓글수정 style=\"height:70px;float:left\" class=\"btn btn-primary\">");
				out.println("</td>");
				out.println("</tr>");

				
			}
			out.println("</tbody>");
			out.println("</table>");
		}
		//댓글입력창
		//null은 저장이 안된 상태이다.(: 로그인을 안한 상태)
		if(id!=null)		
		{	
			out.println("<form method=post action=\"ReplyInsert\">");
			out.println("<table class=\"table table-hover\">");
			out.println("<tr>");
			out.println("<td>");
			out.println("<textarea rows=3 cols=80 style=\"float:left\" required name=msg></textarea>");
			out.println("<input type=hidden value="+mno+" name=mno>");
			out.println("<input type=submit value=댓글쓰기 style=\"height:70px;float:left\" class=\"btn btn-primary\">");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("</form>");
		}
		out.println("</div>");
		
		out.println("<div class=col-md-3>");
		out.println("<table class=\"table table-hover\">");
		out.println("<caption>인기순위 5</caption>");
		for(MusicVO tvo:toplist)
		{
			out.println("<tr>");
			out.println("<td>"+tvo.getRank()+"</td>");
			out.println("<td>");
			out.println("<img src=\""+tvo.getPoster()+"\" width=35 height=35>");
			out.println("</td>");
			out.println("<td>"+tvo.getTitle()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

}
