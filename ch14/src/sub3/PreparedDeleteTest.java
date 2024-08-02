package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2024/07/29
 * 이름 : 강중원
 * 내용 : PreparedStatement 실습
 */
public class PreparedDeleteTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			//1단계 - 데이터베이스 접속 
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			String sql = "Delete from `user2` where `uid` = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "J101");	
			//2단계 - SQL실행 객체(PreparedStatement) 생성
			pstmt.executeUpdate();
			//3단계 - SQL 실행
			//4단계 - ResultSet 결과 처리
			//5단계 - 데이터베이스 종료
			conn.close();
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
