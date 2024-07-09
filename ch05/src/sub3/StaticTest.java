package sub3;


/*
 * 날짜 : 2024/07/09
 * 이름 : 강중원
 * 내용 : 클래스 변수, 메서드 실습하기
 */
class Increment{
	private int num1;
	private static int num2;
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}

public class StaticTest {
	
	public static void main(String[] args) {
		
		//static 
		//Increment inc1 = new Increment();
		//Increment inc2 = new Increment();
		//Increment inc3 = new Increment();
		
		//Car sonata = new Car("소나타", "흰색", 0);
		//Car avante = new Car("아반테", "검정", 0);
		
		System.out.println("전체 차량 수 : " + Car.getTotalCount());
		
		//싱글톤 객체의 주요 사용법 .getInstance()
		Calc c1 = Calc.getInstance();
		
		int r1 = c1.plus(1,2);
		int r2 = c1.minus(1,2);
		int r3 = c1.multi(3,2);
		int r4 = c1.div(4,2);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
	}
	
}
