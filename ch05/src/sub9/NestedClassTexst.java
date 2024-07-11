package sub9;

import sub9.Outer.Inner;
/*
 * 날짜 : 2024/07/11
 * 이름 : 강중원
 * 내용 : 중첩클래스 실습하기
 */
class Outer{
	private int x;
	
	public Outer(int x) {
		this.x = x;
	}
	public void show() {
		System.out.println("Outer x : " + x);
	}
	class Inner{
		private int x;
		
		public Inner(int x) {
			this.x = x;
		}
		public void show() {
			System.out.println("Inner x : " + x);
		}
	}
}
interface Person{
	public void hello();
}

public class NestedClassTexst {
	public static void main(String[] args) {
		//외부 객체 생성
		Outer out = new Outer(1);
		out.show();
		
		//내부 객체 생성
		Inner inn = out.new Inner(2);
		inn.show();
		
		//익명객체 실습 - 인터페이스를 클래스 구현없이 바로 new 생성한 객체
		Person P = new Person() {
			@Override
			public void hello() {
				System.out.println("Person hello...");
			}
		};
		P.hello();
	}
}
