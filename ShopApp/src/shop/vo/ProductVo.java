package shop.vo;

public class ProductVo {
	private String prodNo;
	private String prodName;
	private String stock;
	private String price;
	private String company;
	public ProductVo() {}
	public String getProdNo() {
		return prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "ProductVo [prodNo=" + prodNo + ", prodName=" + prodName + ", stock=" + stock + ", price=" + price
				+ ", company=" + company + "]";
	}
	public ProductVo(String prodNo, String prodName, String stock, String price, String company) {
		super();
		this.prodNo = prodNo;
		this.prodName = prodName;
		this.stock = stock;
		this.price = price;
		this.company = company;
	}
	
}
