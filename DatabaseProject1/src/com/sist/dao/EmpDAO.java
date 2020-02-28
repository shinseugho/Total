package com.sist.dao;

/* 오라클 연동
 *  1. 드라이버등록
 *  2. 연결
 *  3. 해체
 *  4. 기능설정
 */

import java.util.*;
import java.sql.*;

public class EmpDAO {
	
	//연결도구
	private Connection conn;
	
	//입출력
	private PreparedStatement ps;
	
	//URL조소
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	//드라이버 등록=> 한 번 수행
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
	}
	
	//연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	
	//해제
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	
	/*기능수행
	 * 1. 전체데이터읽기
	 * 2. 원하는 컬럼읽기
	 * 3. WHERE문장이용
	 * 4. 연산자 사용
	 * 5. 함수 사용
	 * 6. GROUP BY사용
	 */
	//1. 전체데이터읽기
	public ArrayList<EmpVO> empAllData()
	{
		ArrayList<EmpVO> list=new ArrayList<EmpVO>();
		try
		{
			//연결
			getConnection();
			
			//sql문장작성
			String sql="SELECT * " 
					  +"FROM emp "
					  +"ORDER BY empno";
			
			//오라클전송
			ps=conn.prepareStatement(sql);
			
			//결과값수신
			ResultSet rs=ps.executeQuery();
			// rs.next();
			// rs.previous();
			while(rs.next())
			{
				EmpVO vo=new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setMgr(rs.getInt(4));
				vo.setHiredate(rs.getDate(5));
				vo.setSal(rs.getInt(6));
				vo.setComm(rs.getInt(7));
				vo.setDeptno(rs.getInt(8));
				
				list.add(vo);
			}
			rs.close();
			// list에 첨부
			
		}catch(Exception ex) 
		{
			//에러처리
			ex.printStackTrace();
		}
		finally
		{
			//연결해제
			disConnection();
		}
		return list;
	}
	
	//3-1. WHERE문장이용
	public EmpVO empDetailData(int empno)
	{
		EmpVO vo=new EmpVO();		
		try
		{
			//연결
			getConnection();
			
			//sql문장작성
			String sql="SELECT * " 
					  +"FROM emp "
					  +"WHERE empno=?";
			
			//오라클전송
			ps=conn.prepareStatement(sql);
			ps.setInt(1, empno);
			//결과값수신
			ResultSet rs=ps.executeQuery();
		    rs.next();
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setMgr(rs.getInt(4));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getInt(6));
			vo.setComm(rs.getInt(7));
			vo.setDeptno(rs.getInt(8));

			rs.close();
			// list에 첨부
			
		}catch(Exception ex) 
		{
			//에러처리
			ex.printStackTrace();
		}
		finally
		{
			//연결해제
			disConnection();
		}
		return vo;
	}
	
	//3-2. WHERE문장이용
	public ArrayList<EmpVO> empFindData(String ename)
	{
		ArrayList<EmpVO> list=new ArrayList<EmpVO>();
		try
		{
			//연결
			getConnection();
			
			//sql문장작성
			String sql="SELECT * " 
					  +"FROM emp "
					  +"WHERE ename LIKE '%'||?||'%'";
			//오라클전송
			ps=conn.prepareStatement(sql);
			ps.setString(1, ename);
			
			//결과값수신
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				EmpVO vo=new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setMgr(rs.getInt(4));
				vo.setHiredate(rs.getDate(5));
				vo.setSal(rs.getInt(6));
				vo.setComm(rs.getInt(7));
				vo.setDeptno(rs.getInt(8));
				
				list.add(vo);
			}
			rs.close();
			// list에 첨부
			
		}catch(Exception ex) 
		{
			//에러처리
			ex.printStackTrace();
		}
		finally
		{
			//연결해제
			disConnection();
		}
		return list;
	}
	
	//3-3. WHERE문장이용
		public ArrayList<EmpVO> empRangeData(int year)
		{
			ArrayList<EmpVO> list=new ArrayList<EmpVO>();
			try
			{
				//연결
				getConnection();
				
				//sql문장작성
				String sql="SELECT * " 
						  +"FROM emp "
						  +"WHERE hiredate BETWEEN ? AND ?";
				//오라클전송
				ps=conn.prepareStatement(sql);
				ps.setString(1, year+"/01/01");
				ps.setString(2, year+"/12/31");
				//결과값수신
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					EmpVO vo=new EmpVO();
					vo.setEmpno(rs.getInt(1));
					vo.setEname(rs.getString(2));
					vo.setJob(rs.getString(3));
					vo.setMgr(rs.getInt(4));
					vo.setHiredate(rs.getDate(5));
					vo.setSal(rs.getInt(6));
					vo.setComm(rs.getInt(7));
					vo.setDeptno(rs.getInt(8));
					
					list.add(vo);
				}
				rs.close();
				// list에 첨부
				
			}catch(Exception ex) 
			{
				//에러처리
				ex.printStackTrace();
			}
			finally
			{
				//연결해제
				disConnection();
			}
			return list;
		}
}
