package com.example.demo.reponsetori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.CartItem;

public interface CartItemReponsetory extends JpaRepository<CartItem, Integer> {
	@Query(value = "update cart_items set shopping_cart_id = null where shopping_cart_id = ?1", nativeQuery = true)
	void deleteCartItemById(Long cartId);
}
