package test07;

public class Clothes extends Product{
	public Clothes(String prodId, String prodName, int price, int quantity, String size) {
		super(prodId, prodName, price, quantity);
		this.size = size;
		// TODO Auto-generated constructor stub
	}
	private String size;
	
	@Override
	public void printProductInfo() {
		// TODO Auto-generated method stub
		super.printProductInfo();
		System.out.println("사이즈 : " +size);
	}
	
}
