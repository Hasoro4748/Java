package user1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class User1DAO {
	private static User1DAO instance = new User1DAO();
	public static User1DAO getInstance() {
		return instance;
	}
	private User1DAO() {
		
	}
	
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	public void insertUser(User1VO vo) {
		String sql = "INSERT INTO `user1` values (?,?,?,?,?)";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getBirth());
			psmt.setString(4, vo.getHp());
			psmt.setInt(5, vo.getAge());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public User1VO selectUser(String uid) {
		User1VO vo = new User1VO();
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "Select * from `user1` where `uid` = ?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			ResultSet rs = pstmt.executeQuery();
			
			//조회 결과가 1또는 0이기 때문에 IF문으로 처리
			if(rs.next()) {
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setHp(rs.getString(4));
				vo.setAge(rs.getInt(5));
			}
			rs.close();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	public List<User1VO> selectUsers() {
		List<User1VO> user1s = new ArrayList<>();
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "Select * from `user1`";
			
			//2단계 - SQL실행 객체(PreparedStatement) 생성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//3단계 - SQL 실행
			ResultSet rs = pstmt.executeQuery(sql);
			//4단계 - ResultSet 결과 처리
			while(rs.next()) {
				User1VO vo = new User1VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setHp(rs.getString(4));
				vo.setAge(rs.getInt(5));
				user1s.add(vo);
			}
			
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user1s;
	}
	public int updateUser(User1VO vo) {
		
		String sql = "update `user1` set `name` = ? , `birth` = ? , `hp` = ? , `age` = ? where `uid` = ?";
		int result = 0;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getBirth());
			pstmt.setString(3, vo.getHp());
			pstmt.setInt(4, vo.getAge());
			pstmt.setString(5, vo.getUid());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	public int deleteUser(String uid) {
		int result = 0;
		String sql = "Delete from `user1` where `uid` = ?";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			
			result = pstmt.executeUpdate();
			
			
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
