package user4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class User4DAO {
	private static User4DAO instance = new User4DAO();
	public static User4DAO getInstance() {
		return instance;
	}
	private User4DAO() {
		
	}
	
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	public void insertUser(User4VO vo) {
		String sql = "INSERT INTO `user4` values (?,?,?,?,?,?)";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, ""+vo.getGender());
			psmt.setInt(4, vo.getAge());
			psmt.setString(5, vo.getHp());
			psmt.setString(6, vo.getAddr());
			
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public User4VO selectUser(String uid) {
		User4VO vo = new User4VO();
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "Select * from `user4` where `uid` = ?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			ResultSet rs = pstmt.executeQuery();
			
			//조회 결과가 1또는 0이기 때문에 IF문으로 처리
			if(rs.next()) {
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setGender(rs.getString(3).charAt(0));
				vo.setAge(rs.getInt(4));
				vo.setHp(rs.getString(5));
				vo.setHp(rs.getString(6));
			}
			rs.close();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	public List<User4VO> selectUsers() {
		List<User4VO> user4s = new ArrayList<>();
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "Select * from `user4`";
			
			//2단계 - SQL실행 객체(PreparedStatement) 생성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//3단계 - SQL 실행
			ResultSet rs = pstmt.executeQuery(sql);
			//4단계 - ResultSet 결과 처리
			while(rs.next()) {
				User4VO vo = new User4VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setGender(rs.getString(3).charAt(0));
				vo.setAge(rs.getInt(4));
				vo.setHp(rs.getString(5));
				vo.setAddr(rs.getString(6));
				user4s.add(vo);
			}
			
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user4s;
	}
	public int updateUser(User4VO vo) {
		
		String sql = "update `user4` set `name` = ? , `gender` = ? , `age` = ? , `hp` = ? , `addr` = ? where `uid` = ?";
		int result = 0;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, ""+vo.getGender());
			pstmt.setInt(3, vo.getAge());
			pstmt.setString(4, vo.getHp());
			pstmt.setString(5, vo.getAddr());
			pstmt.setString(6, vo.getUid());
			
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
		String sql = "Delete from `user4` where `uid` = ?";
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
