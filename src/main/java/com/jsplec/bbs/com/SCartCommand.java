package com.jsplec.bbs.com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.SDao;

public class SCartCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		
		String customer_id = request.getParameter("customer_id"); //이거말고 session으로 불러오기
		int product_id = Integer.parseInt(request.getParameter("product_id")) ;
		int cart_product_quantity = Integer.parseInt(request.getParameter("cart_product_quantity")) ; //콤보박스로 갯수 받아옴
		
		SDao dao = new SDao();
		
		dao.cart(customer_id, product_id, cart_product_quantity );
		
		
		
		
		
		
		
	}

}
