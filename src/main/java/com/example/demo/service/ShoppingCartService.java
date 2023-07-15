package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.entity.ShoppingCart;

public interface ShoppingCartService {
	ShoppingCart addItemToCart(Product productDto, int quantity, int  id);

	ShoppingCart updateCart(Product productDto, int quantity, int  id);

	ShoppingCart removeItemFromCart(Product productDto, String username);

	ShoppingCart addItemToCartSession(ShoppingCart cartDto, Product productDto, int quantity);

	ShoppingCart updateCartSession(ShoppingCart cartDto, Product productDto, int quantity);

	ShoppingCart removeItemFromCartSession(ShoppingCart cartDto, Product productDto, int quantity);

	ShoppingCart combineCart(ShoppingCart cartDto, ShoppingCart cart);

	void deleteCartById(Long id);

	ShoppingCart getCart(String username);
}
