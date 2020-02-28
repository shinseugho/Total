package com.sist.dao;

import java.util.*;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;

public class EmpDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	private static EmpDAO dao;
	
	public void getConnection()
	{
		try
		{
			Context init=new InitialContext();
			//탐색기를 연다
			Context c=(Context)init.lookup("java://comp/env");
			//lookup: ("별칭", 클래스주소)
			//저장된 폴더위치로 접근
			DataSource ds=(DataSource)c.lookup("jdbc/oracle");
			//실제 Connection 주소요청: 오라클 정보와 관련된 모든 정보를 전송한다.
			conn=ds.getConnection();
			//주소값 전송 요청
			
			
		}catch(Exception ex) {}
	}
	
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	
	public ArrayList<EmpVO> empAllData()
	{
		ArrayList<EmpVO> list=new ArrayList<EmpVO>();
		try
		{
			getConnection();
//			String sql="SELECT empno, ename, job, hiredate, sal, dname, loc "
//					  +"FROM emp, dept "
//					  +"WHERE emp.deptno=dept.deptno";
			String sql="SELECT * FROM emp_dept";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				EmpVO vo=new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.setSal(rs.getInt(5));
				vo.getDvo().setDname(rs.getString(6));
				vo.getDvo().setLoc(rs.getString(7));
				
				list.add(vo);
			}
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	
}
