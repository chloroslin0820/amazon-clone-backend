package com.product_detail_service.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product_detail_service.Entity.Product;
import com.product_detail_service.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public Product saveDataToDB(Product product) {
		product.setProductId(UUID.randomUUID());
		return productRepository.save(product);
	}
	
	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}
	
	public Product getProductDetails(UUID productId) {
		return productRepository.findByProductId(productId);
	}
}
