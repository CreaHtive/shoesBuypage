package com.jsplec.bbs.com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.SDao;

public class SCartCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		
		String customer_id = "a"; //이거말고 session으로 불러오기
		int product_id = Integer.parseInt(request.getParameter("id")) ;
		
		
		int cart_product_quantity =  1;                //Integer.parseInt(request.getParameter("cart_product_quantity")) ; 
		
														//콤보박스로 갯수 받아와야하는데 모르겠음
		
		SDao dao = new SDao();
		
		dao.cart(customer_id, product_id, cart_product_quantity );
		
		
		
		
		
		
		
	}

}
