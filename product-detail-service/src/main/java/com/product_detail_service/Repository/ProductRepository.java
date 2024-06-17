package com.product_detail_service.Repository;

import java.math.BigInteger;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.product_detail_service.Entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, BigInteger> {

	Product findByProductId(UUID productId);
}
