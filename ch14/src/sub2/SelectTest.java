package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		//결과처리 리스트 생성
		List<User1VO> user1s = new ArrayList<>();
		
		try {
			//1단계 - 데이터베이스 접속'
			Connection conn = DriverManager.getConnection(host, user, pass);
			//2단계 - SQL실행 객체 생성
			Statement stmt = conn.createStatement();
			//3단계 - SQL실행 
			String sql = "select * from `user1`";
			ResultSet rs = stmt.executeQuery(sql);
			//4단계 - ResultSet 결과처리
			while(rs.next()) {
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String birth = rs.getString(3);
				String hp = rs.getString(4);
				int age = rs.getInt(5);
				//System.out.println(uid + ", " + name +", " + birth +", "+hp+", "+age);
				User1VO vo = new User1VO();
				vo.setUid(uid);
				vo.setName(name);
				vo.setBirth(birth);
				vo.setHp(hp);
				vo.setAge(age);
				
				user1s.add(vo);

			}
			//5단계 - 접속종료
			
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//리스트 출력
		for(User1VO vo : user1s) {
			System.out.println(vo);
		}
		System.out.println("Select 완료...");
	}
}
