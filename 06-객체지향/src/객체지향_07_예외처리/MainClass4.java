package 객체지향_07_예외처리;

//오라클 연결 => checkException
import java.sql.*;

import com.sun.org.apache.regexp.internal.RE;

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null; //오라클 연결
		PreparedStatement ps = null; // SQL문장 전송 => 수신
		try
		{
			//1. 오라클 드라이브 설정 : thin(속도는 느리지만 공짜다), oci (oci는 빠르지만 비싸다.)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 연결 => XML로 함부로 열람 불가능하게 작성
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			conn=DriverManager.getConnection(url,"hr","happy");
			
			//3. SQL문장
			String sql = "SELECT ename,job,sal FROM emp";
		    ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
		    
			while (rs.next())
			{
				System.out.println(rs.getString(1)+" "
						+rs.getString(2)+" "
						+rs.getInt(3));
			}
			rs.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally 
		{
			try 
			{
			    if(ps != null) ps.close();
			    if(conn != null) conn.close();
			}catch(Exception ex) {}
		}
		
	}

}
