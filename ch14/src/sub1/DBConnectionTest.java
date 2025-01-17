package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 날짜 : 2024/07/29
 * 이름 : 강중원
 * 내용 : JDBC 접속 테스트 실습
 */
public class DBConnectionTest {
	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		
		
		//1단계 - JDBC 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터 베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공!");
			}else {
				System.out.println("데이터베이스 접속 실패!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//3단계
		//4단계
		//5단계
		//6단계
	}
}
