package com.jsplec.bbs.dto;

public class SDto {
	int product_id;
	String product_name;
	int product_price;
	int product_stock;
	int product_image;
	String product_category;
	String product_brand;
	int product_size;
	String product_info;
	
	
	public SDto() {
		// TODO Auto-generated constructor stub
	}


	public SDto(int product_id, String product_name, int product_price, int product_stock, String product_category,
			String product_brand, int product_size, String product_info) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_stock = product_stock;
		this.product_category = product_category;
		this.product_brand = product_brand;
		this.product_size = product_size;
		this.product_info = product_info;
	}
	
	

	
	



	public SDto(int product_id, String product_name, int product_price, int product_image, String product_brand,
			String product_info) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_image = product_image;
		this.product_brand = product_brand;
		this.product_info = product_info;
	}


	public SDto(int product_id, String product_name, int product_price, int product_image, String product_category,
			String product_brand, String product_info) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_image = product_image;
		this.product_category = product_category;
		this.product_brand = product_brand;
		this.product_info = product_info;
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public int getProduct_price() {
		return product_price;
	}


	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}


	public int getProduct_stock() {
		return product_stock;
	}


	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}


	public String getProduct_category() {
		return product_category;
	}


	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}


	public String getProduct_brand() {
		return product_brand;
	}


	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}


	public int getProduct_size() {
		return product_size;
	}


	public void setProduct_size(int product_size) {
		this.product_size = product_size;
	}


	public String getProduct_info() {
		return product_info;
	}


	public void setProduct_info(String product_info) {
		this.product_info = product_info;
	}


	public int getProduct_image() {
		return product_image;
	}


	public void setProduct_image(int product_image) {
		this.product_image = product_image;
	}
	
	
}
