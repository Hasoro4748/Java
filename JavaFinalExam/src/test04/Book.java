package test04;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	public Book(String title, String author, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		isBorrowd =false;
	}
	public void borrowBook() {
		if(!isBorrowd) {
			isBorrowd = true;
			System.out.println("도서 대출 : " + getTitle());
		}else {
			System.out.println(getTitle() + " 이미 대출됨");
		}
		
	}
	public void returnBook() {
		if(isBorrowd) {
			System.out.println("도서 반납 : " + getTitle());
			isBorrowd = false;
		}else {
			System.out.println(getTitle() + " 이미 반납됨");
		}
	}
	public void getBookInfo() {
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("ISBN : " + isbn);
		if(!isBorrowd) {
			System.out.println("대출여부 : 가능");
		}else {
			System.out.println("대출여부 : 불가능");
		}
		
	}
	public String getTitle() {
		return title;
	}
	
}
