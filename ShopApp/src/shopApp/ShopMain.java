package shopApp;

import java.util.List;
import java.util.Scanner;

import shop.dao.CustomerDAO;
import shop.dao.OrderDAO;
import shop.dao.ProductDAO;
import shop.vo.CustomerVO;
import shop.vo.OrderVO;
import shop.vo.ProductVo;

/*
 * 날짜 : 2024/07/30
 * 이름 : 강중원
 * 내용 : Shop 미니 프로젝트 실습하기
 */
public class ShopMain {
	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("쇼핑몰에 오신것을 환영합니다.");
		System.out.println("----------------------");
		
		Scanner sc = new Scanner(System.in);
		
		CustomerDAO customerDAO = CustomerDAO.getInstance();
		OrderDAO orderDAO = OrderDAO.getInstance();
		
		//로그인 사용자 객체
		CustomerVO loginedCustomer = null;
		
		while(true) {
			if(loginedCustomer == null) {
				System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 주문하기:4");
				
			}else {
				System.out.println("종료:0, 로그아웃:1, 주문현황:2, 상품목록:3, 주문하기:4");
			}
			System.out.print("선택>");
			
			
			int answer = sc.nextInt();
			
			if(answer == 0) {
				break;
			}else if(answer == 1) {
				//로그인
				if(loginedCustomer == null) {
					System.out.print("아이디 입력 : ");
					String custId = sc.next();
					
					loginedCustomer = customerDAO.selectCustomer(custId);
					if(loginedCustomer != null) {
						System.out.println(loginedCustomer.getName() + "님 어서오세요.");
					}else {
						System.out.println("일치하는 회원이 없습니다.");
					}
				}else {
					System.out.println(loginedCustomer.getName() + "님 안녕히 가세요.");
					loginedCustomer = null;
				}
				
				
			}else if(answer == 2) {
				if(loginedCustomer == null) {
					//회원가입
					CustomerVO customerVO = new CustomerVO();
					System.out.println("아이디 입력 : ");
					customerVO.setCustId(sc.next());
					System.out.println("이름 입력 : ");
					customerVO.setName(sc.next());
					System.out.println("휴대폰 입력 : ");
					customerVO.setHp(sc.next());
					System.out.println("주소 입력 : ");
					customerVO.setAddr(sc.next());

					int result = customerDAO.insertCustomer(customerVO);

					if(result > 0) {
						System.out.println("성공적으로 회원가입이 되었습니다.");
					}else {
						System.out.println("회원가입 실패.");
					}
				}else {
					//주문 현황(주문번호, 상품번호, 상품명, 주문수량, 주문자 이름 , 주문일자)
					//List<OrderVO> orders = orderDAO.selectOrders();
					
					System.err.println();
				}
				
				
			}else if(answer == 3) {
				//상품목록
				ProductDAO dao = ProductDAO.getInstance();
				List<ProductVo> productlist = dao.selectProducts();
				for(ProductVo vo : productlist) {
					System.out.println(vo);
				}
				
			}else if(answer == 4) {
				//주문하기
				if(loginedCustomer == null) {
					System.out.println("로그인 먼저 하십시오");
					continue;
				}
				OrderVO orderVO = new OrderVO();
				orderVO.setOrderId(loginedCustomer.getCustId());
				
				System.out.print("주문 상품 번호 입력 : ");
				orderVO.setOrderProduct(sc.nextInt());
				
				System.out.print("주문 상품 개수 입력 : ");
				orderVO.setOrderCount(sc.nextInt());
				
				int result = orderDAO.insertOrder(orderVO);
				if(result > 0) {
					System.out.println("성공적으로 주문이 되었습니다.");
				}else {
					System.out.println("주문 실패.");
				}
				
			}
		}
		
		sc.close();
		
		System.out.println("안녕히 가십시요.");
	}
}
