package com.nec.productapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "products_info") // select pid from products_info; MYSQL
public class Product { // select productId from Product JPQL
	@Id
	@Column(name = "pid")
	// @GeneratedValue
	@Min(value = 100, message = "ProductId cannot be below 100...")
	private int productId;
	@NotEmpty(message = "Productname cannot be empty or null")
	private String productName;
	@Min(value = 1000, message = "Product Price must be above 1000..")
	@Max(value = 100000, message = "Product Price must be below 100000..")
	private int productPrice;
	@Size(min=3,max=15,message="category length must be between (3,15)")
	private String productCategory;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int productPrice, String productCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}

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

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

}
