package test10;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNo;
	private Customer customer;
	private List<Product> products;
	private int totalAmount;
	public Order(int orderNo, Customer customer) {
		super();
		this.orderNo = orderNo;
		this.customer = customer;
		products = new ArrayList<>();
		totalAmount = 0;
	}
	public void addProduct(Product pd) {
        products.add(pd);
        totalAmount += pd.getPrice();
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public List<Product> getProducts() {
		return products;
	}
	public int getTotalAmount() {
        return totalAmount;
    }
}
