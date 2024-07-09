package sub1;

class Account {
	String bank = "";
	String acc = "";
	String name = "";
	int balance = 0;
	
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
