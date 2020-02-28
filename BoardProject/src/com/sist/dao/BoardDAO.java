package com.sist.dao;

import java.util.*;//ArrayList
import java.sql.*; //Connection, PrepareStatement, ResultSet
/*	Connection: 오라클연결
 * 	PrepareStatement: SQL문장 저장
 * 	ResultSet: 결과값 저장
 * 		ResultSet excuteQuery("SQL"): SELECT
 * 		excuteUpdate("SQL"): INSERT, UPDATE, DELETE
 * 
 * 1. 데이터 저장소
 * 2. 데이터 수집
 * 3. 자바 연동
 * 4. HTML 화면
 * 5. HTML 데이터 출력
 * 6. CSS
 * 7. JavaScript
 */
public class BoardDAO {

		private Connection conn;
		private PreparedStatement ps;
		private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
		
		public BoardDAO()
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(Exception ex) 
			{
				System.out.println(ex.getMessage());
			}
		}
		
		public void getConnection()
		{
			try
			{
				conn=DriverManager.getConnection(URL,"hr","happy");
			}catch(Exception ex){}
		}
		
		public void disConnection()
		{
			try
			{
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			}catch(Exception ex){}
		}
		
		//게시판목록읽기		SELECT ORDER BY
		public ArrayList<BoardVO> boardListData(int page)
		{
			ArrayList<BoardVO> list=new ArrayList<BoardVO>();
			try
			{
				getConnection();
				String sql="SELECT no, subject, name, regdate, hit "
						  +"FROM board "
						  +"ORDER BY no DESC";
				int rowSize=10;
				int i=0;
				int j=0;
				int pageStart=(page*rowSize)-rowSize; //1페이지 0~9 2페이지 10~19 ...
				ps=conn.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{
					if(i<10 && j>=pageStart)
					{
						BoardVO vo=new BoardVO();
						vo.setNo(rs.getInt(1));
						vo.setSubject(rs.getString(2));
						vo.setName(rs.getString(3));
						vo.setRegdate(rs.getDate(4));
						vo.setHit(rs.getInt(5));
						list.add(vo);
						i++;
					}
					j++;
				}
				rs.close();
			}catch (Exception ex) 
			{
				System.out.println(ex.getMessage());
			}
			finally 
			{
				disConnection();
			}
			return list;
		}
		
		public int boardTotalPage()
		{
			int total=0;
			try
			{
				getConnection();
				String sql="SELECT CEIL(COUNT(*)/10.0) FROM board";
				ps=conn.prepareStatement(sql);
				
				ResultSet rs=ps.executeQuery();
				rs.next();
				total=rs.getInt(1);
				rs.close();
			}catch (Exception ex) 
			{
				System.out.println(ex.getMessage());
			}
			finally
			{
				disConnection();
			}
			return total;
		}
		
		//게시판=> 내용보기		SELECT WHERE
		public BoardVO boardDetailData(int no)
		{
			BoardVO vo=new BoardVO();
			try
			{
				getConnection();
				String sql="UPDATE board SET "
						  +"hit=hit+1 "
						  +"WHERE no=?";
				ps=conn.prepareStatement(sql);
				//?에 값을 채운다.
				ps.setInt(1, no);
				//실행요청
				ps.executeUpdate();
				
				sql="SELECT no, name, subject, content, regdate, hit "
					+"FROM board "
					+"WHERE no=?";
				
				ps=conn.prepareStatement(sql);
				ps.setInt(1, no);
				
				ResultSet rs=ps.executeQuery();
				rs.next();
				
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setSubject(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setRegdate(rs.getDate(5));
				vo.setHit(rs.getInt(6));
				
				rs.close();
				
			}catch(Exception ex) 
			{
				System.out.println(ex.getMessage());
			}
			finally
			{
				disConnection();
			}
			return vo;
		}
		
		//추가				INSERT
		public void boardInsert(BoardVO vo)
		{
			try
			{
				getConnection();
				String sql="INSERT INTO board(no,name,subject,content,pwd) "
						  +"VALUES((SELECT NVL(MAX(no)+1,1) FROM board),?,?,?,?)";
				ps=conn.prepareStatement(sql);
				//실행전에 ?에 값을 채운다(?가 없으면 바로 실행)
				ps.setString(1,vo.getName());
				ps.setString(2,vo.getSubject());
				ps.setString(3,vo.getContent());
				ps.setString(4,vo.getPwd());
				//실행
				ps.executeUpdate();
			}catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			finally
			{
				disConnection();
			}
		}
		
		//수정				UPDATE
		public BoardVO boardUpdateData(int no)
		{
			BoardVO vo=new BoardVO();
			try
			{
				getConnection();
				String sql="SELECT no, name, subject, content "
						  +"FROM board "
						  +"WHERE no=?";
				
				ps=conn.prepareStatement(sql);
				ps.setInt(1, no);
				
				ResultSet rs=ps.executeQuery();
				rs.next();
				
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setSubject(rs.getString(3));
				vo.setContent(rs.getString(4));
				
				rs.close();
				
			}catch(Exception ex) 
			{
				System.out.println(ex.getMessage());
			}
			finally
			{
				disConnection();
			}
			return vo;
		}
		
		//실제수정
		public boolean boardUpdate(BoardVO vo)
		{
			boolean bCheck=false;
			try
			{
				getConnection();
				String sql="SELECT pwd FROM board "
						  +"WHERE no=?";
				ps=conn.prepareStatement(sql);
				ps.setInt(1, vo.getNo());
				ResultSet rs=ps.executeQuery();
				rs.next();
				String db_pwd=rs.getString(1);
				rs.close();
				
				if(db_pwd.equals(vo.getPwd()))
				{
					bCheck=true;
					sql="UPDATE board SET "
					   +"name=?,subject=?,content=? "
					   +"WHERE no=?";
					ps=conn.prepareStatement(sql);
					ps.setString(1, vo.getName());
					ps.setString(2, vo.getSubject());
					ps.setString(3, vo.getContent());
					ps.setInt(4, vo.getNo());
					
					ps.executeUpdate();
				}
				else
				{
					bCheck=false;
				}
			}catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			finally
			{
				disConnection();
			}
			return bCheck;
		}
		
		//삭제				DELETE
		public boolean boardDelete(int no, String pwd)
		{
			boolean bCheck=false;
			try
			{
				getConnection();
				String sql="SELECT pwd FROM board "
						  +"WHERE no=?";
				ps=conn.prepareStatement(sql);
				ps.setInt(1, no);
				ResultSet rs=ps.executeQuery();
				rs.next();
				String db_pwd=rs.getString(1);
				rs.close();
				
				if(db_pwd.equals(pwd))
				{
					bCheck=true;
					sql="DELETE FROM board "
					   +"WHERE no=?";
					ps=conn.prepareStatement(sql);
					ps.setInt(1, no);
					ps.executeUpdate();
				}
				else
				{
					bCheck=false;
				}
			}catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			finally
			{
				disConnection();
			}
			return bCheck;
		}
		
		//찾기				SELECT LIKE
		public ArrayList<BoardVO> boardFind( )
		{
			ArrayList<BoardVO> list=new ArrayList<BoardVO>();
			try
			{
				getConnection();
				String sql="SELECT no, name, subject, content, regdate, hit "
					      +"FROM board "
					      +"WHERE no=?";
				
				ps=conn.prepareStatement(sql);
				
				ResultSet rs=ps.executeQuery();
				rs.next();
				
				rs.close();
				
			}catch(Exception ex) 
			{
				System.out.println(ex.getMessage());
			}
			finally
			{
				disConnection();
			}
			return list;
		}
		
}
