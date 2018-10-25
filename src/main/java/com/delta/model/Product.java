package com.delta.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Product {
	private int productId;
	private String name;
	private double price;
	private LocalDateTime buyingDate;
	private String formatedBuyingDate;
	
	
	public Product(int productId, String name, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	@JsonIgnore // ignore works on getter methods
	public LocalDateTime getBuyingDate() {
		return buyingDate;
	}
	public String getFormatedBuyingDate() {
		return formatedBuyingDate;
	}
	public void setFormatedBuyingDate(String formatedBuyingDate) {
		this.formatedBuyingDate = formatedBuyingDate;
	}
	public void setBuyingDate(LocalDateTime buyingDate) {
		this.buyingDate = buyingDate;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", buyingDate=" + buyingDate
				+ ", formatedBuyingDate=" + formatedBuyingDate + "]";
	}
	
	
	
	
	
	
	

}
