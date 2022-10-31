package com.jsplec.bbs.com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.SDao;
import com.jsplec.bbs.dto.SDto;

public class SBuyCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//String customer_id =request.getParameter("customer_name");
		//String customer_address = request.getParameter("customer_address");
		//String product_name = request.getParameter("product_name");
		//int product_size = Integer.parseInt( request.getParameter("product_size"));
		//int product_price = Integer.parseInt( request.getParameter("product_price"));
		//int cart_product_quantity = Integer.parseInt(request.getParameter("cart_product_quantity"));
		
		
		
		
		SDao dao = new SDao();
		dao.buy();
	//	SDto dto = dao.buy(customer_name, customer_address, product_name, product_size,product_price, cart_product_quantity);
				
		
		//request.setAttribute("buy_view", dto);
		
		
		//dao.buy(customer_name, customer_address, product_name, product_size,product_price, cart_product_quantity);
		
		
		
		
		
	}

}
