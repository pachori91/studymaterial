package com.nec.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nec.productapp.entity.Product;
import com.nec.productapp.service.ProductService;

//{
//    "productName":"samsungtv",
//    "productPrice":9000,
//    "productCategory":"electronics"
//}
@RestController
@RequestMapping("/products")
public class ProductController {// get,post,put,delete
	@Autowired
	ProductService service;

	@PostMapping("/insert") // http://localhost:1212/products/insert
	public String addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}

	@PutMapping("/update") // http://localhost:1212/products/update
	public String updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}

	@DeleteMapping("/delete/{pid}") // http://localhost:1212/products/delete/123
	public String deleteProduct(@PathVariable("pid") int productId) {
		return service.deleteProduct(productId);
	}

	@GetMapping("/find/{pid}") // http://localhost:1212/products/find/123
	public Product getProduct(@PathVariable("pid") int productId) {
		return service.getProduct(productId);
	}

	@GetMapping("/getByCategory/{category}")// http://localhost:1212/products/getByCategory/electronics
	public List<Product> getProductsByCategory(@PathVariable("category") String productCategory) {
		return service.getProductsByCategory(productCategory);
	}
	@GetMapping("/getAll")// http://localhost:1212/products/getAll
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	@GetMapping("/getByPrice/{ip}/{fp}")// http://localhost:1212/products/getByPrice/1200/15000
	public List<Product> getAllProductsBetweenPrice(@PathVariable("ip") int intialPrice, @PathVariable("fp") int finalPrice) {
		return service.getAllProductsBetweenPrice(intialPrice, finalPrice);
	}

}
