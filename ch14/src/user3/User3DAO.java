package user3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class User3DAO {
	private static User3DAO instance = new User3DAO();
	public static User3DAO getInstance() {
		return instance;
	}
	private User3DAO() {
		
	}
	
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	public void insertUser(User3VO vo) {
		String sql = "INSERT INTO `user3` values (?,?,?,?,?)";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getBirth());
			psmt.setString(4, vo.getHp());
			psmt.setString(5, vo.getAddr());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public User3VO selectUser(String uid) {
		User3VO vo = new User3VO();
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "Select * from `user3` where `uid` = ?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			ResultSet rs = pstmt.executeQuery();
			
			//조회 결과가 1또는 0이기 때문에 IF문으로 처리
			if(rs.next()) {
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setHp(rs.getString(4));
				vo.setAddr(rs.getString(5));
			}
			rs.close();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	public List<User3VO> selectUsers() {
		List<User3VO> user3s = new ArrayList<>();
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "Select * from `user3`";
			
			//2단계 - SQL실행 객체(PreparedStatement) 생성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//3단계 - SQL 실행
			ResultSet rs = pstmt.executeQuery(sql);
			//4단계 - ResultSet 결과 처리
			while(rs.next()) {
				User3VO vo = new User3VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setHp(rs.getString(4));
				vo.setAddr(rs.getString(5));
				user3s.add(vo);
			}
			
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user3s;
	}
	public int updateUser(User3VO vo) {
		
		String sql = "update `user3` set `name` = ? , `birth` = ? , `hp` = ? , `age` = ? where `uid` = ?";
		int result = 0;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getBirth());
			pstmt.setString(3, vo.getHp());
			pstmt.setString(4, vo.getAddr());
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
		String sql = "Delete from `user3` where `uid` = ?";
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
