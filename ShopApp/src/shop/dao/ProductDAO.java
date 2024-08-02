package shop.dao;

import java.util.ArrayList;
import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.ProductVo;

public class ProductDAO extends DBHelper{
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	public int insertProduct(ProductVo vo) {
		int count = 0;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_PRODUCT);
			psmt.setString(1, vo.getProdNo());
			psmt.setString(2, vo.getProdName());
			psmt.setString(3, vo.getStock());
			psmt.setString(4, vo.getPrice());
			psmt.setString(5, vo.getCompany());
			
			count = psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	public ProductVo selectProduct(String prodNo) {
		ProductVo vo = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setString(1, prodNo);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new ProductVo();
				vo.setProdNo(rs.getString(1));
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getString(3));
				vo.setPrice(rs.getString(4));
				vo.setCompany(rs.getString(5));
			}
			
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	public List<ProductVo> selectProducts(){
		List<ProductVo> prodlist = new ArrayList<>();
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCTS);
			rs = psmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				ProductVo vo = new ProductVo();
				vo.setProdNo(rs.getString(1));
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getString(3));
				vo.setPrice(rs.getString(4));
				vo.setCompany(rs.getString(5));
				prodlist.add(vo);
			}
			closeAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return prodlist;
	}
	
}
