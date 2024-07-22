package sub1;

public class Apple {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	public void show() {
		System.out.println("country : " + country);
		System.out.println("price : " + price);
	}
	
	@Override
	public String toString() {
		return "country = " + country + ", price = " + price;
	}
}
