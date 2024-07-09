package sub2;

public class Book {
	private String title;	//책 제목
	private String author;	//저자 이름
	private String isbn;	//ISBN번호
	private int availableCopies;	//이용 가능한 복사본 수
	
	public Book(String title, String author, String isbn, int avail) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = avail;
	}
	public boolean borrowBook() {
		if(availableCopies > 0) {
			availableCopies -= 1;
			return true;
		}
		else {
			return false;
		}
	}
	public void returnBook() {
		availableCopies++;
	}
	public void show() {
		System.out.println("책 제목 : " + title);
		System.out.println("저자 이름 : " + author);
		System.out.println("ISBN 번호 : " + isbn);
		System.out.println("이용 가능한 복사본 수 : " + availableCopies);
	}
	
	//Setter 와 Getter
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
}
