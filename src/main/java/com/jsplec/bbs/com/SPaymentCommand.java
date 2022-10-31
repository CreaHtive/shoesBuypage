package com.jsplec.bbs.com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.SDao;

public class SPaymentCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		String customer_id =request.getParameter("customer_id");
		String product_id = request.getParameter("product_id");
		int order_quantity = Integer.parseInt(request.getParameter("order_quantity"));
		int order_price = Integer.parseInt(request.getParameter("order_price"));
		
		
		
		
		SDao dao = new SDao();
		
		dao.payment(customer_id, product_id, order_quantity, order_price);

	}

}
