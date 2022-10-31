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
			
			public void write(String cId,String pId) {
				Connection connection = null;
				PreparedStatement preparedStatement = null;
				
				try {
					connection = dataSource.getConnection();
					
					String query = "insert into  (customer_id, product_id, order_date) values(?,?,now())";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1,cId);
					preparedStatement.setString(2,pId);
					
					
					preparedStatement.executeUpdate();
				
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(preparedStatement != null) preparedStatement.close();
						if(connection != null) connection.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
					
				}
				
			}//입력
}//---------------------------------------------
