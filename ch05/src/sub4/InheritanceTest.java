package sub4;
/*
 * 날짜 : 2024/07/09
 * 이름 : 김철학
 * 내용 : 클래스 상속 실습하기
 */
public class InheritanceTest {
	public static void main(String[] args) {
		Sedan sonata = new Sedan("세단","검은색",0, 2000);
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 1000);
		bongo.show();
		
		//StockAccount 실습(bank, acc, name, balance, stock, amount, price)
		StockAccount kb = new StockAccount("KB증권","101-11-1001","홍길동",10000, "삼성전자", 0, 0);
		kb.deposit(1000000);
		kb.buy(20, 50000);	//amount, price
		kb.sell(10, 50000);	//amount, price
		kb.show();
		
		Doctor dt = new Doctor("김유신",33,"소아과");
		Engineer en = new Engineer("김춘추",29,"소프트웨어");
		
		dt.work();
		en.work();
	}
}
