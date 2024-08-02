package user5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class User5DAO {
	private static User5DAO instance = new User5DAO();
	public static User5DAO getInstance() {
		return instance;
	}
	private User5DAO() {
		
	}
	
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	public void insertUser(User5VO vo) {
		String sql = "INSERT INTO `user5` values (?,?,?,?,?)";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getseq());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getGender()+"");
			psmt.setInt(4, vo.getAge());
			psmt.setString(5, vo.getAddr());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public User5VO selectUser(String seq) {
		User5VO vo = new User5VO();
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "Select * from `user5` where `seq` = ?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, seq);
			ResultSet rs = pstmt.executeQuery();
			
			//조회 결과가 1또는 0이기 때문에 IF문으로 처리
			if(rs.next()) {
				vo.setseq(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setGender(rs.getString(3).charAt(0));
				vo.setAge(rs.getInt(4));
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
	public List<User5VO> selectUsers() {
		List<User5VO> user5s = new ArrayList<>();
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "Select * from `user5`";
			
			//2단계 - SQL실행 객체(PreparedStatement) 생성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//3단계 - SQL 실행
			ResultSet rs = pstmt.executeQuery(sql);
			//4단계 - ResultSet 결과 처리
			while(rs.next()) {
				User5VO vo = new User5VO();
				vo.setseq(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setGender(rs.getString(3).charAt(0));
				vo.setAge(rs.getInt(4));
				vo.setAddr(rs.getString(5));
				user5s.add(vo);
			}
			
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user5s;
	}
	public int updateUser(User5VO vo) {
		
		String sql = "update `user5` set `name` = ? , `gender` = ? , `age` = ?, `addr` = ? where `seq` = ?";
		int result = 0;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getGender()+"");
			pstmt.setInt(3, vo.getAge());
			pstmt.setString(4, vo.getAddr());
			pstmt.setString(5, vo.getseq());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	public int deleteUser(String seq) {
		int result = 0;
		String sql = "Delete from `user5` where `seq` = ?";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, seq);
			
			result = pstmt.executeUpdate();
			
			
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
