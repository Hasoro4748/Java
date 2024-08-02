package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2024/07/29
 * 이름 : 강중원
 * 내용 : Insert 실습
 */
public class InsertTest {
	public static void main(String[] args) {
		//DB정보
				String host = "jdbc:mysql://127.0.0.1:3306/studydb";
				String user = "root";
				String pass = "1234";
				
				
				
				//1단계 - JDBC 드라이버 로드
				try {
					Connection conn = DriverManager.getConnection(host,user,pass);
					
					//2단계 
					Statement stmt = conn.createStatement();
					
					//3단계 - SQL실행
					String sql = "INSERT INTO `user1` VALUES ('J101', '김유신', '1990-01-21', '010-1234-1001', 23)";
					stmt.executeUpdate(sql);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				//3단계
				//4단계
				//5단계
				//6단계
	}
}
