package sub4;

//클래스 정의
public class Car {
	
	//속성(멤버변수) 속성은 private
	protected String name;
	protected String color;
	protected int speed;
	
	//클래스변수(정적변수)
	public static int count;
	
	//생성자(Constructor) : 캡슐화된 클래스 속성을 초기화하는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	public static int getTotalCount() {
		return count;
	}
	
	//Setter : 캡슐화된 속성에 대한 추가적인 수정을 위한 메서드
	public void setColor(String color) {
		this.color = color;
	}
	//Getter 
	public String getColor() {
		return color;
	}
	
	
	//기능(멤버 메서드)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("차량속도 : " + this.speed);
	}
	
}
