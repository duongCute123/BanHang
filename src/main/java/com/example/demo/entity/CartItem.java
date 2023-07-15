package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CartItems")
public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shopingcartId")
	@JsonIgnore
	ShoppingCart shoppingCart;
	@OneToOne
	@JoinColumn(name = "productId")
	@JsonIgnore
	Product product;
	double unitPrice;
	int soLuong;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public CartItem(int id, double unitPrice, int soLuong) {
		super();
		this.id = id;
		this.unitPrice = unitPrice;
		this.soLuong = soLuong;
	}

	public CartItem() {
		
	}

}
