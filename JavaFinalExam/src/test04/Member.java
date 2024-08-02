package test04;

public class Member {
	private String name;
	private String memberId;
	private Book borrowedBood;
	public Member(String name, String memberId) {
		super();
		this.name = name;
		this.memberId = memberId;
		borrowedBood = null;
	}
	public void borrowBook(Book book) {
		book.borrowBook();
		borrowedBood = book;
		
	}
	public void returnBook(Book book) {
		book.returnBook();
		borrowedBood = null;
	}
	public void getMemberInfo() {
		System.out.println("회원명 : " + name);
		System.out.println("아이디 : " + memberId);
		if(borrowedBood != null) {
			System.out.println("대출한 도서 : " + borrowedBood.getTitle());
		}else {
			System.out.println("대출한 도서 : " + "없음");
		}
		
	}
}
