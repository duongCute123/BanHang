package com.example.demo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CartItem;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Product;
import com.example.demo.entity.ShoppingCart;
import com.example.demo.reponsetori.CartItemReponsetory;
import com.example.demo.reponsetori.ShoppingCartReponsetory;

@Service
public class ShoppingCartServiceImlp implements ShoppingCartService {
	ShoppingCartReponsetory shoppingCartReponsetory;
	CartItemReponsetory cartItemReponsetory;
	@Autowired
	CustomerService customerService;

	@Autowired
	public ShoppingCartServiceImlp(ShoppingCartReponsetory theShoppingCartReponsetory,
			CartItemReponsetory theCartItemReponsetory) {
		shoppingCartReponsetory = theShoppingCartReponsetory;
		cartItemReponsetory = theCartItemReponsetory;
	}

	@Override
	public ShoppingCart addItemToCart(Product productDto, int quantity, int id) {
		Customer customer = customerService.findByIdCustomer(id);
		ShoppingCart shoppingCart = customer.getShoppingCart();
		if (shoppingCart == null) {
			shoppingCart = new ShoppingCart();
		}
		Set<CartItem> cartItems = shoppingCart.getCartItems();
		CartItem cartItem = find(cartItems, productDto.getId());
		Product product = transfer(productDto);
		double unitpice = productDto.getGia();
		int itemQuantity = 0;
		if (cartItems == null) {
			cartItems = new HashSet<>();
			if (cartItem == null) {
				cartItem = new CartItem();
				cartItem.setProduct(product);
				cartItem.setShoppingCart(shoppingCart);
				cartItem.setSoLuong(quantity);
				cartItem.setUnitPrice(unitpice);
				cartItem.setShoppingCart(shoppingCart);
				cartItems.add(cartItem);
				cartItemReponsetory.save(cartItem);
			} else {
				itemQuantity = cartItem.getSoLuong() + quantity;
				cartItem.setSoLuong(itemQuantity);
				cartItemReponsetory.save(cartItem);
			}
		} else {
			if (cartItem == null) {
				cartItem = new CartItem();
				cartItem.setProduct(product);
				cartItem.setShoppingCart(shoppingCart);
				cartItem.setSoLuong(quantity);
				cartItem.setUnitPrice(unitpice);
				cartItem.setShoppingCart(shoppingCart);
				cartItems.add(cartItem);
				cartItemReponsetory.save(cartItem);
			} else {
				itemQuantity = cartItem.getSoLuong() + quantity;
				cartItem.setSoLuong(itemQuantity);
				cartItemReponsetory.save(cartItem);
			}
		}
		shoppingCart.setCartItems(cartItems);
		double toatlGia = toatalPrice(shoppingCart.getCartItems());
		int totalItem = totalItem(shoppingCart.getSoProduct());
		shoppingCart.setTotalGia(toatlGia);
		shoppingCart.setSoProduct(totalItem);
		shoppingCart.setCustomer(customer);
		return shoppingCartReponsetory.save(shoppingCart);
	}

	private int  totalItem(int soProduct) {
		// TODO Auto-generated method stub
		return 0;
	}

	private double toatalPrice(Set<CartItem> cartItems) {
		// TODO Auto-generated method stub
		return 0;
	}

	private Product transfer(Product productDto) {
		// TODO Auto-generated method stub
		return null;
	}

	private CartItem find(Set<CartItem> cartItems, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoppingCart updateCart(Product productDto, int quantity, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoppingCart removeItemFromCart(Product productDto, String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoppingCart addItemToCartSession(ShoppingCart cartDto, Product productDto, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoppingCart updateCartSession(ShoppingCart cartDto, Product productDto, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoppingCart removeItemFromCartSession(ShoppingCart cartDto, Product productDto, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoppingCart combineCart(ShoppingCart cartDto, ShoppingCart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCartById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public ShoppingCart getCart(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
