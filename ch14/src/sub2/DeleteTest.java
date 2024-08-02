package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
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
			String sql ="Delete from `user1` where `uid` = 'J101'";
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete 완료");
	}
}
