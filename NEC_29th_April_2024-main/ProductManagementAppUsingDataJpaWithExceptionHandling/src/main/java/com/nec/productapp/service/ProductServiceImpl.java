package com.nec.productapp.service;

import java.util.List;
import java.util.Optional;

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
		repo.save(product);
		return "Product Saved ....";
	}

	@Override
	public Product updateProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public String deleteProduct(int productId) {
		repo.deleteById(productId);
		return "Deleted Successfully";
	}

	@Override
	public Product getProduct(int productId) {
		Optional<Product> optional = repo.findById(productId);
		return optional.get();
	}

	@Override
	public List<Product> getProductsByCategory(String productCategory) {

		return repo.findByProductCategory(productCategory);
	}

	@Override
	public List<Product> getAllProducts() {

		return repo.findAll();
	}

	@Override
	public List<Product> getAllProductsBetweenPrice(int intialPrice, int finalPrice) {

		return repo.findByProductPriceBetween(intialPrice, finalPrice);
	}

}
