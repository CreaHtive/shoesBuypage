package com.jsplec.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


import com.jsplec.bbs.dto.SDto;



public class SDao {
	
DataSource dataSource;
	
	public SDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/semi_shoes");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//전체 검색
	public ArrayList<SDto> list(){
		ArrayList<SDto> dtos = new ArrayList<SDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select product_id,product_name,product_price,product_category,product_brand,product_info,product_image from product";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int pId = resultSet.getInt("product_id");
				String pName = resultSet.getString("product_name");
				int pPrice = resultSet.getInt("product_price");
				String pCategory = resultSet.getString("product_category");
				String pBrand= resultSet.getString("product_brand");
				String pInfo = resultSet.getString("product_info");
				int pImage = resultSet.getInt("product_image");
				
				SDto dto = new SDto(pId, pName, pPrice, pImage, pCategory, pBrand, pInfo);
				dtos.add(dto);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet !=null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	} //ALLlist
	
	//남성 검색
	public ArrayList<SDto> menList(){
		ArrayList<SDto> dtos = new ArrayList<SDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select product_id,product_name,product_price,product_category,product_brand,product_info,product_image from product where product_category = 'men'";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int pId = resultSet.getInt("product_id");
				String pName = resultSet.getString("product_name");
				int pPrice = resultSet.getInt("product_price");
				String pCategory = resultSet.getString("product_category");
				String pBrand= resultSet.getString("product_brand");
				String pInfo = resultSet.getString("product_info");
				int pImage = resultSet.getInt("product_image");
				
				SDto dto = new SDto(pId, pName, pPrice, pImage, pCategory, pBrand, pInfo);
				dtos.add(dto);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet !=null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	} //menlist
	
