package com.example.demo.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Carts")
public class ShoppingCart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "shopingcartId")
	int id;
	@OneToOne
	@JoinColumn(name = "customerId")
	@JsonIgnore
	Customer customer;
	int soProduct;
	double totalGia;
	@OneToMany(mappedBy = "shoppingCart")
	@JsonIgnore
	Set<CartItem> cartItems;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getSoProduct() {
		return soProduct;
	}

	public void setSoProduct(int soProduct) {
		this.soProduct = soProduct;
	}

	public double getTotalGia() {
		return totalGia;
	}

	public void setTotalGia(double totalGia) {
		this.totalGia = totalGia;
	}

	public Set<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(Set<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public ShoppingCart(int id, int soProduct, double totalGia) {
		super();
		this.id = id;
		this.soProduct = soProduct;
		this.totalGia = totalGia;
	}

	public ShoppingCart() {
		super();
	}
	

}