package com.add_to_cart.Entity;

import java.math.BigInteger;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
	
	private BigInteger id;
	
	private UUID productId;
	private String name;
	private double price;
	private double rating;
	private String imageUrl;
}
