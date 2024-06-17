package com.add_to_cart.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.add_to_cart.Entity.Cart;
import com.add_to_cart.Entity.CartDetails;
import com.add_to_cart.Entity.Product;
import com.add_to_cart.Repository.AddToCartRepository;

@Service
public class AddToCartService {
	
	@Autowired
	AddToCartRepository addToCartRepository;
	
	@Autowired
	ProductDetailsProxy productDetailsProxy;
	
	public void addItemToCartService(Cart cart) {
		addToCartRepository.save(cart);
	}
	
	public void removeItemFromService(Cart cart) {
		addToCartRepository.delete(cart);
	}
	
	public CartDetails displayAllProducts(UUID userId) {
		CartDetails cartDetails = new CartDetails();
		cartDetails.setUserId(userId);
		
		List<Cart> cartList = addToCartRepository.findByUserId(userId);
		List<Product> productList = new ArrayList<Product>();
		
		for (int i = 0; i < cartList.size(); i++) {
			Product product = productDetailsProxy.getProductById(cartList.get(i).getProductId());
			productList.add(product);		}
		
		cartDetails.setList(productList);
		
		return cartDetails;
	}
}
