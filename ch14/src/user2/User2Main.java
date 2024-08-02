package user2;

import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 2024/07/29
 * 이름 : 강중원
 * 내용 : CRUD 실습
 */
public class User2Main {
	public static void main(String[] args) {
		System.out.println("--------------------------------");
		System.out.println("회원 관리 매니저 v1.0");
		System.out.println("--------------------------------");
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("종료 : 0, 입력 : 1, 조회 : 2, 검색 : 3, 수정 : 4, 삭제 : 5");
			System.out.print("선택> ");
			
			int answer = scan.nextInt();
			
			if(answer == 0){
				break;
			}else if(answer == 1) {
				System.out.print("아이디 입력 : ");
				String uid = scan.next();
				
				System.out.print("이름 입력 : ");
				String name = scan.next();

				System.out.print("생년월일 입력 : ");
				String birth = scan.next();

				System.out.print("주소 입력 : ");
				String addr = scan.next();
				
				User2DAO dao = User2DAO.getInstance();
				User2VO vo = new User2VO(uid, name, birth, addr);
				dao.insertUser(vo);
				System.out.println("입력 완료...");
			}else if(answer == 2) {
				User2DAO dao = User2DAO.getInstance();
				List<User2VO> users = dao.selectUsers();
				
				for(User2VO user : users) {
					System.out.println(user);
				}
				
			}else if(answer == 3) {
				System.out.print("검색 아이디 입력 : ");
				String uid = scan.next();
				
				User2DAO dao = User2DAO.getInstance();
				System.out.println(dao.selectUser(uid));
			}else if(answer == 4) {
				User2VO user = new User2VO();
				System.out.print("수정 회원 아이디 입력 : ");
				user.setUid(scan.next());
				
				System.out.print("수정 회원 이름 입력 : ");
				user.setName(scan.next());
				
				System.out.print("수정 회원 생년월일 입력 : ");
				user.setBirth(scan.next());
				
				System.out.print("수정 회원 주소 입력 : ");
				user.setAddr(scan.next());

				int result = User2DAO.getInstance().updateUser(user);
				
				if(result > 0) {
					System.out.println("수정완료....");
				}else {
					System.out.println("수정 할 회원 아이디가 없습니다.");
				}
			}else if(answer == 5) {
				System.out.print("삭제 회원 아이디 입력 : ");
				String uid = scan.next();
				
				int result = User2DAO.getInstance().deleteUser(uid);
				
				if(result > 0) {
					System.out.println("삭제 완료...");
				}else {
					System.out.println("삭제 할 회원 아이디가 없습니다.");
				}
				
			}
		}//end while
		scan.close();
		System.out.println("프로그램 종료...");
	}
}
