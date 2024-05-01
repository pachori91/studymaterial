package com.nec.productapp.repository;

import java.util.List;

import com.nec.productapp.entity.Product;

public interface ProductRepo {
	public abstract String addProduct(Product product);

	public abstract String updateProduct(Product product);

	public abstract String deleteProduct(int productId);

	public abstract Product getProduct(int productId);

	public abstract List<Product> getProductsByCategory(String productCategory);

	public abstract List<Product> getAllProducts();

	public abstract List<Product> getAllProductsBetweenPrice(int intialPrice,int finalPrice);
}
