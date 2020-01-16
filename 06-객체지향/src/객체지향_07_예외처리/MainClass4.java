package ��ü����_07_����ó��;

//����Ŭ ���� => checkException
import java.sql.*;

import com.sun.org.apache.regexp.internal.RE;

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null; //����Ŭ ����
		PreparedStatement ps = null; // SQL���� ���� => ����
		try
		{
			//1. ����Ŭ ����̺� ���� : thin(�ӵ��� �������� ��¥��), oci (oci�� �������� ��δ�.)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. ���� => XML�� �Ժη� ���� �Ұ����ϰ� �ۼ�
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			conn=DriverManager.getConnection(url,"hr","happy");
			
			//3. SQL����
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
