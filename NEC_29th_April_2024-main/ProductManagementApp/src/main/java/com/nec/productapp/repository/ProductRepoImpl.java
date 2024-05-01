package com.nec.productapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nec.productapp.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class ProductRepoImpl implements ProductRepo {
	@PersistenceContext
	EntityManager entityManager;// persist,merge,remove,find,createQuery()

	@Override
	public String addProduct(Product product) {
		entityManager.persist(product);
		return "Product Saved Successfully";
	}

	@Override
	public String updateProduct(Product product) {
		entityManager.merge(product);
		return "product updated successfully";
	}

	@Override
	public String deleteProduct(int productId) {
		entityManager.remove(getProduct(productId));
		return "product deleted successfully";
	}

	@Override
	public Product getProduct(int productId) {

		return entityManager.find(Product.class, productId);// 1 record
	}

	@Override
	public List<Product> getAllProducts() {// JPQL-->db independent
		TypedQuery<Product> products = entityManager.createQuery("select p from Product p", Product.class);
		return products.getResultList();
	}

	@Override
	public List<Product> getProductsByCategory(String productCategory) {
		TypedQuery<Product> products = entityManager.createQuery("select p from Product p where p.productCategory=?1",
				Product.class);
		products.setParameter(1, productCategory);
		return products.getResultList();
	}

	@Override
	public List<Product> getAllProductsBetweenPrice(int intialPrice, int finalPrice) {
		TypedQuery<Product> products = entityManager.createQuery("select p from Product p where p.productPrice between ?1 and ?2", Product.class);
							products.setParameter(1,intialPrice);
							products.setParameter(2, finalPrice);
		return products.getResultList();
	}

}