	//여성 검색
		public ArrayList<SDto> womenList(){
			ArrayList<SDto> dtos = new ArrayList<SDto>();
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			
			try {
				connection = dataSource.getConnection();
				
				String query = "select product_id,product_name,product_price,product_category,product_brand,product_info,product_image from product where product_category = 'women'";
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					int pId = resultSet.getInt("product_id");
					String pName = resultSet.getString("product_name");
					int pPrice = resultSet.getInt("product_price");
					String pCategory = resultSet.getString("product_category");
					String pBrand= resultSet.getString("product_brand");
					String pInfo = resultSet.getString("product_info");
					int pImage = resultSet.getInt("product_image");
					
					SDto dto = new SDto(pId, pName, pPrice, pImage, pCategory, pBrand, pInfo);
					dtos.add(dto);
					
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(resultSet !=null) resultSet.close();
					if(preparedStatement != null) preparedStatement.close();
					if(connection != null) connection.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			return dtos;
		} //womenlist
	
		//키즈 검색
			public ArrayList<SDto> kidsList(){
				ArrayList<SDto> dtos = new ArrayList<SDto>();
				Connection connection = null;
				PreparedStatement preparedStatement = null;
				ResultSet resultSet = null;
				
				try {
					connection = dataSource.getConnection();
						
					String query = "select product_id,product_name,product_price,product_category,product_brand,product_info,product_image from product where product_category = 'kids'";
					preparedStatement = connection.prepareStatement(query);
					resultSet = preparedStatement.executeQuery();
					
					while(resultSet.next()) {
						int pId = resultSet.getInt("product_id");
						String pName = resultSet.getString("product_name");
						int pPrice = resultSet.getInt("product_price");
						String pCategory = resultSet.getString("product_category");
						String pBrand= resultSet.getString("product_brand");
						String pInfo = resultSet.getString("product_info");
						int pImage = resultSet.getInt("product_image");
						
						SDto dto = new SDto(pId, pName, pPrice, pImage, pCategory, pBrand, pInfo);
						dtos.add(dto);
							
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						try {
							if(resultSet !=null) resultSet.close();
							if(preparedStatement != null) preparedStatement.close();
							if(connection != null) connection.close();
						}catch(Exception e) {
							e.printStackTrace();
						}
					}
					return dtos;
				} //kidslist
			
			
			
			public SDto contentView(String sbId) {
				SDto dto = null;
				Connection connection = null;
				PreparedStatement preparedStatement = null;
				ResultSet resultSet = null;
				
				try {
					connection = dataSource.getConnection();
					
					String query = "select product_id,product_price,product_name,product_brand,product_image,product_info from product where product_id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setInt(1, Integer.parseInt(sbId));
					resultSet = preparedStatement.executeQuery();
					
					if(resultSet.next()) {
						int pId = resultSet.getInt("product_id");
						String pName = resultSet.getString("product_name");
						String pBrand = resultSet.getString("product_brand");
						int pImage = resultSet.getInt("product_image");
						String pInfo = resultSet.getString("product_info");
						int pPrice = resultSet.getInt("product_price");
						
						
						dto = new SDto(pId, pName, pPrice, pImage, pBrand, pInfo);
						
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(resultSet !=null) resultSet.close();
						if(preparedStatement != null) preparedStatement.close();
						if(connection != null) connection.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				return dto;
			}// detail_view
		
			
			//카트에 구매하기 누르면 임시 정보를 넣어줌
			
			
	public void cart(String customer_id, int product_id, int cart_product_quantity) {	
				
				
				Connection connection = null;
				PreparedStatement preparedStatement = null;
			
			
			try {
				connection = dataSource.getConnection();
				
				String query = "insert into cart (customer_id, product_id, cart_date, cart_product_quantity ) values(?,?,now(),?)";
			
					
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, customer_id);
				preparedStatement.setInt(2, product_id);
				preparedStatement.setInt(3, cart_product_quantity);
				
				preparedStatement.executeUpdate();
				
				
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(preparedStatement != null) preparedStatement.close();
					if(connection != null)connection.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
				
			
	}//주문완료	customer_order에 insert 됨	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		//구매하기 누르면 고객 정보와 제품, 주문내역 띄워줌
			
			
			public SDto buy() {	
				
				SDto dto = null;
				Connection connection = null;
				PreparedStatement preparedStatement = null;
				ResultSet resultSet = null;
				
				try {
					connection = dataSource.getConnection();
					
					String query = "select c.customer_name,c.customer_address,p.product_name,p.product_size,p.product_price, t.cart_product_quantity ";
					String query2 = "from product p, customer c, cart t where c.customer_id = t.customer_id and p.product_id = t.product_id and c.customer_id = ?";
					
					
					preparedStatement = connection.prepareStatement(query+query2);
					
					preparedStatement.setString(1, "a");  //customer_id를 넣어줘야함. session 사용해도 될듯  
					
					
					
					//----------------------------------------------------------------------------------------//
					
					resultSet = preparedStatement.executeQuery();
					
					if(resultSet.next()) {
						
						
						String product_name = resultSet.getString("product_name");
						int product_size = resultSet.getInt("product_size");
						int product_price = resultSet.getInt("product_price");
						String customer_name = resultSet.getString("customer_name");
						String customer_address = resultSet.getString("customer_address");
						int cart_product_quantity = resultSet.getInt("cart_product_quantity");
						
						// c.customer_name로 받아야하는지 customer_name로 받아야하는지 확인!!!
						
						
						
						dto = new SDto(product_name, product_size,product_price, customer_name, customer_address, cart_product_quantity);
						
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(resultSet !=null) resultSet.close();
						if(preparedStatement != null) preparedStatement.close();
						if(connection != null) connection.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				return dto;
			
	}//구매하기		
			
			
			
			
	//구매하기 창에서 수정할 내역은 수정한 다음 결제하기를 누르면 주문이 완료됨		
			
			public void payment(String customer_id, String product_id, int order_quantity, int order_price) {	
				
				
				Connection connection = null;
				PreparedStatement preparedStatement = null;
			
			
			try {
				connection = dataSource.getConnection();
				
				String query = "insert into customer_orders (customer_id,product_id, order_date, order_quantity, order_price ) values(?,?,now(),?,?)";
			
					
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, customer_id);
				preparedStatement.setString(2, product_id);
				preparedStatement.setInt(3, order_quantity);
				preparedStatement.setInt(4, order_price);
				
				preparedStatement.executeUpdate();
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(preparedStatement != null) preparedStatement.close();
					if(connection != null)connection.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
				
			
	}//주문완료	customer_order에 insert 됨	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}//---------------------------------------------
