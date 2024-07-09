package sub3;

public class Calc {
	//싱글톤 객체
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	//생성자를 막는 역할
	//new Calc()로 생성자를 생성 하지 못함
	private Calc() {}
	
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
}
