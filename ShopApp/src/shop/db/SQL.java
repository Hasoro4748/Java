package shop.db;

public class SQL {
	//customer
	public static final String INSERT_CUSTOMER = "insert into `customer` set "
											   + "`custId` = ?, "
											   + "`name` = ?, "
											   + "`hp` = ?, "
											   + "`addr` = ?, "
											   + "`rdate` = NOW()";
	public static final String SELECT_CUSTOMER = "select * from `customer` where `custid` = ?";
	public static final String SELECT_CUSTOMERS = "select * from `customer`";
	public static final String UPDATE_CUSTOMER = "update `customer` set "
											   + "`name` = ?, "
											   + "`hp` = ?, "
											   + "`addr` = ? "
											   + "where `custid` = ? ";
	public static final String DELETE_CUSTOMER = "delete from `customer` where `custid` = ?";
	
	
	//order
	public static final String SELECT_ORDER = "select * from `order` where `orderNo`=?";
	public static final String SELECT_ORDERS = "select * from `order`";
	public final static String INSERT_ORDER = "INSERT INTO `Order` SET "
											+ "`orderId`=?," 
											+ "`orderProduct`=?," 
											+ "`orderCount`=?," 
											+ "`orderDate`=NOW()";
	
	//product
	public static final String INSERT_PRODUCT = "inset into `product` set "
											  + "`prodNo` = ?, "
											  + "`prodName` = ?, "
											  + "`stock` = ?, "
											  + "`price` = ?, "
											  + "`company` = ?";
	public static final String SELECT_PRODUCT = "select * from `product` where `prodNo` = ? ";
	public static final String SELECT_PRODUCTS = "select * from `product`";
	public static final String UPDATE_PRODUCT = "UPDATE `product` set "
			  								  + "`prodName` = ?, "
			  								  + "`stock` = ?, "
			  								  + "`price` = ?, "
			  								  + "`company` = ? "
			  								  + "where `prodNo` = ? ";
	public static final String DELETE_PRODUCT = "delete from `product` where `prodNo` = ? ";
	
}
