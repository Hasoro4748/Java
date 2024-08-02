package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		
		
		//1단계 - JDBC 드라이버 로드
		try {
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//2단계 
			Statement stmt = conn.createStatement();
			
			//3단계 - SQL실행
			String sql ="UPDATE `user1` set ";
				   sql += "`hp` = '010-1234-1111',";
				   sql += "`age` = 24 ";
				   sql += "where `uid` = 'J101'";
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
