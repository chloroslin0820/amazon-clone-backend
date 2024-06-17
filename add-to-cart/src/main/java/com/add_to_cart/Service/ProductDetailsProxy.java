package com.add_to_cart.Service;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.add_to_cart.Entity.Product;

@FeignClient(name="product-detail-service", url="localhost:8082")
public interface ProductDetailsProxy {
	
	@GetMapping("/amazon/products/search/{productId}")
	public Product getProductById(@PathVariable UUID productId);
}
