package com.add_to_cart.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.add_to_cart.Entity.Cart;

@Repository
public interface AddToCartRepository extends CrudRepository<Cart, Long> {

	List<Cart> findByUserId(UUID userId);
}
