package com.product_detail_service.Entity;

import java.math.BigInteger;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product_details")
public class Product {

	@Id
	private BigInteger id;
	
	private UUID productId;
	private String name;
	private double price;
	private double rating;
	private String imageUrl;
	
	public Product() {
		super();
	}

	public Product(BigInteger id, UUID productId, String name, double price, double rating, String imageUrl) {
		super();
		this.id = id;
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.imageUrl = imageUrl;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public UUID getProductId() {
		return productId;
	}

	public void setProductId(UUID productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
