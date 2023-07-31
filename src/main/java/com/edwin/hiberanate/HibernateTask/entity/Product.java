package com.edwin.hiberanate.HibernateTask.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@Column(name = "PID")
	private int productId;
	@Column (name = "Pname")
	private String productName;
	@Column (name = "price")
	private double productPrice;
	@Column (name = "Qty")
	private int quantity;
	@Column (name ="Tax")
	private double productTax;
	@Column (name ="TotalPrice")
	private double totalPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double producrPrice) {
		this.productPrice = producrPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getProductTax() {
		return productTax;
	}
	public void setProductTax(double productTax) {
		this.productTax = productTax;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", quantity=" + quantity + ", productTax=" + productTax + ", totalPrice=" + totalPrice + "]";
	}
	
	
	
}
