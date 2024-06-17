package com.add_to_cart.Entity;

import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartDetails {
	
	private UUID userId;
	private List<Product> list;
}
