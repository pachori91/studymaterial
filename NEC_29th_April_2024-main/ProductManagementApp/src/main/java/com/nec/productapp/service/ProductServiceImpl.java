package com.nec.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nec.productapp.entity.Product;
import com.nec.productapp.repository.ProductRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepo repo;
	@Override
	public String addProduct(Product product) {

		return repo.addProduct(product);
	}

	@Override
	public String updateProduct(Product product) {

		return repo.updateProduct(product);
	}

	@Override
	public String deleteProduct(int productId) {

		return repo.deleteProduct(productId);
	}

	@Override
	public Product getProduct(int productId) {

		return repo.getProduct(productId);
	}

	@Override
	public List<Product> getProductsByCategory(String productCategory) {

		return repo.getProductsByCategory(productCategory);
	}

	@Override
	public List<Product> getAllProducts() {

		return repo.getAllProducts();
	}

	@Override
	public List<Product> getAllProductsBetweenPrice(int intialPrice, int finalPrice) {

		return repo.getAllProductsBetweenPrice(intialPrice, finalPrice);
	}

}
