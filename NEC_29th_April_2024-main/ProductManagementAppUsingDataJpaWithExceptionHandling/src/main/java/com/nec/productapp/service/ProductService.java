package com.nec.productapp.service;

import java.util.List;

import com.nec.productapp.entity.Product;

public interface ProductService {
	public abstract String addProduct(Product product);

	public abstract Product updateProduct(Product product);

	public abstract String deleteProduct(int productId);

	public abstract Product getProduct(int productId);

	public abstract List<Product> getProductsByCategory(String productCategory);

	public abstract List<Product> getAllProducts();

	public abstract List<Product> getAllProductsBetweenPrice(int intialPrice, int finalPrice);

}
