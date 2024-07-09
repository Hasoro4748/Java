package sub2;

public class Account {
	//Account 객체 생성과 초기화
	private String bank = "";
	private String acc = "";
	private String name = "";
	private int balance = 0;
	
	public Account(String bank, String acc, String name, int balance) {
		this.bank = bank;
		this.acc = acc;
		this.balance = balance;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	
	public void deposit(int m) {
		balance += m;
	}
	public void withdraw(int m) {
		balance -= m;
	}
	public void show() {
		System.out.println("---------------------------");
		System.out.println("은행명 : " + bank);
		System.out.println("계좌번호 : " + acc);
		System.out.println("입금주 : " + name);
		System.out.println("현재잔액 : " + balance);
		System.out.println("---------------------------");
	}
}
