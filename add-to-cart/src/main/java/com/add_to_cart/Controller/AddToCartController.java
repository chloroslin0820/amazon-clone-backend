package com.add_to_cart.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.add_to_cart.Entity.Cart;
import com.add_to_cart.Entity.CartDetails;
import com.add_to_cart.Service.AddToCartService;

@RestController
@RequestMapping("/amazon/add_to_cart")
public class AddToCartController {
	
	@Autowired
	AddToCartService addToCartService;
	
	@PostMapping("/add")
	public void addToCart(@RequestBody Cart cart) {
		addToCartService.addItemToCartService(cart);
	}
	
	@DeleteMapping("/remove")
	public void removeFromCart(@RequestBody Cart cart) {
		addToCartService.removeItemFromService(cart);
	}
	
	@GetMapping("/show/{userId}")
	public CartDetails showItems(@PathVariable UUID userId) {
		return addToCartService.displayAllProducts(userId);
	}
	
}
