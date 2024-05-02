package com.nec.productapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nec.productapp.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

	public abstract List<Product> findByProductCategory(String productCategory);
	
	public abstract List<Product> findByProductPriceBetween(int intialPrice,int finalPrice);

	
//	public abstract List<Product> getProductsByCategory(String productCategory);
//
//	public abstract List<Product> getAllProducts();
//
//	public abstract List<Product> getAllProductsBetweenPrice(int intialPrice,int finalPrice);
}
