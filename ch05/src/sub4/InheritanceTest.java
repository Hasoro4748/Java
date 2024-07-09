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
	}
}
