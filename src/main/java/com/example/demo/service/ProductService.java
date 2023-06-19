package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
	List<Product> findAllproduct();
	Product getById(int id);
	void saveProduct(Product product);
	void xoaProduct(int id);
}
